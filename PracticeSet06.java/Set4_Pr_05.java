import java.net.SocketTimeoutException;

public class Set4_Pr_05 {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6};
        int n = array.length;
        int length = array.length/2;
        int temp;
        for(int i=0; i<length; i++){
            temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
