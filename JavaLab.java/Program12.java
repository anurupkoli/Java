import java.util.ArrayList;

public class Program12 {
    static double add(ArrayList<? extends Number> num){
        double sum = 0;
        double den = 2.0;
        for(Number n: num){
            if(n.doubleValue()%den != 0){
                sum += n.doubleValue();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(21);
        arr.add(35);
        arr.add(42);
        arr.add(55);
        System.out.println("Displaying the sum: " + add(arr));
    }
}
