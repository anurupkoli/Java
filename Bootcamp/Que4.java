import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Provide new Element with it's index");

        int givnEle = sc.nextInt();
        int givnIndx = sc.nextInt();

        int[] newArray = new int[size + 1];

        int i = 0;
        int k = 0;
        while (i < newArray.length) {
            if(i == givnIndx-1){
                newArray[i] = givnEle;
                k--;
            }
            else{
                newArray[i] = arr[k];
            }
            i++;  
            k++; 
        }

        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + " ");
        }
        sc.close();
    }
}






























