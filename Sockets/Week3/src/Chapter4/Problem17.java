/*
 * This program shows all the factors for a certain integer.
 */
package Chapter4;

import java.util.*;

public class Problem17
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Read input
        System.out.println("Enter a number:");
        int number = in.nextInt();
        
        // Output see if its a prime factor
        System.out.println("The prime factors of " + number + " are:");
        for (int n = 2; n > 1;)
            if (number % n == 0)
            {
                System.out.println(n);
                number = number / n;
            }
            else n++;
    }
}
