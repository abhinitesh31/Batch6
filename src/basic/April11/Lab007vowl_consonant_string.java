package basic.April11;

import java.util.Scanner;

public class Lab007vowl_consonant_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Letter");
       String str= sc.nextLine();
       // char c = sc.next().charAt(0);
        String s1= "a", s2 = "e", s3 = "i", s4="0", s5 = "u";
        String s10= str;

        if((s10.equals(s1)) || (s10.equals(s2)) || (s10.equals(s5)) || (s10.equals(s3)) || (s10.equals(s4))){
            System.out.println("This is vowel");

        }
        else
            System.out.println("Consonant");
        }






}
