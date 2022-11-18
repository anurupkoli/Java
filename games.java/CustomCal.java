import java.util.Scanner;

class InvalidInputException extends Exception{
    public String toString(){
        return "Invalid input";
    }
}

class CannotDivideException extends Exception{
    public String toString(){
        return "Cannot divide by 0";
    }
}

class MaxInputException extends Exception{
    public String toString(){
        return "Please Enter Values less than 100000";
    }
}

class MyCalculator{
    double a;
    double b;
    Scanner sc = new Scanner(System.in);
    
    public double add()throws InvalidInputException, MaxInputException{
        while(true){
            try{
                System.out.printf("Enter the values of a and b(Cannot hold values more than 1000000!!): ");
                this.a = sc.nextInt();
                this.b = sc.nextInt();
                if(a > 100000 && b > 100000){
                    throw new MaxInputException();
                }
                break;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        return this.a+this.b;
    }
    
    public double subtract()throws InvalidInputException, MaxInputException{
        while(true){
            try{
                System.out.printf("Enter the values of a and b(Cannot hold values more than 1000000!!): ");
                this.a = sc.nextInt();
                this.b = sc.nextInt();
                if(a > 100000 && b > 100000){
                    throw new MaxInputException();
                }
                break;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        return this.a-this.b;
    }
    
    public double divide()throws CannotDivideException,InvalidInputException, MaxInputException{
        while(true){
            try{
                System.out.printf("Enter the values of a and b(Cannot hold values more than 1000000!!): ");
                this.a = sc.nextInt();
                this.b = sc.nextInt();
                if(a > 100000 && b > 100000){
                    throw new MaxInputException();
                }
                break;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        if(b==0){
            throw new CannotDivideException();
        }
        return this.a/this.b;
    }
    
    public double multiply()throws InvalidInputException, MaxInputException{
        while(true){
            try{
                System.out.printf("Enter the values of a and b(Cannot hold values more than 1000000!!): ");
                this.a = sc.nextInt();
                this.b = sc.nextInt();
                if(a > 100000 && b > 100000){
                    throw new MaxInputException();
                }
                break;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        return this.a*this.b;
    }
}
    

public class CustomCal {
    public static void main(String[] args) throws InvalidInputException,CannotDivideException,MaxInputException {
        Scanner s = new Scanner(System.in);
        MyCalculator cal = new MyCalculator();
        while(true){
            try{
                System.out.println("\nSelect from the following: ");
                System.out.printf("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit\n");
                int option = s.nextInt();
                switch(option){
                    case 1: System.out.println(cal.add()); break;
                    case 2: System.out.println(cal.subtract()); break;
                    case 3: System.out.println(cal.multiply()); break;
                    case 4: System.out.println(cal.divide()); break;
                    case 5: break;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}
