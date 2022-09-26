import java.util.Scanner;
public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total max marks of all subjects: ");
        float total = s.nextFloat();
        System.out.print("Enter marks scored in 1st subject: ");
        float sub1 = s.nextFloat();
        System.out.print("Enter marks scored in 2nd subject: ");
        float sub2 = s.nextFloat();
        System.out.print("Enter marks scored in 3rd subject: ");
        float sub3 = s.nextFloat();
        System.out.print("Enter marks scored in 4th subject: ");
        float sub4 = s.nextFloat();
        System.out.print("Enter marks scored in 5th subject: ");
        float sub5 = s.nextFloat();

        float percentage = ((sub1+sub2+sub3+sub4+sub5)/total)*100;
        double CGPA = percentage/9.5;
        System.out.println("Your percentage is: " + percentage);
        System.out.println("Your CGPA is: " + CGPA);
        s.close();
    }
}
