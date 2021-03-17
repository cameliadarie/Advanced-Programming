package com.company;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class Main {


    List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        var students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student(new  Faker().name().fullName(), (int) (Math.random() * 10)))
                .toArray(Student[]::new);


        var schools = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new School(new  Faker().name().fullName(), (int) (Math.random() * 10)))
                .toArray(School[]::new);


        List<Student> studentList = new LinkedList<>();
        studentList.addAll(Arrays.asList(students));
        Collections.sort(studentList, Comparator.comparing(Student::getGrade));
        Set<School> schoolSet = new TreeSet<>();
        schoolSet.addAll(Arrays.asList(schools));
        Map<Student, List<School>> preferinteStudenti = new HashMap<>();
        Map<School, List<Student>> preferinteScoli = new TreeMap<>();

        preferinteStudenti.put(students[0], Arrays.asList(schools[0], schools[1], schools[2]));
        preferinteStudenti.put(students[1], Arrays.asList(schools[2], schools[1], schools[3]));
        preferinteStudenti.put(students[2], Arrays.asList(schools[3], schools[1]));
        preferinteStudenti.put(students[3], Arrays.asList(schools[0], schools[1], schools[2], schools[3]));


        preferinteScoli.put(schools[0], Arrays.asList(students[1], students[2], students[3]));
        preferinteScoli.put(schools[1], Arrays.asList(students[0], students[3], students[2]));
        preferinteScoli.put(schools[2], Arrays.asList(students[1], students[2]));
        preferinteScoli.put(schools[3], Arrays.asList(students[1], students[2], students[0]));


        for (Map.Entry<School, List<Student>> me : preferinteScoli.entrySet()) {
            System.out.println(me.getKey().getNume());
            for (int i = 0; i < me.getValue().size(); i++) {
                System.out.println(me.getValue().get(i).getName() + " " +  me.getValue().get(i).getGrade());
            }
        }

        for (Map.Entry<Student, List<School>> a : preferinteStudenti.entrySet()) {
            System.out.println(a.getKey().getName());
            for (int i = 0; i < a.getValue().size(); i++) {
                System.out.println(a.getValue().get(i).getNume() + " " + a.getValue().get(i).getCapacity() );
            }
        }

        List<School> target = Arrays.asList(schools[0], schools[2]);
        List<Student> result = studentList.stream()
                .filter(std -> preferinteStudenti.get(std).containsAll(target))
                .collect(Collectors.toList());

        Map <School, Student> studentiTop = new HashMap<>();
        studentiTop.put(schools[0], students[1]);
        studentiTop.put(schools[1], students[0]);
        studentiTop.put(schools[2], students[1]);
        studentiTop.put(schools[3], students[1]);


        List <School> r = schoolSet.stream()
                .filter(std -> studentiTop.get(std).equals(students[0]))
                .collect(Collectors.toList());

Problema p= new Problema( studentList, schoolSet,  preferinteStudenti, preferinteScoli);
Solutie sol= new Solutie();
sol.rez(p);

    }
}