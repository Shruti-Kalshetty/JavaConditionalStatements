import java.util.Scanner;

public class RangeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 10) {
            System.out.println("Entered Number range is 1 to 10.");
        } else if (num >= 11 && num <= 20) {
            System.out.println("Entered number range is 11 to 20.");
        } else {
            System.out.println("Entered number is out of range.");
        }
        sc.close();
    }

}
