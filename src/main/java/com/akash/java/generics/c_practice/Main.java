package com.akash.java.generics.c_practice;

/**
 * @author Akash M
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("akash");
        Teacher teacher = new Teacher("akash 's teacher");
        ProfessionPrinter<Student> studentProfessionPrinter = new ProfessionPrinter<>(student);
        ProfessionPrinter<Teacher> teacherProfessionPrinter = new ProfessionPrinter<>(teacher);
        studentProfessionPrinter.print();
        teacherProfessionPrinter.print();
    }
}
