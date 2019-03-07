package circqueue1;

public class CircQueue1 {

    public static void main(String[] args) 
    {
       CQ<String> myCQ = new CQ<>();
       myCQ.add("SKELETON MAN");
       myCQ.add("Ring");
       myCQ.add("Around");
       myCQ.add("The");
       myCQ.add("Rosie");
       myCQ.add("Pockets");
       myCQ.add("Full");
       myCQ.add("Of");
       myCQ.add("Posies");
       myCQ.add("Ashes");
       myCQ.add("Ashes");
       myCQ.add("We");
       myCQ.add("All");
       myCQ.add("Fall");
       myCQ.add("Down");
       myCQ.Display();
       myCQ.Size();
       myCQ.BufferSize();
    }
}
