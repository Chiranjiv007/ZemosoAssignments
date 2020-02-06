/*
@author:- Chiranjiv Goyal

Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. 
Create factories for each type of Cycle, and code that uses these factories.
*/

package Assignment7.part4;

public class Main
{
    public static void ridingCycle(CycleFactory factory) throws Exception
    {
        try
        {
            Cycle cyc = factory.getCycle();
            cyc.ride();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static void main(String[] args) throws Exception {
        ridingCycle(new UnicycleFactory());
        ridingCycle(new BicycleFactory());
        ridingCycle(new TricycleFactory());

    }
}