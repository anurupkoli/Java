import java.util.Scanner;
public class Set4_Pr_03 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your income: ");
        float income = s.nextFloat();
        float tax = 0f;

        if(income <= 250000){
            tax = tax;
        }
        else if(income > 250000 && income <= 500000){
            tax = tax + 0.05f * (income - 250000);
        }
        else if(income > 500000 && income <= 1000000){
            tax = tax + 0.05f * (income - 250000);
            tax = tax + 0.2f * (income - 500000);
        }
        else if(income > 1000000){
            tax = tax + 0.05f * (income - 250000);
            tax = tax + 0.2f * (income - 500000);
            tax = tax + 0.3f * (income - 1000000);
        }
        System.out.printf("Total tax that you have to pay is: %f", tax);
        s.close();
    }    
}
