package basic.April11;

import java.util.Scanner;

public class Lab006_Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();


        if(year%4==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("This is not Leap year");
        }

    }
}
