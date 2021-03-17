package com.company;

import java.util.Comparator;

public class Student implements Comparator<Student> {

    private String Name;
    private int grade;

    public Student(String name, int grade) {
        Name = name;
        this.grade = grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.grade- o2.grade;
    }


}
