import java.util.ArrayList;

public class Que1{
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Abhay chutiya");
        student.add("Imran chutiya");
        student.add("ganesh");
        student.add("abhinandan");
        student.add("ganesh2 chutiya");
        student.remove("ganesh");
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
    }
}