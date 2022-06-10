package com.company.stream;

import com.company.stream.task1and3.Committee;
import com.company.stream.task1and3.Enrollee;
import com.company.stream.task2.Faculty;
import com.company.stream.task2.Institute;
import com.company.stream.task2.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Enrollee> enrollees = new ArrayList<>(List.of(
                new Enrollee("H", 80),
                new Enrollee("K", 85),
                new Enrollee("G", 70),
                new Enrollee("L", 100),
                new Enrollee("O", 60),
                new Enrollee("C", 75),
                new Enrollee("F", 55),
                new Enrollee("I", 76),
                new Enrollee("A", 65),
                new Enrollee("D", 90),
                new Enrollee("U", 95)));

        Committee committee = new Committee(4, 3, enrollees);
        committee.getEnrolleeContractList().forEach(System.out::println);

        Faculty faculty1 = new Faculty("FICT", List.of(new Student("A", "B", 1, 89.3),
                new Student("A", "A", 2, 83.3),
                new Student("D", "A", 3, 78.4),
                new Student("D", "D", 4, 98.4)));

        Faculty faculty2 = new Faculty("FICT", List.of(new Student("C", "D", 5, 89.3),
                new Student("C", "C", 6, 83.3),
                new Student("F", "C", 7, 78.4),
                new Student("F", "F", 48, 98.4)));

        Institute institute = new Institute("KPI", List.of(faculty1, faculty2));
        institute.getAllStudentsList().forEach(System.out::println);
        committee.getFailedEnrolleList().forEach(System.out::println);




    }
}
