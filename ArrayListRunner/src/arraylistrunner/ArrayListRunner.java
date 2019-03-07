package arraylistrunner;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRunner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));
        contains(names, "Stella");
        System.out.println("Please enter a name to search for: ");
        String nameSearch = in.nextLine();
        contains(names, nameSearch);
        names.add(names.indexOf("David") + 1, "Doug");
        names.set(names.indexOf("Alice"), "Alice B");
        names.remove(names.get(names.size() - 1));
        System.out.println(names);
    }
    
    public static void contains(ArrayList a, String name)
    {
        if (a.contains(name))
        {
            System.out.println(name + " is in the list!");
            System.out.println("This persons position is: " + a.indexOf(name));
        } else
        {
            System.out.println(name + " is not in the list!");
        }
    }
}
