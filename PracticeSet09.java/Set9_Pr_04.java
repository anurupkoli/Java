
class Rectangle1{
    float length;
    float breadth;
    public Rectangle1(){
        length = 4;
        breadth = 5;
    }

    public Rectangle1(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void getLength(){
        System.out.println(length);
    }

    public void getBreadth(){
        System.out.println(breadth);
    }
}


public class Set9_Pr_04 {
    public static void main(String[] args) {
        Rectangle1 re = new Rectangle1(5,10);
        re.getBreadth();
        re.getLength();
    }
}
