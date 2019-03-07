/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatthing;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class ChatThing 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        Socket destSock = null;
        Socket thisSock = null;
        ServerSocket server = null;
        String destIP;
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();  
        } catch (UnknownHostException ex) {
            System.out.println("Couldn't get IP Address.");
        } 
        String thisIP = inetAddress.getHostAddress();  
        
        PrintWriter out = null;
        BufferedReader in = null;

        Scanner reader = new Scanner(System.in);
        boolean listening = true;
        String name;
        System.out.println("Your IP is: " + thisIP);
                
        System.out.println("What is your name?");
        name = reader.next();
        
        System.out.println("Enter destination IP:");
        destIP = reader.next();
        System.out.println("Enter destination Socket:");
        String sock = reader.next();
        System.out.println("Enter Socket to listen on:");
        String servSock = reader.next();
        
        
            try {
            server = new ServerSocket(Integer.parseInt(servSock));
            System.out.println("Server started on port: " + servSock);
            } catch (UnknownHostException e) {
            System.err.println("Don't know about host: " + thisIP);
            System.exit(1);
            } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: " + thisIP);
            System.exit(1);
            }
            
          try {
            destSock = new Socket(destIP, Integer.parseInt(sock));
            out = new PrintWriter(destSock.getOutputStream(), true);
            System.out.println("Connected to: " + sock + " at " + destIP);
            } catch (UnknownHostException e) {
            //System.err.println("Don't know about host: " + thisIP);
            //System.exit(1);
            } catch (IOException e) {
            //System.err.println("Couldn't get I/O for the connection to: " + thisIP);
            //System.exit(1);
            }  
        
        //boolean wait1 = true;
        while (thisSock == null)
        {
            thisSock = server.accept();
            if (thisSock != null)
            {
                in = new BufferedReader(new InputStreamReader(thisSock.getInputStream()));
                //wait1 = false;
            }
            
            if (destSock == null)
            {
                try {
                destSock = new Socket(destIP, Integer.parseInt(sock));
                out = new PrintWriter(destSock.getOutputStream(), true);
                System.out.println("Connected to: " + sock + " at " + destIP);
                } catch (UnknownHostException e) {
                System.err.println("Don't know about host: " + thisIP);
                System.exit(1);
                } catch (IOException e) {
                System.err.println("Couldn't get I/O for the connection to: " + thisIP);
                System.exit(1);
                }
            }
        }  
        
        System.out.println("Connected.");
        BufferedReader readIn = new BufferedReader(new InputStreamReader(System.in));
        
        while (listening)
        {
            if (in.ready()) 
            {
                String fromServer = in.readLine();
                System.out.println(fromServer);
            }
            if (readIn.ready())
            {
                String fromUser = readIn.readLine();
                if (fromUser.toUpperCase().equals("ZZZ"))
                {
                    out.println(name + " has logger off.");
                    listening = false;
                }
                else
                {
                    out.println(name + ": " + fromUser);
                }
            }
        }
        
        in.close();
        out.close();
        readIn.close();
        thisSock.close();
        destSock.close();
        server.close();
        System.exit(0);
    }
}
