package week5_homework;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 *  printout the collection using for each loop.
 */
public class Programme4_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> colour= new ArrayList();
        colour.add("Pink");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Purpule");

        for(String Result  : colour){
            System.out.print( Result + " ");
        }
    }

}
