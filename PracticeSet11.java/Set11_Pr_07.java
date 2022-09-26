interface TvRemote{
    void switchOn();
    void switchOff();
    void nextChannel();
}

class Tv implements TvRemote{
    public void switchOn(){
        System.out.println("Turning on Tv");
    }

    public void switchOff(){
        System.out.println("Turning off Tv");
    }

    public void nextChannel(){
        System.out.println("Next channel");
    }
}

public class Set11_Pr_07 {
    public static void main(String[] args){
        Tv tv = new Tv();
        tv.switchOn();
        tv.nextChannel();
        tv.switchOff();
    }
}
