package com.netcracker.domain.student;


public class MasterStudent extends Student {
    private String UndergraduateStudy;
    public void setUndergraduateStudy(String undergraduateStudy) {UndergraduateStudy = undergraduateStudy;}
    public String getUndergraduateStudy() {return UndergraduateStudy;}

    public MasterStudent(String fullName) {
        super(fullName);
}
    public MasterStudent(String fullName, String dirOfEducation) {
        super(fullName, dirOfEducation);
    }

    public MasterStudent(String fullName, String dirOfEducation, long numStudentTicket) {
        super(fullName, dirOfEducation, numStudentTicket);
    }
    public MasterStudent(String fullName, String dirOfEducation, long numStudentTicket,String undergraduateStudy) {
        super(fullName, dirOfEducation, numStudentTicket);
        UndergraduateStudy = undergraduateStudy;
    }




    @Override
    public String DataToString() {
        return "Студент: " + getFullName() + "\n" + "Номер студенческого: " + getNumStudentTicket() +
                "\n" + "Образование бакалавр: " + getDirOfEducation() +
                "\n" + "Образование Магистр: " + getUndergraduateStudy();
    }

}
