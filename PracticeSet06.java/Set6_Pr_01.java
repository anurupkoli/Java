public class Set6_Pr_01 {
    public static void main(String[] args){
        float [] array = {5.22f, 9.66f, 7.82f, 8.62f, 2.64f};
        float sum = 0;
        for(float elements : array){
            sum += elements;
        }
        System.out.printf("Sum is: %.2f", sum);
    }
}
