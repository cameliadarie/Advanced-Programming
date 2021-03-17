package com.company;

import java.util.*;

public class Problema {

    List<Student> studentList = new LinkedList<>();
    Set<School> schoolSet = new TreeSet<>();
    Map<Student, List<School>> preferinteStudenti = new HashMap<>();
    Map<School, List<Student>> preferinteScoli = new TreeMap<>();

    public Problema(List<Student> studentList, Set<School> schoolSet, Map<Student, List<School>> preferinteStudenti, Map<School, List<Student>> preferinteScoli) {
        this.studentList = studentList;
        this.schoolSet = schoolSet;
        this.preferinteStudenti = preferinteStudenti;
        this.preferinteScoli = preferinteScoli;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Set<School> getSchoolSet() {
        return schoolSet;
    }

    public void setSchoolSet(Set<School> schoolSet) {
        this.schoolSet = schoolSet;
    }

    public Map<Student, List<School>> getPreferinteStudenti() {
        return preferinteStudenti;
    }

    public void setPreferinteStudenti(Map<Student, List<School>> preferinteStudenti) {
        this.preferinteStudenti = preferinteStudenti;
    }

    public Map<School, List<Student>> getPreferinteScoli() {
        return preferinteScoli;
    }

    public void setPreferinteScoli(Map<School, List<Student>> preferinteScoli) {
        this.preferinteScoli = preferinteScoli;
    }
}
