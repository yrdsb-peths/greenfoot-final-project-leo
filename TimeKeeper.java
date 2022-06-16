/**
 * Write a description of class TimeKeeper here.
 * 
 * This class tracks time for the world
 * 
 * Leo Xu
 * June 15 2022
 * 
 * 
 */
public class TimeKeeper  
{
    public static int timeleft;//tracks the time value across all worlds
    
    public TimeKeeper()
    {
        this.timeleft = Difficulty.timeValue;//gets the time value from the Difficulty world
    }

    public static void Updatetime()//decrease time by 1 seconds everytime its called
    {
        timeleft --;
    }  
}   