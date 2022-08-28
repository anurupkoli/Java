import java.util.Scanner;

class Cylinder{
    float radius;
    float height;
    Scanner s = new Scanner(System.in);
    public void setRadius(){
        System.out.print("Enter the radius of cylinder: ");
        radius = s.nextFloat();
    }
    public void setHeight(){
        System.out.print("Enter the Height of cylinder: ");
        height = s.nextFloat();
    }
    public float getRadius(){
        return radius;
    }
    public float getHeight(){
        return height;
    }
}

public class Set9_Pr_01{
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setHeight();
        cy.setRadius();
        System.out.printf("Radius is: %.2f\n", cy.getRadius());
        System.out.printf("Height is: %.2f\nd", cy.getHeight());
    }
}