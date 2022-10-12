package Test;

import java.time.LocalDate;
import java.util.Arrays;

public class MyPractice {
    public static void main(String[] args){
        Employee dwight = new Employee("dwight",30000,LocalDate.of(2018,9,1));
        var staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker",35000,LocalDate.now());
        staff[1] = new Employee("Carl Cracker", 75000, LocalDate.now());
        staff[2] = new Employee("Tony Tester", 50000, LocalDate.now());

        Arrays.sort(staff);

        for (Employee e:staff){
            System.out.println("name="+ e.getName()+", salary="+e.getSalary());
        }
    }
}

class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private LocalDate date;

    Employee(String nm, double slry, LocalDate d){
        this.name = nm;
        this.salary = slry;
        this.date = d;
    }

    double getSalary(){
        return salary;
    }

    String getName(){
        return name;
    }

    LocalDate getDate(){
        return date;
    }

    public int compareTo(Employee other){
        if(this.getClass()!=other.getClass())
            throw new ClassCastException();
        return Double.compare(this.salary,other.salary);
    }

}
