class employee{
    int salary;
    String name;
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String na){
        name = na;
    }
}
public class Set8_Pr_01 {
    public static void main(String[] args) {
        employee Anurup = new employee();
        Anurup.salary = 1000000;
        Anurup.setName("Anurup");
        System.out.println(Anurup.getName());
        System.out.println(Anurup.getSalary());
    }
}
