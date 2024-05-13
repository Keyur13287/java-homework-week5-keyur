package week5_homework;

import java.util.HashSet;

/**
 * Use aHashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 *  Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 *  else)
 */
public class Programme8_hasset {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet();
        number.add(4);
        number.add(16);
        number.add(8);
        for (int num: number){
            if (num>1 && num<10){
                System.out.println("There are  numbers between this :" + num);
            }
            else {
                System.out.println("The other numbers" + num);
            }
        }

    }



}
