package exercise.exercise0;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Create a List (ArrayList or LinkedList), add elements to it and print all of them using ListIterator
 *             for loop and foreach loop.
 *
 */
public class Exercise0 {

    public Exercise0() {

    }

    public void iterateThroughList() {
        // TODO Exercise #0 a) Create a list (ArrayList or LinkedList) and add elements to it
        // TODO Exercise #0 a) Hint: Don't forget to specify the type of the list (Integer, String etc.)
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("f00");
        list.add("!!!");

        // TODO Exercise #0 b) Iterate through the list using ListIterator and print all its elements
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("List iterator:");
        while (listIterator.hasNext())
            System.out.println("\t" + listIterator.next());

        // TODO Exercise #0 c) Iterate through the list using classic for loop and print all its elements
        System.out.println("For loop:");
        for (int i = 0; i < list.size(); i++)
            System.out.println("\t" + list.get(i));

        // TODO Exercise #0 d) Iterate through the list using foreach loop and print all its elements
        System.out.println("Foreach loop:");
        for (String s : list)
            System.out.println("\t" + s);

    }

    public static void main(String[] args) {
        // TODO Exercise #0 e) Create a new instance of Exercise0 class and call the iterateThroughList() method
        new Exercise0().iterateThroughList();
    }
}
