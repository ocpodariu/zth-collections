package exercise.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 1: Compute the sum, the minimum and the maximum element from a given list (givenList) using three
 *             different ways to iterate over a List:
 *             a) ListIterator (implement it in the iterateUsingListIterator() method)
 *             b) for loop (implement it in the iterateUsingForLoop() method)
 *             c) foreach loop (implement it in the iterateUsingForEachLoop() method)
 *
 *             In order to test your implementations you need to run the Exercise1Test from the test/java package
 *             (right-click on Exercise1Test class, then click Run 'Exercise1Test' )
 */
public class Exercise1 {

    // The list that contains some Integer values
    private List<Integer> givenList;

    public Exercise1(List<Integer> l) {
       this.givenList = l;
    }

    // TODO Exercise #1 a) Compute sum and get the min and the max from givenList, iterating through it using ListIterator
    public List<Integer> iterateUsingListIterator() {

        // This List is used only for testing so you don't have to modify it
        List<Integer> testValues = new ArrayList<Integer>();

        // TODO Exercise #1 a1) In order to pass the tests, you need to name your variables sum, min and max or if
        // TODO Exercise #1 a1) you want to name them differently you need to modify them when you add them to testValues
        int sum = 0;
        int min = 0, max = 0;

        ListIterator<Integer> listIterator = givenList.listIterator();

        // Initialize min and max with the first element
        if (listIterator.hasNext()) {
            Integer firstElement = listIterator.next();
            min = firstElement;
            max = firstElement;
        }

        // Return to the beginning of the List
        listIterator.previous();

        // Compute sum, min and max
        Integer currentElement;
        while (listIterator.hasNext()) {
            currentElement = listIterator.next();
            sum += currentElement;
            if (currentElement < min)
                min = currentElement;
            else if (currentElement > max)
                max = currentElement;
        }


        // TODO Exercise #1 a2) Uncomment the following three lines in order to check your computed values using tests
        testValues.add(sum);
        testValues.add(min);
        testValues.add(max);

        return testValues;
    }

    // TODO Exercise #1 b) Compute sum and get the min and the max from list, iterating through it using classic for loop
    public List<Integer> iterateUsingForLoop() {

        // This List is used only for testing so you don't need to modify it
        List<Integer> testValues = new ArrayList<Integer>();


        // TODO Exercise #1 b1) In order to pass the tests, you need to name your variables sum, min and max or if
        // TODO Exercise #1 b1) you want to name them differently you need to modify them when you add them to testValues
        int sum = 0;
        int min = 0, max = 0;

        // Initialize min and max with the first element
        if (givenList.size() > 0) {
            Integer firstElement = givenList.get(0);
            min = firstElement;
            max = firstElement;
        }

        // Compute sum, min and max
        Integer currentElement;
        for (int i = 0; i < givenList.size(); i++) {
            currentElement = givenList.get(i);
            sum += currentElement;
            if (currentElement < min)
                min = currentElement;
            else if (currentElement > max)
                max = currentElement;
        }


        // TODO Exercise #1 b2) Uncomment the following three lines in order to check your computed values using tests
        testValues.add(sum);
        testValues.add(min);
        testValues.add(max);

        return testValues;
    }

    // TODO Exercise #1 c) Compute sum and get the min and the max from list iterating through it using foreach loop
    public List<Integer> iterateUsingForEachLoop() {

        // This List is used only for testing so you don't need to modify it
        List<Integer> testValues = new ArrayList<Integer>();


        // TODO Exercise #1 c1) In order to pass the tests, you need to name your variables sum, min and max or if
        // TODO Exercise #1 c1) you want to name them differently you need to modify them when you add them to testValues
        int sum = 0;
        int min = 0, max = 0;

        // Initialize min and max with the first element
        if (givenList.size() > 0) {
            Integer firstElement = givenList.get(0);
            min = firstElement;
            max = firstElement;
        }

        // Compute sum, min and max
        for (Integer currentElement : givenList) {
            sum += currentElement;
            if (currentElement < min)
                min = currentElement;
            else if (currentElement > max)
                max = currentElement;
        }


        // TODO Exercise #1 c2) Uncomment the following three lines in order to check your computed values using tests
        testValues.add(sum);
        testValues.add(min);
        testValues.add(max);

        return testValues;
    }
}
