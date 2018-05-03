package xeon;

import java.io.IOException;


	import java.io.IOException;
	import java.io.OutputStream;
	import java.io.PrintWriter;
	import java.net.ServerSocket;
	import java.net.Socket;

	public class PingMe {
		public static void main(String[] args) throws IOException {
			
			ServerSocket service = new ServerSocket(8080);
		
			System.out.println("Waiting for client connection");
			
			while(true){
				final Socket clientSocket = service.accept();
				
//				System.out.println("Client is now connected");
//				System.out.println(clientSocket);
				
				new Thread(
							new Runnable() {
								public void run() {
									
									try {
										OutputStream out = clientSocket.getOutputStream();
										
										PrintWriter pOut = new PrintWriter(out,true);
										System.out.println("sending response "+ clientSocket);
										
										pOut.println("HTTP/1.1 200 Ok");
										pOut.println();
										pOut.println("Hello, world!");
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
