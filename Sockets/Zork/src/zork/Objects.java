package zork;

public abstract class Objects implements Comparable<Objects>
{
    String objID;
    String locID;
    String desc;
    boolean isTakeable;
    boolean isBreakable;
}
