package Assignment8;

public class TestMultipleException
{
    public static void main(String[] args)
    {
        MultipleException exceptions = new MultipleException();
        try
        {
            exceptions.throwException("Execute Finally");
        }
        catch (FirstException | SecondeException | ThirdException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("Executed Finally");
        }
    }
}