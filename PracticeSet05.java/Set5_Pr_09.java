public class Set5_Pr_09 {
    public static void main(String[] args){
        int mul = 0;
        int mulNo = 8;
        int sum = 0;
        for(int i=1; i<=10; i++){
            mul = i*mulNo;
            sum += mul;
        }
        System.out.println(sum);
    }    
}
