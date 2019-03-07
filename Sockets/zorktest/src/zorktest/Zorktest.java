package zorktest;

import java.util.ArrayList;

public class Zorktest
{
    public static void main(String[] args)
    {
        GameObject g1 = new GameObject();
        GameObject g2 = new GameObject();
        ArrayList<GameObject> gameObjects = new ArrayList<>();
        g1.descLong = "A dark, overgrown and tangled "
                + "path leaving into a dimly lit forest.";
        g1.descShort = "Creepy Forest Path.";
        g1.objectID = 1;
        g2.descLong = "A beautiful sparkling blue sapphire "
                + "with an iridescent star glowing brightly.";
        g2.descShort = "Star Sapphire.";
        g2.objectID = 1001;
        g2.locationID = 1;
        g1.items.add(1001);
        gameObjects.add(g1);
        gameObjects.add(g2);
        System.out.println();
    }
}
