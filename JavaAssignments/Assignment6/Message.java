/* 

@author: Chiranjiv Goyal

Part 3:- Create a class with a constructor that takes a String argument. 
During construction, print the argument. Create an array of object references to this class, 
but don’t actually create objects to assign into the array. When you run the program, 
notice whether the initialization messages from the constructor calls are printed.

Part 4:- Complete the previous exercise by creating objects to attach to the array of references.

*/
package Assignment6;

public class Message
{
    String stringMessage;

    public static void main(String[] args) throws Exception
    {
        try
        {
            Message[] messages = new Message[10];

            for (int i = 0; i < 10; i++)
            {
                messages[i] = new Message("string");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public Message(String string)
    {
        stringMessage = string;
        System.out.println(string);
    }
}
// Part3
// Answer: Nope It Doesnt get printed

// Part4:
// It Prints this this time