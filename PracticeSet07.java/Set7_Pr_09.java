import java.lang.instrument.ClassFileTransformer;
import java.util.Scanner;
public class Set7_Pr_09 {
    static float celsiusTOFarenheit(float c){
        float f = c*(9f/5f) + 32f;
        return f;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of temperature in celsius: ");
        float celsius = s.nextFloat();
        float farenheit = celsiusTOFarenheit(celsius);
        System.out.printf("The value of %.2fC in Farenheit is: %.2fF", celsius,farenheit);
    }
}
