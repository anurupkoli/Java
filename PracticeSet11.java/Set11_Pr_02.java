abstract class pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends pen{
    void write(){
        System.out.println("Writing");
    }

    void refill(){
        System.out.println("Ready to refill");
    }

    void ChangeNib(){
        System.out.println("Changing nib");
    }
}


public class Set11_Pr_02 {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.ChangeNib();
        pen.write();
        pen.refill();
    }
}
