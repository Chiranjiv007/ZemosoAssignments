/*

@author Chiranjiv Goyal

Import the classes data and singleton and execute there print methods
*/

package Assignment5.main;
import Assignment5.data.Shirt;
import Assignment5.singleton.Singleton;;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            // Creates a object of Bicycle class
            // and call the method 'printData' that print its Fields
            Shirt shirt = new Shirt();
            shirt.printData();


            // Creates a object of Singleton class using getInstance function
            // and call the method 'printSingletonField' that print its Fields

            Singleton obj2 = Singleton.getInstance("Initialize using function");
            obj2.printSingletonField();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}