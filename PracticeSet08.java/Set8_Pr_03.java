import java.util.Scanner;

class square{
    Scanner s = new Scanner(System.in);
    float side;
    public void setSide(){
        System.out.print("Enter the side of square: ");
        side = s.nextFloat();
    }

    public void getArea(){
        System.out.printf("Area of square with side %.2f is: %.2f\n", side, side*side);
    }

    public void getPerimeter(){
        System.out.printf("Perimeter of square with side %.2f is: %.2f\n", side, 4*side);
    }
}

public class Set8_Pr_03 {
    public static void main(String[] args) {
        square sq = new square();
        sq.setSide();
        sq.getArea();
        sq.getPerimeter();
    }
}
