package Assignment6;

public class TestFan
{
    public static void main(String[] args) throws Exception
    {
        Fan f1 = new Fan(true);
        System.out.println("First constructor Speed: " + f1.speed + " Switch: " + f1.fanSwitch);

        Fan f2 = new Fan(2, true);
        System.out.println("Second constructor Speed: " + f2.speed + " Switch: " + f2.fanSwitch);

    }
}