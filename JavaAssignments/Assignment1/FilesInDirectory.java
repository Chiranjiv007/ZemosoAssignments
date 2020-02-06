/*
@author:- Chiranjiv Goyal

Create a java program to search through the home directory and 
look for files that match a regular expression. 
The program should be able to take inputs repeatedly and 
should print out the full absolute path of the matching files found.


*/
package Assignment1;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.IOException;
import java.io.File;
import java.io.InputStreamReader;

public class FilesInDirectory {


    private List<String> filesmatching = new ArrayList<String>();

     /**
     * Print all files matching to regex in the home directory with there path
     *
     * @throws IOException
     */

    public void matchFilesInDirectory() throws IOException {


        /**
         * Call user for pattern to be given as input. Inserting 'N' will exit the
         * program.
         */
        String pattern = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (pattern != "N") {

            System.out.println("ENTER THE PATTERN(Enter 'N' to Quit): ");
            pattern = reader.readLine();

            // Exit Code of pattern
            if (pattern.equals("N")) {
                break;
            }

            // Call for function to look for files that match regular expression.
            String directory = "/home/chiranjiv/Downloads";
            File[] files = listFilesInDirectory(directory);


            try
            {
                matchFiles(files, pattern);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        System.exit(0);
    }

    public List<String> getfilematching()
    {
        return this.filesmatching;
    }

    private File[] listFilesInDirectory(String directory)
    {
        File dir = new File(directory);
        File[] files = dir.listFiles();
        return files;
    }

    /**
     * @return void
     * @param (files, String): array of files/folders in directory, path of
     *                 the directory, pattern to match Prints all the files in the
     *                 directory that matches the pattern
     */
    private void matchFiles(@NotNull File[] files, String pattern) throws Exception {

        for (File file : files)
        {
            String fileName = file.getName();

            // If the file is directory then recursively call the function
            // with suitable parameters
            if (file.isDirectory())
            {
                matchFiles(file.listFiles(), pattern);
            }
            else
            {
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(fileName);
                boolean b = m.matches();

                if (b)
                {
                    filesmatching.add(file.getPath());
                    System.out.println("Path: " + file.getPath());
                }
            }
        }
    }
}
