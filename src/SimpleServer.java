import java.net.*;
import java.io.*;

public class SimpleServer {

	private ServerSocket listenSocket = null;
	private Socket connectSocket = null;

	public Socket getConnectSocket() {
		return connectSocket;
	}

	public SimpleServer(int portNo) {
		// add your code
	}

	public static void main(String[] args) throws IOException {

		int portNo;
		File outputFile;
		File dir = new File(".");

		if (args.length > 0) {
			portNo = Integer.parseInt(args[0]);
		} else {
			portNo = 10000;
		}
		if (args.length == 2) {
			outputFile = new File(args[1]);
		} else {
			outputFile = new File(dir.getCanonicalPath() + File.separator + "Files/testOutput");
		}
		OutputWriter out = new OutputWriter(outputFile);

		SimpleServer testServer = new SimpleServer(portNo);

		/* DO NOT CHANGE ABOVE THIS LINE in MAIN method other than the following values
		 * portNo can be changed to any number between 10000 and 11000
		 */

		/*
		 * Your code goes below. You can define new methods as necessary.
		 * 
		 * NOTE: You must use out.writeoutput method to write to the output
		 * file. The syntax is writeOutput(String line)
		 */
	}
}
