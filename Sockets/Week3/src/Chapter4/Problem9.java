/**
 * This program reads a word and prints it in reverse.
 */
package Chapter4;

import java.util.Scanner;

public class Problem9 {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Read Input
        System.out.println("Enter Word To Be Reversed: ");
        String word = in.next();
        
        // Reverse
        System.out.println(new StringBuilder(word).reverse());
    }
}
