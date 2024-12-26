package socket;

	import java.io.*;
	import java.net.*;

	public class server {
	    public static void main(String[] args) {
	        try (ServerSocket serverSocket = new ServerSocket(12356)) {
	            System.out.println("Server started, waiting for client...");

	            
	            Socket clientSocket = serverSocket.accept();
	            System.out.println("Client connected.");

	            
	            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	            out.println("Hello, Client!");

	            
	            clientSocket.close();
	        } catch (IOException e) {
	            System.err.println("Server exception: " + e.getMessage());
	        }
	    }
	}



