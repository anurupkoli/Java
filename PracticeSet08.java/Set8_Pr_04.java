import java.util.Scanner;

class rectangle{
    float length;
    float breadth;
    Scanner s = new Scanner(System.in);

    public void set_L_B(){
        System.out.print("Enter the length of rectangle: ");
        length = s.nextFloat();
        System.out.print("Enter the breadth of rectangle: ");
        breadth = s.nextFloat();
    }
    
    public void getArea(){
        System.out.printf("Area: %.2f\n", length*breadth);
    }

    public void getPerimeter(){
        System.out.printf("Perimeter: %.2f", 2*(length+breadth));
    }
}

public class Set8_Pr_04{
    public static void main(String[] args) {
        rectangle re = new rectangle();
        re.set_L_B();
        re.getArea();
        re.getPerimeter();
    }
}