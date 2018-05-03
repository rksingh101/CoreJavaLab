package xeon;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Exchange {
	public static void main(String[] args) throws IOException {
		
		ServerSocket service = new ServerSocket(1000);
	
		System.out.println("Waiting for client connection");
		
		while(true){
	      final Socket clientSocket = service.accept();
			
//			System.out.println("Client is now connected");
//			System.out.println(clientSocket);
			
    	new Thread(
    		new Runnable() {
			public void run() {
					
			try {
			
			BufferedReader in = new BufferedReader(new InputStreamReader(
                        clientSocket.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) 
             System.out.println(inputLine);
            // in.close();
			
							
							
		    OutputStream out = clientSocket.getOutputStream();
							
			PrintWriter pOut = new PrintWriter(out,true);
			System.out.println("sending response "+ clientSocket);
							
			pOut.println("HTTP/1.1 200 Ok");
			pOut.println();
			pOut.println("Hi, Received!");
			pOut.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						
						
					}
				}
	).start();
		}
	}
}
