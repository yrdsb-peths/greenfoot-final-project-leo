/**
 * Write a description of class TimeKeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeKeeper  
{
    // instance variables - replace the example below with your own
    public static int timeleft;
    /**
     * Constructor for objects of class TimeKeeper
     */
    public TimeKeeper()
    {
        this.timeleft = Difficulty.timeValue;
    }

    //decrease time by 1 seconds everytime its called
    public static void Updatetime()
    {
        timeleft --;
    }  
}   