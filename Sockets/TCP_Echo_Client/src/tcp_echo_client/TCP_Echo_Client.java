package tcp_echo_client;
import java.io.*;
import java.net.*;
import java.util.*;

public class TCP_Echo_Client
{
    private static InetAddress host;
    private static final int PORT = 1234;
    
    public static void main(String[] args)
    {
        try
        {
            host = InetAddress.getLocalHost();
        }
        catch(UnknownHostException e)
        {
            System.out.println("Unknown ID, not found");
            System.exit(1);
        }
        sendMessages();  
    }
    
    public static void sendMessages()
    {
        Socket socket = null;
        try
        {
            socket = new Socket(host,PORT);
            Scanner networkInput =
                    new Scanner(socket.getInputStream());
            PrintWriter networkOutput =
                    new PrintWriter(socket.getOutputStream(),true);
            Scanner userEntry = new Scanner(System.in);
            String message, response;
            do
            {
                System.out.println("Enter message ('QUIT' to exit: ");
                message = userEntry.nextLine();
                networkOutput.println(message);
                response = networkInput.nextLine();
                System.out.println("\nSERVER> " + response);
            } while (!message.equals("QUIT"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                System.out.println("\nClosing connection...");
                socket.close();
            }
            catch(IOException e)
            {
                System.out.println("Unable to disconnet!");
                System.exit(1);
            }
        }
        
    }
}