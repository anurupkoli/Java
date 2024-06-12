abstract class Animal {
    abstract void makeSound();
}

public class Anonymouns {
    public static void main(String[] args) {
        Animal dog = new Animal(){
            public void makeSound(){
                System.out.println("Barking");
            }
        };

        dog.makeSound();
    }
}
