package Assignment1;

import org.junit.Assert;
import org.junit.Test;

public class TestFilesInDirectory
{
    public static void main(String[] args) throws Exception
    {
        FilesInDirectory filesInDirectory = new FilesInDirectory();
        try
        {
            filesInDirectory.matchFilesInDirectory();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}