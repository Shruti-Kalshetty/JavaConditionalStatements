import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " Number is Positive.");
        } else if (num < 0) {
            System.out.println(num + " Number is Negative.");
        } else {
            System.out.println("The Number is Zero");
        }
        sc.close();

    }

}
