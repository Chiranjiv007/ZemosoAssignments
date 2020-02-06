package Assignment7.part5;

import Assignment7.part5.Class1.Class2;
public class secondClass
{
    class inheritedclass extends Class1.Class2
    {
        inheritedclass(int v1, int v2) {
            super(v1, v2);
        }

        public void method1()
        {
            System.out.println("Class2 method1");
        }

    }

}