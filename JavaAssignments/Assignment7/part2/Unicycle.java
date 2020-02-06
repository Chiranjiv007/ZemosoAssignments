package Assignment7.part2;

class Unicycle extends Cycle
{
    void ride()
    {
        System.out.println("Unicycle.ride()");
    }

    int wheels()
    {
        return 1;
    }

    void balance()
    {
        System.out.println("Unicycle.balance()");
    }
}