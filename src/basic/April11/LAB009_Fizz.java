package basic.April11;

public class LAB009_Fizz {
    public static void main(String[] args) {
        System.out.println("Numbers divided by 3");
        int i;
        for (i = 1; i < 5000; i++) {

            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("FIZZ BUZZ is Printed for multiple of 5 and 3 both");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ is Printed for multiple of 5");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ is Printed for multiple of 3");
            } else {
                System.out.println(i);
            }
        }
    }
}





