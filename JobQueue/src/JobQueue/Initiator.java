package JobQueue;

import java.util.ArrayList;

public class Initiator
{
    String initStatus;
    String jobClass;
    ArrayList<String> initClasses = new ArrayList<>();
    Job initJob = new Job();
    
    public Initiator(String jClass, String status)
    {
        
    }
    
    public Initiator()
    {
        
    }
    
    public boolean assignJob(Job job)
    {
        boolean rc = false;
        return rc;
    }
    
    public boolean removeJob(Job job)
    {
        boolean rc = false;
        return rc;
    }
    
    public void changeStatus(String jClass, String status)
    {
        if(jClass == jobClass && status == "Stopped")
        {
            initStatus = "Running";
        }
        else
        {
            initStatus = "Stopped";
        }
    }
    
    public void changeClass(String jClass, String status)
    {
        jobClass = jClass;
        changeStatus(jClass, status);
    }
}
