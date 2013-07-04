
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

import networking.ChatRoom;

/**
 * A TCP server that runs on port 9090.  When a client connects, it
 * sends the client the current date and time, then closes the
 * connection with that client.  Arguably just about the simplest
 * server you can write.
 */
public class ChatServer {

	static int count = 0;
	static ChatRoom room; 
	
	

	/**
	 * Runs the server.
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(9090); 
		ChatRoom room = new ChatRoom();


		try {
			while (true) {
				Socket socket = listener.accept();
				System.out.println("New connection from " + socket.getInetAddress());
				ChatLink link = new ChatLink(socket, room);
				Thread t = new Thread(/*runnable*/);
				t.start();
			}
		}

		finally {
			listener.close();
		}
	}
}
class ChatLink implements Runnable {
	BufferedReader input;
	PrintWriter output;
	ChatRoom room;
	
	public ChatLink(Socket socket, ChatRoom r){
		try {
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new PrintWriter(socket.getOutputStream());
			room = r;
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		while(true){
			String i;
			try {
				i = input.readLine();
				if ( i != null) {
					String action = i.substring(0, i.indexOf(':'));
					String rest = i.substring(i.indexOf(':') + 1);
					if (action.equals("authenticated")){
						String[] parts = rest.split("@");
						boolean auth = room.authenticate(parts[0], parts[1]);
						output.println("login: " + auth);
					}
					if (action.equals("message")){
						int line = room.addLine(rest);
						System.out.println(rest);
						output.println("line: " + line);
					}
					if (action.equals("line")){
						int number = Integer.parseInt(rest);
						
					}
					
					room.addLine(i);
					System.out.println(i);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
