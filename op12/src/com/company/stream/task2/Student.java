package com.company.stream.task2;

import java.util.Comparator;

public class Student {
    private String name;
    private String surname;
    private long id;
    private double averagePoints;

    public Student(String name, String surname, long id, double averagePoints) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averagePoints = averagePoints;
    }

    public static Comparator<Student> getStudentComparator() {
        return Comparator.comparing(Student::getSurname)
                .thenComparing(Student::getName)
                .thenComparing(Student::getSurname)
                .thenComparing(Student::getId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAveragePoints() {
        return averagePoints;
    }

    public void setAveragePoints(double averagePoints) {
        this.averagePoints = averagePoints;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", averagePoints=" + averagePoints +
                '}';
    }
}
