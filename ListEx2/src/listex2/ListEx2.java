package listex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class ListEx2
{
    public static void main(String[] args)
    {
        ArrayList<Double> arr = new ArrayList<Double>();
        String element = arr.get(0);
        LinkedList names = new LinkedList();
        names.add("John");
        names.add("Bill");
        names.add("Jane");
        names.add("Michael");
        names.add("Diana");
        names.add("Wilhelmina");

        contains(names, "George");
        contains(names, "Jane");

        printList(names);

        System.out.println("The element number of Jane is: "
                + names.indexOf("Jane"));
        System.out.println("Jane appears in the list "
                + occurrences(names, "Jane") + " time/s.");
        ListIterator itr = names.listIterator();
        System.out.println("Iterator is initially placed at: " + itr.next());
        itr.next(); // 2nd advancement
        
        itr.add("Jane");
        for (int i = 0; i < names.size(); i++)
        {
            if (names.indexOf("Jane") == i)
            {
                names.set(i, "Joan");
            }
        }
        if (listReplace(names, "Joan", "Jen") > 0)
        {
            System.out.println("Modified List of names:");
            printList(names);
        }
        else
        {
            System.out.println("No entries were found.");
        }
    }
    public static void contains(LinkedList l, String name)
    {
        if (l.contains(name))
        {
            System.out.println(name + " is in the list!");
        } else
        {
            System.out.println(name + " is not in the list!");
        }
    }
    public static void printList(LinkedList l)
    {
        for (int i = 0; i < l.size(); i++)
        {
            if (i == 0)
            {
                System.out.print(l.get(i));
            } else
            {
                System.out.print(", " + l.get(i));
            }
        }
        System.out.println();
    }
    public static int occurrences(LinkedList l, String name)
    {
        return Collections.frequency(l, name);
    }
    public static int listReplace(LinkedList l, String f, String r)
    {
        int numReplaced = 0;
        for (int i = 0; i < l.size(); i++)
        {
            if (l.indexOf(f) == i)
            {
                l.set(i, r);
                numReplaced++;
            }
        }
        return numReplaced;
    }
}
