package enum1;

import java.util.Scanner;

public class Enum1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Please eneter a direction: ");
        s = in.nextLine().toUpperCase();
        System.out.println("Direction is " + s);
        for (Directions d: Directions.values())
        {
            if(d.toString().equals(s))
            {
                System.out.print("Found a match for " + s + ": ");
                System.out.println(d.getDir());
            }
        }
    }

    public enum Directions
    {
        N(0), E(1), S(2), W(3), NORTH(0), EAST(1), SOUTH(2), WEST(3), UP(8), 
        DOWN(9), U(8), D(9);
        private int dir;
        private Directions(int d)
        {
            dir = d;
        }
        public int getDir()
        {
            return dir;
        }
    }
}