import java.util.Scanner;

public class Sum3Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = s.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = s.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = s.nextInt();

        System.out.println("Sum of 3 numbers is: " + (num1+num2+num3));

    }
}
