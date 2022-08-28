import java.util.Scanner;

class Cylinder1{
    float radius;
    float height;
    float volume;
    float surfaceArea;
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

    public void cyVolume(){
        volume = 3.14f*radius*radius*height;
        System.out.printf("Volume of cylinder with R(%.2f) and H(%.2f) is: %.2f\n", radius,height,volume);
    }

    public void cySurfaceArea(){
        surfaceArea = 2f*3.14f*radius*(radius+height);
        System.out.printf("Surface area of cylinder with R(%.2f) and H(%.2f) is: %.2f\n", radius,height,surfaceArea);
    }
}

public class Set9_Pr_02 {
    public static void main(String[] args) {
        Cylinder1 cy = new Cylinder1();
        cy.setHeight();
        cy.setRadius();
        cy.cyVolume();
        cy.cySurfaceArea();
    }
}
