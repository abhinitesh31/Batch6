package basic.April11;

import java.util.Scanner;

public class Lab004_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num%2==0)
            System.out.println("Output is Even Number");
        else
            System.out.println("Output is odd Number");
    }
}