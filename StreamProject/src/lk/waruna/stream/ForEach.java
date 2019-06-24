package lk.waruna.stream;

import java.util.Comparator;

public class ForEach {

    public static void main(String[] args) {
//
//        Employee.getAllEmployee().forEach(e->
//                System.out.println(e.getName()));
//
//
//        Employee.getAllEmployee().forEach(System.out::println);


        Employee.getAllEmployee().stream()
                .filter(employee -> employee.getName().length() >=5)
                .map(e->new Employee(e.getName().toUpperCase().charAt(0)+e.getName().substring(1)))
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach(System.out::println);

//                .map(e->new Employee(e.getName(),e.getMarks())).sorted((e1,e2)->e1.getName().compareTo(e2.getName()))



    }
}
