class cellPhone{
    public void ring(){
        System.out.println("Ringing..........");
    }
    public void vibrate(){
        System.out.println("Vibrating......");
    }
}

public class Set8_Pr_02 {
    public static void main(String[] args) {
        cellPhone myPhone = new cellPhone();
        myPhone.ring();
        myPhone.vibrate();
    }
}
