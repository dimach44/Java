package zorktest;

import java.util.ArrayList;

public class GameObject
{
    public int objectID;
    public String descShort;
    public String descLong;
    public int points;
    public boolean isContainer;
    public boolean isLocked;
    public boolean isClosed;
    public boolean isBreakable;
    public boolean isBroken;
    public boolean isMovable;
    public boolean isVisited;
    public int locationID;
    public ArrayList<Integer> items = new ArrayList<>();
    public ArrayList<GameObject> gameItems = new ArrayList<>();
}
