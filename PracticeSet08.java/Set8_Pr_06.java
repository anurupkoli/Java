import java.util.Scanner;

class circle{
    float radius;
    Scanner s = new Scanner(System.in);

    public void setRadius(){
        System.out.print("Enter the value of radius: ");
        radius = s.nextFloat();
    }

    public void getArea(){
        System.out.printf("Area: %.2f\n", 3.14f*radius*radius);
    }

    public void getPerimeter(){
        System.out.printf("Perimeter: %.2f\n", 3.14f*2f*radius);
    }
}

public class Set8_Pr_06 {
    public static void main(String[] args){
        circle cr = new circle();
        cr.setRadius();
        cr.getArea();
        cr.getPerimeter();
    }    
}
