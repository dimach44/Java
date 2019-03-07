package zork;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import javax.swing.JFileChooser;
import java.text.*;

public class Zork
{
    public LinkedList<Obj> objects = new LinkedList<>();
    ListIterator<Obj> iterObj = objects.listIterator();
    public LinkedList<Loc> locations = new LinkedList<>();
    ListIterator<Loc> iterLoc = locations.listIterator();
    protected int objectCount = 0;
    protected int locationCount = 0;

    public static void main(String[] args) throws FileNotFoundException
    {
        Zork zork = new Zork();
        zork.readLocationFile();
        zork.readObjectFile();

    }

    private void readLocationFile() throws FileNotFoundException
    {
        String locRecord;
        JFileChooser myFile = new JFileChooser();
        myFile.setDialogTitle("Locate the Locations file");
        Scanner inFile = null;
        if (myFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File customerFile = myFile.getSelectedFile();
            inFile = new Scanner(customerFile);
        }
        while (inFile.hasNext())
        {
            locRecord = inFile.nextLine();
            addLocation(locRecord);
            locationCount++;
        }
        inFile.close();

    }

    private void addLocation(String locRec)
    {
        Loc currentLoc = new Loc();
        String locFields[] = locRec.split(",");
        currentLoc.locID = locFields[0];
        currentLoc.shortDesc = locFields[1];
        currentLoc.longDesc = locFields[2];
        //currentLoc.objects = locFields[3];
        currentLoc.N = Boolean.valueOf(locFields[4]);
        currentLoc.NE = Boolean.valueOf(locFields[5]);
        currentLoc.E = Boolean.valueOf(locFields[6]);
        currentLoc.SE = Boolean.valueOf(locFields[7]);
        currentLoc.S = Boolean.valueOf(locFields[8]);
        currentLoc.SW = Boolean.valueOf(locFields[9]);
        currentLoc.W = Boolean.valueOf(locFields[10]);
        currentLoc.NW = Boolean.valueOf(locFields[11]);
        currentLoc.U = Boolean.valueOf(locFields[12]);
        currentLoc.D = Boolean.valueOf(locFields[13]);
        locations.add(currentLoc);
    }
    
    private void readObjectFile() throws FileNotFoundException
    {
        String objRecord;       
        JFileChooser myFile = new JFileChooser();
        myFile.setDialogTitle("Locate the Objects file");
        Scanner inFile = null;
        if (myFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File invoiceFile = myFile.getSelectedFile();
            inFile = new Scanner(invoiceFile); 
        }
        while (inFile.hasNext())
        {
            objRecord = inFile.nextLine();
            addObject(objRecord);
            objectCount++;
        }
        inFile.close();
        
    }
    
    private void addObject(String objRec)
    {
        Obj currentObj = new Obj();
        String objFields[] = objRec.split(",");
        currentObj.objID = objFields[0];
        currentObj.locID = objFields[1];
        currentObj.desc = objFields[2];
        currentObj.isTakeable = Boolean.valueOf(objFields[3]);
        currentObj.isBreakable = Boolean.valueOf(objFields[4]);
        objects.add(currentObj);
    }
}