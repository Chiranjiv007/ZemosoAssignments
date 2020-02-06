/*
@author: Chiranjiv Goyal

A java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). 
Write time and space complexity of your solution as comments in the source file.

Time Complexity: O(n)
Space Complexity:- O(n)
n:- Length of String

*/
package Assignment2;

public class CheckAllAlphabet
{
    private String testString;

    public void setTestString(String testString) {
        this.testString = testString;
    }


    /**
     * Checks if a string contains all the alphabets or not
     * @return boolean
     */
    public boolean checkAlphabets()
    {

        int[] countChars = new int[26];

        for (int i = 0; i < testString.length(); i++)
        {
            char testChar = testString.charAt(i);

            if (testChar - 'a' >= 0 && testChar - 'a' < 26)
            {
                countChars[testChar - 'a']++;
            }
            else if (testChar - 'A' >= 0 && testChar - 'A' < 26)
            {
                countChars[testChar - 'A']++;
            }
        }

        for (int i = 0; i <= 25; i++)
        {
            if (countChars[i] == 0)
            {
                return false;
            }
        }
        return true;
    }

}