/*
    Author: Chiranjiv Goyal
    Last Update: 5 july 2019


    Print Fields and Local vairables which are not intialized
*/

package Assignment5.data;

public class Shirt

{

    int price;
    char size;

    public void printData() throws Exception
    {
        try
        {
            System.out.println("Price: " + price);
            System.out.println("Size: " + size);
        }

        catch(Exception err)
        {
            System.out.println(err.getMessage());
            System.exit(1);
        }

    }

    // Cannot Perform this action

    /*
    public void PrintVarLocal()
    {
        int price;
        char size;
        System.out.println("Local Integer Variable: " + price);
        System.out.println("Local Char Variable: " + size);
    }
    */
}