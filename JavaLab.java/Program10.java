import java.util.ArrayList;
import java.util.ListIterator;

// Create a class Student that has instance variables as Name, Age, Address and access transmutation methods 
// to access the instance variables along with display method to print the details of student. Next write a main() 
// function that will create a collection of 10 students and reverse the list. Print the details before and after 
// reversing the collection

class Student{
    private String name;
    private int age;
    private String address;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
}

public class Program10 {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();
        Student stu1 = new Student();
        stu1.setName("Anurup");
        stu1.setAge(19);
        stu1.setAddress("Koli Galli");

        Student st2 = new Student();
        st2.setName("Abhay");
        st2.setAge(21);
        st2.setAddress("Bidar");

        stu.add(stu1);
        stu.add(st2);
        
        ListIterator listr = (ListIterator)stu.listIterator();
        System.out.println("Array before reversing: ");
        System.out.println();
        while(listr.hasNext()){
            Student st = (Student)listr.next();
            System.out.println("Student name: " + st.getName());
            System.out.println("Address: " + st.getAddress());
            System.out.println("Age: " + st.getAge());
            System.out.println();
        }

        System.out.println("Array after reversing: ");
        System.out.println();
        while(listr.hasPrevious()){
            Student st = (Student)listr.previous();
            System.out.println("Name: " + st.getName());
            System.out.println("Address: " + st.getAddress());
            System.out.println("Age: " + st.getAge());
            System.out.println();
        }
    }
}
