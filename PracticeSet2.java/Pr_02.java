public class Pr_02 {
    public static void main(String[] args){
        char grade = 'c';
        char newGrade = (char)(grade+8);
        System.out.println("Encrypted grade: "+newGrade);

        System.out.println("Original grade: "+ (char)(newGrade -8));
    }
}
