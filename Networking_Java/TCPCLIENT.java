import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 5000);

            DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
            dos.writeUTF("Hello Server!");
            
            DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
            String response = dis.readUTF();
            System.out.println("Server says: " + response);

            dis.close();
            dos.close();
            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}