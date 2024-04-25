package basic.April11;

import java.util.Scanner;

public class Lab008vowel_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Letter");
       // String str= sc.nextLine();
        char c = sc.next().charAt(0);
        char s1= 'a', s2 = 'e', s3 = 'i', s4='0', s5 = 'u';
        char s10= c;

        if((s10==s1) || (s10==s2) || (s10==s5) || (s10==s3) || (s10==s4))
        {
            System.out.println("This is vowel");

        }
        else
            System.out.println("Consonant");
    }

    }

