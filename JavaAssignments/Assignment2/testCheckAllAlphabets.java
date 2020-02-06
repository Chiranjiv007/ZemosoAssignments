package Assignment2;

import org.junit.Assert;
import org.junit.Test;

public class testCheckAllAlphabets {

    @Test
    public void createNewClass_notAllAlphabets()
    {
        String s = "abyqwertyuiopasdfghl";
        CheckAllAlphabet checkAllAlphabet = new CheckAllAlphabet();
        checkAllAlphabet.setTestString(s);



        Assert.assertFalse(checkAllAlphabet.checkAlphabets());
    }

    @Test
    public void createNewClass_allAlphabetsPresent()
    {
        String s = "qwertyuiopasdfghjklzxcvbnm";
        CheckAllAlphabet checkAllAlphabet = new CheckAllAlphabet();
        checkAllAlphabet.setTestString(s);

        Assert.assertTrue(checkAllAlphabet.checkAlphabets());
    }

    @Test
    public void creatNewClass_differentCases()
    {
        String s = "QWERTYUIOPasdfghjklzxcvbnm";
        CheckAllAlphabet checkAllAlphabet = new CheckAllAlphabet();
        checkAllAlphabet.setTestString(s);

        Assert.assertTrue(checkAllAlphabet.checkAlphabets());
    }

    @Test
    public void createNewClass_extraChars()
    {
        String s = "qwertyuiopasdfghjklzxcvbnm,.;'323";
        CheckAllAlphabet checkAllAlphabet = new CheckAllAlphabet();
        checkAllAlphabet.setTestString(s);

        Assert.assertTrue(checkAllAlphabet.checkAlphabets());
    }
}
