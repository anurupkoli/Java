public class Pow {
    public static void main(String[] args) {
        int base = 3;
        int pow = 3;
        int sum = 0;
        for (int i = 0; i < pow; i++) {
            if(i == 0){
                sum = 1;
            }
            sum = base * sum;
        }

        System.out.println(sum);
    }
}
