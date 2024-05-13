package week5_homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 *  Iterater.
 */
public class Programme5_iterator {
    public static void main(String[] args) {
        ArrayList<Integer> number =  new ArrayList();
        number.add(5);
        number.add(10);
        number.add(15);
        number.add(20);
        Iterator<Integer> result= number.iterator();
        while (result.hasNext()){
            System.out.println(result.next() + " ");
        }

    }

}
