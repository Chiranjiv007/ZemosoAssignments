package Assignment10;

public class LinkedListObject
{
    String s;
    LinkedListObject next;

    LinkedListObject()
    {
        this.s = null;
        this.next = null;
    }

    LinkedListObject(String str)
    {
        this.s = str;
        this.next = null;
    }

    public String toString()
    {
        if (s == null)
        {
            return "null";
        }
        return s.toString();
    }
}