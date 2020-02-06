package Assignment7.part4;

public class UnicycleFactory implements CycleFactory
{
    public Cycle getCycle()
    {
        return new Unicycle();
    }
}