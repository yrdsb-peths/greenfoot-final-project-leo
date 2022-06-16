/**
 * Write a description of class TimeKeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeKeeper  
{
    public static int timeleft;//tracks the time across all worlds
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