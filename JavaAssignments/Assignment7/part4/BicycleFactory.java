package Assignment7.part4;

public class BicycleFactory implements CycleFactory
{
    public Cycle getCycle()
    {
        return new Bicycle();
    }
}