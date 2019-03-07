/**
 * The program asks for a few numbers then prints out information.
 */
package Chapter4;

import java.util.Scanner;

public class Problem5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Setup array
        System.out.println("How many numbers are you enterting?");
        int amount = in.nextInt();
        
        int numbers[] = new int[amount];
        
        // Read number inputs
        System.out.println("Please enter " + amount + " numbers: ");
        for (int n = 0; n < numbers.length; n++)
        {
            numbers[n] = in.nextInt();
        }
        
        // Average
        int sum = 0;
        for (int n = 0; n < numbers.length; n++)
        {
            sum += n;
        }
        System.out.println("Average of the numbers: " + sum / numbers.length);
        
        // Smallest/Largest number
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int n = 0; n < numbers.length; n++)
        {
            if (numbers[n] < smallest)
            {
                smallest = numbers[n];
            }
            if (numbers[n] > largest)
            {
                largest = numbers[n];
            }
        }
        System.out.println("Smallest Number is: " + smallest);
        System.out.println("Largest Number is: " + largest);
        
        // Range
        System.out.println("The Range is: " + (largest - smallest));
    }
}
