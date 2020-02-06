package Assignment10;

public class Slist
{
    private LinkedListObject headlink = new LinkedListObject();
    private SlistIterator slistIterator = new SlistIterator(headlink);

    SlistIterator iterator()
    {
        slistIterator.current = headlink;
        return slistIterator;
    }

    public String toString()
    {
        if (headlink.next == null)
        {
            return "SList: []";
        }

        SlistIterator it = this.iterator();
        StringBuilder s = new StringBuilder("[ ");

        while (it.hasNext())
        {
            s.append(it.next() + (it.hasNext() ? " " : ""));
        }

        return s + " ]";
    }

}