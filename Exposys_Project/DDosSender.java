// import java.io.IOException;
// import java.io.OutputStream;
// import java.net.Socket;
// import java.net.UnknownHostException;

// public class DDosSender {
//     private static final String SERVER_IP = "192.168.137.1";  // Localhost IP address
//     private static final int SERVER_PORT = 8080;          // Port number matching SimpleServer

//     public static void main(String[] args) throws InterruptedException {
//         try {
//             Socket socket = new Socket(SERVER_IP, SERVER_PORT);
//             System.out.println("Connected to server.");

//             // Choose the method to send packets
//             // sendPackets(socket);
//             sendPacketsWithDelay(socket);

//             socket.close();
//             System.out.println("Connection closed.");
//         } catch (UnknownHostException e) {
//             System.err.println("Unknown host: " + e.getMessage());
//         } catch (IOException e) {
//             System.err.println("I/O error: " + e.getMessage());
//         } 
//     }

//     private static void sendPackets(Socket socket) throws IOException {
//         OutputStream outputStream = socket.getOutputStream();

//         // Simulate sending packets in a loop
//         for (int i = 0; i < 1000; i++) {
//             String packetData = "Packet " + i + " Received.";
//             byte[] packetBytes = packetData.getBytes();

//             outputStream.write(packetBytes);
//             outputStream.flush();  // Ensure data is sent immediately
//         }
//     }

//     // Optional: Example of adding a delay between packet sends
//     private static void sendPacketsWithDelay(Socket socket) throws IOException, InterruptedException {
//         OutputStream outputStream = socket.getOutputStream();

//         for (int i = 0; i < 100; i++) {
//             String packetData = "Packet " + i + " Received.";
//             byte[] packetBytes = packetData.getBytes();

//             outputStream.write(packetBytes);
//             outputStream.flush();

//             Thread.sleep(10);  // Introduce a delay of 10 milliseconds between packets
//         }
//     }
// }





// import java.io.IOException;
// import java.io.OutputStream;
// import java.net.Socket;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class DDosSender {
//     private static final String SERVER_IP = "127.0.0.1";  // Use localhost for testing on the same machine
//     private static final int SERVER_PORT = 8080;          // Port number matching SimpleServer

//     public static void main(String[] args) {
//         try {
//             // Connect to server and send packets
//             // ...
//             Socket socket = new Socket(SERVER_IP, SERVER_PORT);
//             System.out.println("Connected to server.");
//             sendPacketsWithDelay(socket);

//             // socket.close();
//             System.out.println("Connection closed.");

//             // After sending packets, calculate entropy
//             // List<String> trafficData = SimpleServer.ClientHandler.getReceivedData_01();
//             // System.out.println(trafficData);

//             List<String> trafficData = null;
//             for (int attempt = 1; attempt <= 10; attempt++) {
//                 trafficData =SimpleServer.getReceivedData();
//                 if (!trafficData.isEmpty()) {
//                     break;
//                 }
//                 System.out.println("Waiting for data, attempt " + attempt);
//                 Thread.sleep(1000);  // Wait for 1 second before retrying
//             }
//             double entropy = calculateEntropy(trafficData);
//             System.out.println("Entropy: " + entropy);

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     private static double calculateEntropy(List<String> data) {
//         // Example calculation of entropy (simplified)
//         // int totalPackets = data.size();
//         // if (totalPackets == 0) {
//         //     return 0.0;  // No data received
//         // }

//         // Count occurrences of each packet type or pattern
//         // For simplicity, let's assume we're counting unique packets
//         // You may need more sophisticated logic depending on your data

//         // Example: Count occurrences of each unique packet
//         // Map<String, Integer> packetCounts = new HashMap<>();
//         // for (String packet : data) {
//         //     packetCounts.put(packet, packetCounts.getOrDefault(packet, 0) + 1);
//         // }

//         // Calculate entropy based on packet counts
//         // double entropy = 0.0;
//         // for (int count : packetCounts.values()) {
//         //     double probability = (double) count / totalPackets;
//         //     entropy -= probability * (Math.log(probability) / Math.log(2));
//         // }

//         // This is a simplified example; adjust based on your actual data and requirements
//         // For real-world use, consider using more robust statistical methods

//         // return entropy;


//         int totalPackets = data.size();
//         if (totalPackets == 0) {
//             return 0.0;  // No data received
//         }
        
//         Map<String, Integer> packetCounts = new HashMap<>();
//         for (String packet : data) {
//             packetCounts.put(packet, packetCounts.getOrDefault(packet, 0) + 1);
//         }
        
//         double entropy = 0.0;
//         for (int count : packetCounts.values()) {
//             double probability = (double) count / totalPackets;
//             entropy -= probability * (Math.log(probability) / Math.log(2));
//         }
        
//         return entropy;
//     }

//     private static void sendPacketsWithDelay(Socket socket) throws IOException, InterruptedException {
//                 OutputStream outputStream = socket.getOutputStream();
        
//                 for (int i = 0; i < 100; i++) {
//                     String packetData = "Packet " + i + " Received.";
//                     byte[] packetBytes = packetData.getBytes();
        
//                     outputStream.write(packetBytes);
//                     outputStream.flush();
        
//                     Thread.sleep(10);  // Introduce a delay of 10 milliseconds between packets
//                 }
//             }


//             private static void sendPackets(Socket socket) throws IOException {
//                         OutputStream outputStream = socket.getOutputStream();
                
//                         // Simulate sending packets in a loop
//                         for (int i = 0; i < 100; i++) {
//                             String packetData = "Packet " + i + " Received.";
//                             byte[] packetBytes = packetData.getBytes();
                
//                             outputStream.write(packetBytes);
//                             outputStream.flush();  // Ensure data is sent immediately
//                         }
//                     }
// }








import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class DDosSender {
    private static final String SERVER_IP = "127.0.0.1";  // Use localhost for testing on the same machine
    private static final int SERVER_PORT = 8080;          // Port number matching SimpleServer
    private static List<String> trafficData =new ArrayList<>();
    public static void main(String[] args) {
        try {
            // Connect to server and send packets
            Socket socket = new Socket(SERVER_IP, SERVER_PORT);
            System.out.println("Connected to server.");
            
            sendPacketsWithDelay(socket);

            // Wait for data to be received by SimpleServer
            // List<String> trafficData = null;
            // for (int attempt = 1; attempt <= 10; attempt++) {
            //     trafficData = SimpleServer.getReceivedData();
            //     if (!trafficData.isEmpty()) {
            //         break;
            //     }
            //     System.out.println("Waiting for data, attempt " + attempt);
            //     Thread.sleep(1000);  // Wait for 1 second before retrying
            // }

            double entropy = calculateEntropy(trafficData);
            System.out.println("Entropy: " + entropy);

            socket.close();  // Close the socket after data retrieval
            System.out.println("Connection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double calculateEntropy(List<String> data) {
        // Example calculation of entropy (simplified)
        int totalPackets = data.size();
        if (totalPackets == 0) {
            return 0.0;  // No data received
        }
        
        // Calculate entropy based on packet counts or other statistical methods
        // Example logic to be adapted based on actual data characteristics
        // For simplicity, assume uniform distribution of packet types
        double entropy = 0.0;
        double probability = 1.0 / totalPackets;  // Uniform distribution
        entropy = -probability * (Math.log(probability) / Math.log(2));

        return entropy;
    }

    private static void sendPacketsWithDelay(Socket socket) throws IOException, InterruptedException {
        OutputStream outputStream = socket.getOutputStream();
        
        for (int i = 0; i < 1000; i++) {
            String packetData = "Packet " + i + " Received.";
            trafficData.add(packetData);
            byte[] packetBytes = packetData.getBytes();
    
            outputStream.write(packetBytes);
            outputStream.flush();
    
            Thread.sleep(1);  // Introduce a delay of 10 milliseconds between packets
        }
    }
}