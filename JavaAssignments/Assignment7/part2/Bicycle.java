package Assignment7.part2;

class Bicycle extends Cycle
{
    void ride()
    {
        System.out.println("Bicycle.ride()");
    }

    int wheels()
    {
        return 2;
    }

    void balance()
    {
        System.out.println("Bicycle.balance()");
    }
}