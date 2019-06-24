package lk.waruna.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    LocalDate DOB;

    public Student(String name, LocalDate DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public static List<Student> getAllStudent(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Krish",LocalDate.of(1995,04,03)));
        students.add(new Student("Hasini",LocalDate.of(1985,04,03)));
        students.add(new Student("Bhagya",LocalDate.of(1975,04,03)));
        students.add(new Student("Nuwan",LocalDate.of(1989,04,03)));
        students.add(new Student("Suranga",LocalDate.of(1999,04,03)));
        students.add(new Student("Amal",LocalDate.of(1997,04,03)));
        students.add(new Student("Erandika",LocalDate.of(1990,04,03)));

        return students;
    }

    @Override
    public String toString() {
        return name;
    }


}


