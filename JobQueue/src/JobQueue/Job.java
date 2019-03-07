package JobQueue;

public class Job
{
    public String jobName;
    public char jobClass;
    public int jobPrty;
    public String jobProgrammer;
    public int jobNumber = 0;
    private long jobRunTime;
    private long jobStartTime;
    
    public Job()
    {
        
    }
    
    public Job(String jn, char jc, int prty, String prgmr)
    {
        jobName = jn;
        jobClass = jc;
        jobPrty = prty;
        jobProgrammer = prgmr;
        jobRunTime = setRunTime();
    }
    
    private int setRunTime()
    {
        return 1000 * ((int)Math.floor(Math.random() * 90) + 31);
    }
    
    public long getRunTime()
    {
        return jobRunTime/1000;
    }
    
    public void setStartTime()
    {
        jobStartTime = System.currentTimeMillis();
    }
    
    public boolean isJobOver()
    {
        return (jobRunTime + jobStartTime < System.currentTimeMillis()?
                false: true);
    }
}