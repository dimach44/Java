package tcp_echo_serv_threaded;
import java.io.*;
import java.net.*;
import java.util.*;


public class TCP_Echo_Serv_Threaded
{
    private static ServerSocket serverSocket;
    private static final int PORT=1234;

    public static void main(String[] args)
            throws IOException
    {
        try
        {
            serverSocket = new ServerSocket(PORT);
        }
        catch (IOException e)
        {
            System.out.println("\nUnable to set up port");
            System.exit(1);
        }
        do
        {
            Socket client = serverSocket.accept();
            System.out.println("New client accepted.");
            ClientHandler handler = new ClientHandler(client);
            handler.start();
        } while (true);
    }
}
class ClientHandler extends Thread
{
    private Socket client;
    private Scanner input;
    private PrintWriter output;
    
    public ClientHandler(Socket socket)
    {
        client = socket;
        try
        {
            input  = new Scanner(client.getInputStream());
            output = new PrintWriter(client.getOutputStream(),true);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void run()
    {
        String received = null;
        do
        {
            received = input.nextLine();
            output.println("ECHO: " + received);
            
        } while (!received.equals("QUIT"));
        try
        {
            System.out.println("Closing down connection...");
            client.close();
        }
        catch (IOException e)
        {
            System.out.println("Unable to disconnet!");
        }
        
    }
    
}