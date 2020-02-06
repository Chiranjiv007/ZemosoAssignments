package Assignment7.part5;

/*
@author:- Chrianjiv Goyal

Create a class with an inner class that has a non-default constructor (one that takes arguments).
Create a second class with an inner class that inherits from the first inner class.
*/



public class Class1
{
    int func;

    class Class2
    {
        int var1;
        int var2;

        Class2(int v1, int v2)
        {
            var1 = v1;
            var2 = v2;
        }

    }
}

