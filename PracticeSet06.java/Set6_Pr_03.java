public class Set6_Pr_03 {
    public static void main(String[] args) {
       float []array = {99,56,87,63,54,75,88,87,78,72,99,100,33,65,75,87};
       float totalMarks = 0;
       for(float elements: array){
        totalMarks += elements;
       }
       System.out.println(totalMarks/array.length + "%"); 
    }
}
