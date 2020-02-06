/*
    Author: Chiranjiv Goyal
    Last Update: 5 july 2019

    Create class in package chiranjiv.assignment.singleton
    containing a non static String member variable. Add a static method 
    that takes String as parameter and initialize the member variable 
    and then return object of that class. Add a non static method to print the String.
*/
package Assignment5.singleton;

public class Singleton
{
    String SingletonField;
    private static Singleton instance = new Singleton();

    private Singleton()
    {}

    public static Singleton getInstance(String str)
    {
        instance.SingletonField = str;
        return instance;
    }

    public void printSingletonField()
    {
        System.out.println("String Variable: " + instance.SingletonField);
    }

}