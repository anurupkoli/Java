abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void lift(){
        System.out.println("Picking....");
    }

    public void disconnect(){
        System.out.println("Disconnecting");
    }

    void playMusic(){
        System.out.println("Lalalalalalal");
    }

    void Calculator(){
        System.out.println("2+2 = 4");
    }
}

public class Set11_Pr_04 {
    public static void main(String[] args) {
        Telephone phone = new SmartTelephone();
        phone.disconnect();
    }    
}
