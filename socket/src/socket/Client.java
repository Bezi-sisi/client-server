package socket;
    import java.io.*;
	import java.net.*;

	public class Client {
	    public static void main(String[] args) {
	        try (Socket socket = new Socket("localhost", 12356)) {
	          
	            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            String message = in.readLine();
	            System.out.println("Received from server: " + message);
	        } catch (IOException e) {
	            System.out.println("Client exception: " + e.getMessage());
	        }
	    }
	}



