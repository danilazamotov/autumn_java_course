package com.netcracker.domain;

import com.netcracker.domain.student.MasterStudent;
import com.netcracker.domain.student.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Имя Фамилия Отчество");

        MasterStudent masterStudent = new MasterStudent("Имя Фамилия Отчество", "Институт Физики", 1111111, "Институт Физики");
        System.out.println(student.DataToString());
        System.out.println(masterStudent.DataToString());
    }
}
