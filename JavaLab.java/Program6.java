// The String class in JAVA has a static method compare To Ignore Case, which compares two strings and the 
// Arrays class has a static sort method. Build a JAVA program that creates an array of strings, use the sort 
// function from Arrays class to sort the strings by passing the compare To Ignore Case function as a parameter 
// to the sort function using method reference. Print the sorted array.
import java.util.*;;

public class Program6 {
    public static void main(String[] args) {
        String[] countries = {"India", "Japan", "Netherland", "USA", "netherland", "Canada", "China", "Pakistan", "Bangladesh","Vietnam", "cambodia"};
        System.out.println("Array before Sorting: "); 
        System.out.println(Arrays.toString(countries));
        int size = countries.length;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(countries[i].compareToIgnoreCase(countries[j]) > 0){
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(countries));
    }
}
