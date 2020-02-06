/*

@author: Chiranjiv Goyal

fan class with two (overloaded) constructors. 
fan(boolean swtch) constructor call the second constructor fan(int spd, boolean swtch) inside the if.

*/
package Assignment6;

public class Fan
{
    int speed;
    boolean fanSwitch;

    public Fan(int spd, boolean fanSwitch)
    {
        speed = spd;
        this.fanSwitch = fanSwitch;
    }

    public Fan(boolean fanSwitch)
    {
        this(0, fanSwitch);
    }
}