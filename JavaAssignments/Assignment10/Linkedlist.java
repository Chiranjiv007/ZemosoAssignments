/*
@author:- Chiranjiv Goyal

Create a generic, singly linked list class called SList, which, does not implement the List interface.
    
Each Link object in the list should contain a reference to the next element in the list, 
but not the previous one (LinkedList, in contrast, is a doubly linked list, 
which means it maintains links in both directions).

Create your own SListIterator which, does not implement ListIterator. 
The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.

The only way to insert and remove elements from an SList is through SListIterator.

*/

package Assignment10;

import java.util.*;

public class Linkedlist
{
    public static void main(String[] args)
    {
        Slist sl = new Slist();

        System.out.println(sl);

        SlistIterator it = sl.iterator();
        it.insert("hi");
        System.out.println(sl);
        it.insert("Sweetie");
        it.insert("!! Whats up??");
        System.out.println(sl);

        SlistIterator it2 = sl.iterator();
        it2.remove();
        System.out.println(sl);
    }
}