import java.util.Scanner;
public class Set4_pr_02{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float sub1, sub2, sub3, totalPerc;
        System.out.print("Enter your marks in 1st subject: ");
        sub1 = s.nextFloat();
        System.out.print("Enter your marks in 2nd subject: ");
        sub2 = s.nextFloat();
        System.out.print("Enter your marks in 3rd subject: ");
        sub3 = s.nextFloat();

        totalPerc = ((sub1+sub2+sub3)/300f)*100;
        boolean state = (sub1 >= 33 && sub2 >= 33 && sub3 >= 33);
        if (state && totalPerc >= 40){
            System.out.println("You are Passed");
        }
        else{
            System.out.println("You are Failed");
        }
    }
}
