/*
 * This program prints all substrings of a word sorted by length.
 */
package Chapter4;

import java.util.*;

public class Problem12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word, subString;
        int i, n, length;
        
        // Define array and read input
        ArrayList<String> ar = new ArrayList<String>();
        
        System.out.println("Enter a word to view all substrings");
        word = in.next();
        length = word.length();
        
        System.out.println("Substrings of " + word + " are:");
        
        // start with substring indexed from 0, 1 and repeat till last length
        for (n = 0; n < length; n++)
        {
            for (i = 1; i <= length - n; i++)
            {
                subString = word.substring(n, n+i);
                ar.add(subString);
            }
        }
        
        // Sort the strings in the array by length (To class)
        Collections.sort(ar, new MyComparator());
        System.out.println(ar);
    }
}
// class for the sorting
class MyComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {  
      if (o1.length() > o2.length()) {
         return 1;
      } else if (o1.length() < o2.length()) {
         return -1;
      }
      return o1.compareTo(o2);
    }
}