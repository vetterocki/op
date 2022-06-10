package com.company.stream.task2;

import java.util.List;
import java.util.stream.Collectors;

public class Institute {
    private String name;
    private List<Faculty> facultyList;

    public Institute(String name, List<Faculty> facultyList) {
        this.name = name;
        this.facultyList = facultyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    public List<Student> getAllStudentsList() {
        List<Student> students = facultyList
                .stream()
                .flatMap(faculty -> faculty.getStudentList().stream())
                .toList();
        return students.stream()
                .sorted(Student.getStudentComparator())
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", facultyList=" + facultyList +
                '}';
    }
}
