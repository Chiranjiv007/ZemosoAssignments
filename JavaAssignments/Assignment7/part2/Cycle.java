/*
@author: Chiranjiv Goyal

Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. 
Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. 
Create instances of all three types and upcast them to an array of Cycle. 
Try to call balance( ) on each element of the array and observe the results. 
Downcast and call balance( ) and observe what happens.


*/

package Assignment7.part2;

public class Cycle
{
    public static void main(String[] args) throws Exception
    {
        Cycle[] cycles = new Cycle[]
                {
                        new Cycle(), new Unicycle(),
                        new Bicycle(), new Tricycle()
                };

        for (Cycle c : cycles)
        {
            c.ride();
            System.out.println("wheels = " + c.wheels());
            ((Unicycle) c).balance();
        }


    }

    void ride()
    {
        System.out.println("Cycle.ride()");
    }

    int wheels()
    {
        return 0;
    }
}
