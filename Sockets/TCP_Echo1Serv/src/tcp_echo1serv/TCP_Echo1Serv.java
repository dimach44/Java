package tcp_echo1serv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;


public class TCP_Echo1Serv
{
    private static ServerSocket servSocket;
    private static final int PORT = 1234;
    
    public static void main(String[] args)
    {
        System.out.println("Opening port ...");
        try
        {
            servSocket = new ServerSocket(PORT);
        }
        catch(IOException e)
                {
                    System.out.println("Not able to attach to port.");
                }
        do
        {
            run();
        } while (true);
    }
    
    public static void run()
    {
        Socket link = null;
        try
        {
            link = servSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(link.getInputStream()));
            PrintWriter out = new PrintWriter(
                link.getOutputStream(),true);
            int numMessages = 0;
            String message = in.readLine();
            while (!message.equals("***CLOSE***"))
            {
                System.out.println("Message received.");
                numMessages++;
                out.println("Message " + numMessages + ": " + message);
                message=in.readLine();
            }
            out.println(numMessages + " messages received");
        }
        catch (IOException e)
        {
            e.printStackTrace();
            
        }
        finally
        {
            try{
                System.out.println("* Closing connection... *");
                link.close();
            }
            catch(IOException e)
            {
                System.out.println("Unable to disconnect!");
                System.exit(1);
            }
        }
    }
    
}
