
class tommyVecetti{
    public void Run(){
        System.out.println("Running.....");
    }
    public void Hit(){
        System.out.println("Hitting.....");
    }
    public void Fire(){
        System.out.println("Firing.....");
    }
}

public class Set8_Pr_05 {
    public static void main(String[] args) {
        tommyVecetti tommy = new tommyVecetti();
        tommy.Fire();
        tommy.Hit();
        tommy.Run();
    }
}
