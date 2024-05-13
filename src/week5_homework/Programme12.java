package week5_homework;

import java.util.ArrayList;

public class Programme12 {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        if (c1.equals(c2))
            System.out.println("c1 and c2 are equal.");
        else {

            System.out.print("C1 ArrayList: ");
            for (String arrayList1 : c1){
                System.out.print(arrayList1 + ", ");
            }
            System.out.println();
            System.out.print("C2 ArrayList: ");
            for (String arrayList2 : c2) {
                System.out.print(arrayList2 + ", ");
            }
            System.out.println();
            System.out.println("The given arraylist c1 and c2 are not equal.");
        }
    }
}
