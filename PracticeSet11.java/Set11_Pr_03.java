class monkey{
    void jump(){
        System.out.println("Jumping");
    }

    void bite(){
        System.out.println("Biting.....");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("I am eating...");
    }

    @Override
    public void sleep(){
        System.out.println("I am eating");
    }

    void greet(){
        System.out.println("Good morning Idiots");
    }
}

public class Set11_Pr_03 {
    public static void main(String[] args){
        Human h = new Human();
        h.eat();
        h.jump();
        h.greet();
    }
}
