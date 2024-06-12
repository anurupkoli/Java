import java.time.LocalDate;
import java.util.Scanner;

class Account{
    class Transactions{
        int amount;
        LocalDate timeStamp;
        Transactions(int amount){
            this.amount = amount;
            this.timeStamp = LocalDate.now();
        }

        void printDetails(){
            System.out.println("Amount: " + amount + " TimeStamp: " + timeStamp);
        }
    }

    Transactions[] transactions;

    public void enterTransactionDetails(){
        System.out.println("Enter total no. of transactions: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        sc.nextLine();
        transactions = new Transactions[no];
        System.out.println("Enter Amount: ");
        for (int i = 0; i < no; i++) {
            int amount = sc.nextInt();
            transactions[i] = new Transactions(amount);
        }
        sc.close();
    }

    void printTransactions(){
        for (int i = 0; i < transactions.length; i++) {
            transactions[i].printDetails();
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Account sbi = new Account();
        sbi.enterTransactionDetails();
        sbi.printTransactions();
    }
}
