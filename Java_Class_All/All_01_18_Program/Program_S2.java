// package All_01_18_Program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Program_S2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5999);
            System.out.println("TCP Server is waiting for connections...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected to client: " + clientSocket.getInetAddress());

                // Read data from client
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String clientMessage = reader.readLine();
                System.out.println("Received from client: " + clientMessage);

                // Send response to client
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                writer.write("Hello from TCP Server!");
                writer.newLine();
                writer.flush();

                // Close the connection
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
