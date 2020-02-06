/*
@author:- Chiranjiv Goyal

Using TextFile and a Map<Character,Integer>, create a program that takes 
the file name as a command line argument and counts the occurrence of all 
the different characters. Save the results in a text file.
*/

package Assignment11;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main
{
    public static String ReadFileAsString(String filename) throws Exception
    {
        String data;
        data = new String(Files.readAllBytes(Paths.get(filename)));
        return data;
    }

    public static void main(String[] args) throws Exception
    {
        String filename = args[0];
        String data = ReadFileAsString(filename);
        // System.out.println(data);

        Map<Character, Integer> charCount = new HashMap<Character, Integer>();

        for (int i = 0; i < data.length(); i++)
        {
            int temp;

            if (charCount.containsKey(data.charAt(i)))
            {
                temp = charCount.get(data.charAt(i));
                temp++;
                charCount.put(data.charAt(i), temp);
            }
            else
            {
                charCount.put(data.charAt(i), 1);
            }
        }

        WriteInFile("Assignment11/output.txt", charCount);
    }


    public static void WriteInFile(String OutFilename, Map<Character, Integer> charCount) throws Exception
    {
        Set<Map.Entry<Character, Integer>> charSet = charCount.entrySet();

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(OutFilename));

        for (Map.Entry<Character, Integer> me : charSet)
        {
            fileWriter.write(me.getKey() + ":" + me.getValue());
            fileWriter.newLine();
        }
        fileWriter.close();
    }

}