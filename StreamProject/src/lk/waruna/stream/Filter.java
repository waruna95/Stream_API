package lk.waruna.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
          //List<Employee> employees =
//        employees.add(new Employee("Krish",90));
//        employees.add(new Employee("Hasini",92));
//        employees.add(new Employee("Bhagya",80));
//        employees.add(new Employee("Nuwan",88));
//        employees.add(new Employee("Suranga",70));
//        employees.add(new Employee("Amal",50));
//        employees.add(new Employee("Erandika",40));



        List<Employee> employeeList = Employee.getAllEmployee().stream().filter(e->e.getName().length()>5 && e.getMarks()>50).collect(Collectors.toList());
        System.out.println(employeeList);

    }
}
