package models;

import enums.StudyProfile;

public class TestClass {
    public static void main(String[] args) {
        Student student = new Student("Petr", "11", 11, 11);
        System.out.println(student);
        University university = new University("1", "Student1", "stud", 2023, StudyProfile.MEDICINE );
        System.out.println(university);


    }
}
