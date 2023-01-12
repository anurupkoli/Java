import java.util.Arrays;

public class Program11 <T extends Comparable<? super T>>{
    T[] arr;
    Program11(T[] arr){
        this.arr = arr;
    }

    T[] BubbleSort(){
        for(int i=arr.length; i>1; i--){
            for(int j=0; j<i-1; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    swapElements(j, arr);
                }
            }
        }
        return arr;
    }

    private void swapElements(int index, T[] arr){
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }
    public static void main(String[] args) {
        Integer[] intArr = {4, 5, 1, 2, 7, 8, 10, 6, 9, };
        Program11<Integer> bs = new Program11<>(intArr);
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(intArr));
        System.out.println("Integer array after sorting: ");
        System.out.println(Arrays.toString(bs.BubbleSort()));

        String[] strArr = {"Anurup", "Imran", "Rakesh", "Abhay"};
        Program11<String> bs2 = new Program11<>(strArr);
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(strArr));
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(bs2.BubbleSort()));
    }
}