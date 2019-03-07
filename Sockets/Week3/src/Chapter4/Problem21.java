/*
 * This program takes a side length and uses it to realign a diamond and change
 * the amount needed.
 */
package Chapter4;

import java.util.*;

public class Problem21
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Read input
        System.out.println("Enter the side length you want: ");
        int sideLength = in.nextInt();
        
        // Access all publics
        Problem21 access = new Problem21();
        access.diamond_res(sideLength);
         
    }

// Method 1
 public String diamond_star(int sideLength)
    {
        if (sideLength>0)
        {
            return "* " + diamond_star(sideLength-1);
        }
        else
        {
            return " ";
        }
    }
 
//Method 2
     public String diamond_star1(int sideLength)
    {
        if (sideLength>0)
        {
            return " * " + diamond_star(sideLength-1);
        }
        else
        {
            return " ";
        }
    }
     
//Method 3
    public String blankSpace(int sideLength)
    {
        if (sideLength>0)
        {
            return " " + blankSpace(sideLength-1);
        }
        else
        {
            return " ";
        }
    }
    
//Method 4
    public void diamond_res(int sideLength)
    {
        for (int i=1; i<sideLength; i++)
        {
            System.out.print(blankSpace(sideLength-i));
            System.out.println(diamond_star(i));
             
        }
         for (int i=0; i<sideLength; i++)
        {
            System.out.println(diamond_star1(sideLength-i));
            System.out.print(blankSpace(i));
        }
      /*
       * I cant figure out how to make it so it duplicates it to the other side.
       * Been on this for the last few days tried to use up all my time to the
       * last minute. I can do the spaces way but this other way is bothering
       * me.
       */
    }
    
}
