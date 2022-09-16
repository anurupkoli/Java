import java.util.Scanner;

class circle{
    public float radius;
    public circle(float r){
        this.radius = r;
    }

    public double area(){
        return Math.PI * this.radius*this.radius;
    }
}

class cylinder4 extends circle{
    public float height;
    public cylinder4(float r, float h) {
        super(r);
        this.height = h;
    }

    public double areaCy(){
        return 2 * Math.PI * this.radius*this.height*(this.radius + this.height);
    }

}


public class Set10_Pr_01{
    public static void main(String[] args) {
        circle cr = new circle(5f);
        cylinder4 cy = new cylinder4(6f, 15f);
        double crArea = cr.area();       
        double cyArea = cy.areaCy();
        System.out.println("Area of circle: "+ crArea);
        System.out.println("Area of cylinder: "+ cyArea);
    }
}