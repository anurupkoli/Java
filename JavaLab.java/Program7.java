import javax.xml.transform.SourceLocator;

// XYZ technologies is firm that has 5 employees with 1 manager, and 4 technicians. XYZ wants to digitize its 
// payroll system, the following requirements: Dearness Allowance is 70% of basic for all employees. House 
// Rent Allowance is 30% of basic for all employees. Income Tax is 40% of gross salary for all employees. The 
// annual increments to the employees are to be given of the following criteria: -Manager 10% of the basic 
// salary, and Technicians 15% of basic. Develop the pay roll for XYZ. Implement a class hierarchy using 
// inheritance, where Employee is an abstract class and Manager and Technician are derived from Employee. 
// Demonstrate a polymorphic behavior for giving the annual increments.
abstract class Employee{
    double da;
    String name;
    double hra;
    double it;
    double salary;
    Employee(String name, double sal){
        this.salary = sal;
        this.da = sal*0.7;
        this.hra = sal*0.3;
        this.it = sal*0.4;
        this.name = name;
    }
    abstract double grossSal();
}

class Manager extends Employee{
    double inc;
    Manager(String name, double sal){
        super(name, sal);
    }
    @Override
    double grossSal() {
        inc = salary*0.1;
        double gross = salary + da + hra - it + inc;
        System.out.println("Employee Desigatioin: Manager");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic salary: " + salary);
        System.out.println("Dearness allowence: " + da);
        System.out.println("House rent allowance: " + hra);
        System.out.println("Income tax: " + it);
        return gross;
    }
}

class Technician extends Employee{
    double inc;
    Technician(String name, double sal){
        super(name, sal);
    }
    @Override
    double grossSal() {
        inc = salary*0.15;
        double gross = salary + da + hra - it + inc;
        System.out.println("Employee Desigatioin: Technician");
        System.out.println("Employee Name: " + name);
        System.out.println("Basic salary: " + salary);
        System.out.println("Dearness allowence: " + da);
        System.out.println("House rent allowance: " + hra);
        System.out.println("Income tax: " + it);
        return gross;
    }
}

public class Program7{
    public static void main(String[] args) {
        Manager m = new Manager("Anurup", 80000);
        Technician t = new Technician("Abhay", 60000);
        Employee e;
        e = m;
        System.out.println("Gross salary: " + e.grossSal());
        e = t;
        System.out.println("Gross salary: " + e.grossSal());
    }
}