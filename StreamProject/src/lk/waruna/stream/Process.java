package lk.waruna.stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class Process {
    public static void main(String[] args) {


        System.out.println("Example 1");
        List<Employee> employees = Employee.getAllEmployee().stream()
                .map(e ->new Employee(e.getName(),e.getMarks()*2)).collect(Collectors.toList());


        //List<Employee> employees1 = Employee.getAllEmployee().stream().filter(e-> new Employee(e.getName().contains("i"))).collect(Collectors.toList());

        System.out.println("Example 2");
        List<Employee> employeeList = Employee.getAllEmployee().stream()
                .filter(e->e.getName().contains("i"))
                .map(e-> new Employee(e.getName(),e.getMarks()*3)).collect(Collectors.toList());

        System.out.println(employeeList);

        System.out.println("Example 3");


        List<Student>  students = Student.getAllStudent().stream()
                .filter(student -> Period.between(student.getDOB(),LocalDate.now()).getYears()>18)
                .collect(Collectors.toList());

        System.out.println(students);



    }

}
