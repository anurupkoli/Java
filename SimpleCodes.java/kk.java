public class kk {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int a = fibo(n-1);
        int b = fibo(n-2);
        int c = a+b;
        return c;
        
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibo(n));
        
    }
}
