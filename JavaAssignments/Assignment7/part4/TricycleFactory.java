package Assignment7.part4;

public  class TricycleFactory implements CycleFactory
{
    public Cycle getCycle()
    {
        return new Tricycle();
    }
}