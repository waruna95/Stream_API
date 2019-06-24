package lk.waruna.stream;

public class Array {
    public static void main(String[] args) {
        Employee[] employees = Employee.getAllEmployee().stream().toArray(Employee[]::new);

        for (Employee emp:employees) {


            System.out.println(emp);

        }
    }
}
