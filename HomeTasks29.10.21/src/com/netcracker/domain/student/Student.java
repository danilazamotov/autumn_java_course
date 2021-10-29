package com.netcracker.domain.student;

public class Student implements ToString {
    private String FullName;
    private String DirOfEducation;
    private long NumStudentTicket;

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setDirOfEducation(String dirOfEducation) {
        DirOfEducation = dirOfEducation;
    }

    public void setNumStudentTicket(long numStudentTicket) {
        NumStudentTicket = numStudentTicket;
    }

    public String getFullName() {return FullName;}

    public String getDirOfEducation() {return DirOfEducation;}

    public long getNumStudentTicket() {return NumStudentTicket;}

    public Student(String fullName, String dirOfEducation, long numStudentTicket) {
        FullName = fullName;
        DirOfEducation = dirOfEducation;
        NumStudentTicket = numStudentTicket;
    }

    public Student(String fullName, String dirOfEducation) {
        FullName = fullName;
        DirOfEducation = dirOfEducation;
    }

    public Student(String fullName) { FullName = fullName; }

    @Override
    public String DataToString() {
        return "Студент: " + getFullName() + "\n" + "Номер студенческого: " + getNumStudentTicket() +
                "n" + "Образование бакалавр: " + getDirOfEducation();

    }

}

