import java.io.IOException;
import java.net.*;

public class MulticastChatServer {
    public static void main(String[] args) {

        try {
            // Default port number we are going to use
            int portNumber = 5000;
            if (args.length >= 1) {
                portNumber = Integer.parseInt(args[0]);
            }

            // Create a MulticastSocket
            MulticastSocket serverMulticastSocket = new MulticastSocket(portNumber);
            System.out.println("MulticastSocket is created at port " + portNumber);

            // Determine he IP address of a host, given the host time
        } catch(IOException ie) {

        }
    }
}