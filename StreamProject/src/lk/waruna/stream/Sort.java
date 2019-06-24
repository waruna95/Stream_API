package lk.waruna.stream;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static void main(String[] args) {
        List<Employee> sortedEmployee = Employee.getAllEmployee().stream()
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

        System.out.println(sortedEmployee);

        List<Employee> sortedEmployee1 = Employee.getAllEmployee().stream()
                .sorted((e1,e2)-> new Integer(e1.getName().length()).compareTo(e2.getName().length()))
                .collect(Collectors.toList());

        System.out.println(sortedEmployee1);
    }
}
