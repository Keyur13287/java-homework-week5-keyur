package week5_homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme6_Retrieve {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index : ");
        int a = scanner.nextInt();
        scanner.close();

        //Get the specific elements
        System.out.println("Elements of index is : " + arrayList.get(a));

    }
}
