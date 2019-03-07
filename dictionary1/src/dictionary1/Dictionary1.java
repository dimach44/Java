package dictionary1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary1
{
    static Dictionary _d = new Hashtable();
    
    public static void main(String[] args) throws IOException
    {
        readFile("C:/Users/CompSci/Documents/JobQueue/wordlist.txt");
    }
    
    public static void readFile(String file) throws IOException
    {
        System.out.println("Reading text file...");
        
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        String line;
        int index = 0;
        long startTime = System.currentTimeMillis();
        while ((line = reader.readLine()) != null)
        {
            _d.put(index++, line.split(" ")[0]);
            System.out.println(line.split(" ")[0]);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;
        System.out.println("Total time taken to load file: " + totalTime + "s");
    }
}
