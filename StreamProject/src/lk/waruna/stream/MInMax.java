package lk.waruna.stream;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.Optional;

public class MInMax {
    public static void main(String[] args) {
        Optional<Employee> employee = Employee.getAllEmployee().stream()
                .min(Comparator.comparing(Employee::getMarks));

        System.out.println(employee);

        Optional<Employee> employee1 = Employee.getAllEmployee().stream()
                .max(Comparator.comparing(Employee::getMarks));

        System.out.println(employee1);
    }
}
