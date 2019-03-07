/*
 * This program prints our the prime numbers of an integer.
 */
package Chapter4;

import java.util.*;

public class Problem18
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Read input
        System.out.println("Enter a number:");
        int number = in.nextInt();
        
        // Output to show prime numbers
        System.out.println("The prime numbers of " + number + " are:");
        for (int n = 1; n < number; n++)
        {
            boolean isPrime = true;
            
            // Test for prime
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.println(n);
            }
        }
    }
}
