// package All_01_18_Program;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Program_C3 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();

            // Send data to server
            String message = "Hello from UDP Client!";
            byte[] sendData = message.getBytes();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            socket.send(sendPacket);

            // Receive response from server
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from server: " + serverResponse);

            // Close the socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
