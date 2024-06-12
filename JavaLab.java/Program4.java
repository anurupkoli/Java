// Model a lamp as a Java object. Make a Lamp class. This will contain atleast one instance variable which will 
// be of type Boolean and will hold the state of the lamp: i.e., whether it is on or off. In addition, add methods 
// to do the following things: switch the light on and off, and check its current state, i.e., whether it is on or off. 
// Maintain proper encapsulation mechanism.
// Next, write a launcher class with a main() method to carry out the following tasks:
//  create a lamp object;
//  turn it on and off;
//  print the lamp's on/off status to the console

class Lamp{
    private boolean state = false;
    public boolean getState(){
        return state;
    }
    
    public void toggleLamp(){
        state = !state;
    }

    public void reportLampState(){
        if(getState()){
            System.out.println("Lamp is on");
        }
        else
            System.out.println("Lamp is off");
    }
}

public class Program4 {
    public static void main(String[] args) {
        Lamp la = new Lamp();
        la.reportLampState();
        la.toggleLamp();
        la.reportLampState();
        la.toggleLamp();
        la.reportLampState();
    }
}
