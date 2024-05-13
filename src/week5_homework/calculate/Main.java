package week5_homework.calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number");
        int input1= scanner.nextInt();
        System.out.println("Enter the second number");
        int input2=scanner.nextInt();
        System.out.println("Enter the special character + , - , / , * :");
        char sym= scanner.next().charAt(0);
        Calculator obj = new Calculator();
        obj.calculateResult(input1,input2,sym);
        System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
        char result= scanner.next().charAt(0);
        while(result!=0){
            if (result=='y'){
                System.out.println("Please enter the first number");
                break;
            }
            else {
                break;
            }
        }
    }
}
