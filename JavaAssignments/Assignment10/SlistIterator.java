package Assignment10;

public class SlistIterator
{
    LinkedListObject current;

    SlistIterator(LinkedListObject link)
    {
        current = link;
    }

    public LinkedListObject next()
    {
        current = current.next;
        return current;
    }

    public boolean hasNext()
    {
        return current.next != null;
    }

    public void insert(String str)
    {
        LinkedListObject obj = new LinkedListObject(str);
        current.next = obj;
        current = current.next;
    }

    public void remove()
    {
        if (current.next != null)
        {
            current.next = current.next.next;
        }
    }

}