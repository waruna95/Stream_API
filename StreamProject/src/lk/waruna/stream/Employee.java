package lk.waruna.stream;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    String name;
    Integer marks;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name,Integer marks) {
        this.name = name;
        this.marks =marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name;
    }

    public static List<Employee> getAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("krish",90));
        employees.add(new Employee("Hasini",92));
        employees.add(new Employee("BhAgya",80));
        employees.add(new Employee("Nuwan",88));
        employees.add(new Employee("Suranga",70));
        employees.add(new Employee("Amal",50));
        employees.add(new Employee("Erandika",40));

            return employees;
    }

}
