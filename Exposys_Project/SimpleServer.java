// import java.io.IOException;
// import java.io.InputStream;
// import java.net.ServerSocket;
// import java.net.Socket;

// public class SimpleServer {
//     private static final int SERVER_PORT = 8080;

//     public static void main(String[] args) {
//         try {
//             ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
//             System.out.println("Server started. Waiting for clients...");

//             while (true) {
//                 Socket clientSocket = serverSocket.accept();
//                 System.out.println("Client connected: " + clientSocket.getInetAddress());

//                 // Handle client connection in a separate thread
//                 Thread clientHandler = new Thread(new ClientHandler(clientSocket));
//                 clientHandler.start();
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     private static class ClientHandler implements Runnable {
//         private final Socket clientSocket;

//         public ClientHandler(Socket clientSocket) {
//             this.clientSocket = clientSocket;
//         }

//         @Override
//         public void run() {
//             try {
//                 InputStream inputStream = clientSocket.getInputStream();
//                 byte[] buffer = new byte[1024];
//                 int bytesRead;

//                 while ((bytesRead = inputStream.read(buffer)) != -1) {
//                     String receivedData = new String(buffer, 0, bytesRead);
//                     System.out.println("Received from client: " + receivedData);
//                 }

//                 inputStream.close();
//                 clientSocket.close();
//                 System.out.println("Client disconnected.");
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SimpleServer {
    private static List<String> tempList = new ArrayList<>();
    private static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // Handle client connection in a separate thread
                Thread clientHandler = new Thread(new ClientHandler(clientSocket));
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized List<String> getReceivedData() {
        return new ArrayList<>(tempList);  // Return a copy to ensure thread safety
    }

    public static class ClientHandler implements Runnable {
        private final Socket clientSocket;

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try {
                InputStream inputStream = clientSocket.getInputStream();
                byte[] buffer = new byte[1024];
                int bytesRead;

                StringBuilder sb = new StringBuilder();
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    String receivedDataChunk = new String(buffer, 0, bytesRead);
                    sb.append(receivedDataChunk);
                }

                String fullData = sb.toString().trim();  // Trim any extra whitespace
                tempList.add(fullData);  // Store received data
                System.out.println("Received data: " + tempList);
                inputStream.close();
                clientSocket.close();
                System.out.println("Client disconnected.");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
