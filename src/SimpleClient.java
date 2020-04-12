import java.awt.*;
import java.net.*;
import java.nio.file.Files;
import java.io.*;
import java.util.*;
import java.util.List;

public class SimpleClient {

	private PrintWriter printWriter;
	private Socket socket = null;

	public SimpleClient(String serverAddress, int portNo) {
		// Your code goes here
		try{
			socket = new Socket(serverAddress,portNo);
			printWriter = new PrintWriter(socket.getOutputStream(), true);
		}
		catch (IOException i){
			System.out.println("Error connecting to the Sever ");
			System.out.println(i);
		}
	}

	public void sendMessage(List<String> lines) {
		for(String s: lines){
			printWriter.println(s);
		}
	}

	public void close(){
		try {
			printWriter.close();
			socket.close();
		}
		catch (IOException i){
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws IOException {

		File inputFile;
		File dir = new File(".");

		String serverIPAddr;
		int portNo;

		SimpleClient client;

		if (args.length > 2) {
			serverIPAddr = args[0];
			portNo = Integer.parseInt(args[1]);
			inputFile = new File(args[2]);
		} else {
			serverIPAddr = "127.0.0.1";
			portNo = 10000;
			inputFile = new File(dir.getCanonicalPath() + File.separator + "Files/testInput.txt");

		}

		/* Read the data from File into an ArrayList */
		List<String> lines = Files.readAllLines(inputFile.toPath());

		client = new SimpleClient(serverIPAddr, portNo);

		/*
		 * DO NOT CHANGE ABOVE THIS LINE in MAIN method except for the following
		 * serverIPAddr and portNo values can be changed as necessary for
		 * testing
		 **/

		/*
		 * Your code goes below. You can define new methods as necessary.
		 * 
		 * NOTE: You must use out.writeoutput method to write to the output
		 * file. The syntax is writeOutput(String line)
		 */

		client.sendMessage(lines);
		client.close();
	}
}
