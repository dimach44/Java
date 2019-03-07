package zork;

import java.util.LinkedList;

public abstract class Locations implements Comparable<Locations>
{
    String locID;
    String shortDesc;
    String longDesc;
    LinkedList<Obj> objects = new LinkedList<>();
    boolean N,NE,E,SE,S,SW,W,NW,U,D;
}
