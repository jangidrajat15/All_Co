// package All_01_18_Program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Program_C2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",5999);

            // Send data to server
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("Hello from TCP Client!");
            writer.newLine();
            writer.flush();

            // Read response from server
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverResponse = reader.readLine();
            System.out.println("Received from server: " + serverResponse);

            // Close the connection
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
