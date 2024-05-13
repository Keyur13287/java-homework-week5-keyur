package week5_homework;

import java.util.Scanner;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme3_reverse {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the length of number:");
        int len= scanner.nextInt();
        int[] arr = new int[len];

        for (int i=0;i<len;i++){
            System.out.println("Enter the number : "+ i + ": ");
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr,len);
        scanner.close();
    }
    public static void reverseArray(int input[], int size){
        System.out.println("The reverese array :");
        for(int i=input.length-1;i>=0;i--){
            System.out.print(input[i] + "  ");
        }
    }
}
