class cylinder3{
    float radius;
    float height;

    public cylinder3(float radius, float height){
        this.radius = radius;
        this.height = height;
    }

    public void getRadius(){
        System.out.println(radius);
    }

    public void  getHeight(){
        System.out.println(height);
    }
}

public class Set9_Pr_03 {
    public static void main(String[] args) {
        cylinder3 cy = new cylinder3(4, 5);
        cy.getHeight();
        cy.getRadius();
    }
}
