package basic.April11;

public class Lab003_ternary {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        int c = 25;

        int max = (a>b) ?(a>c ? a:c) : (b>c ? b:c);
        int min = (a<b) ?(a<c ? a:c) : (b<c ? b:c);

        System.out.println("Maximum Number is" + max);
        System.out.println("Minimum Number is" + min);
    }
}
