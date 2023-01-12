// Define a new Exception class named Odd Exception. Create a new class named Even Odd. Write a method 
// called halfOf(), which takes an int as parameter and throws an Odd Exception if the int is odd or zero, 
// otherwise returns (int / 2). Write a main method that calls halfOf() three times (once each with an even int, an 
// odd int, and zero), with three try/catch blocks, and prints either the output of halfOf() or the caught Odd 
// Exception.

import java.util.*;
import java.lang.*;

class OddException extends Exception{
    OddException(){
        super("OddNoException");
    }
    OddException(String msg){
        super(msg);
    }
}

class EvenOdd{
    public void halfOf(int n){
        try{
            if(n == 0 || n%2 != 0){
                throw(new OddException());
            }
            else{
                System.out.println("Given number is even and it's half is: " + n/2);
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class Program8 {
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        eo.halfOf(n);
    }
}
