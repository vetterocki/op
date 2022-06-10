package com.company.stream.task1and3;

import java.util.Comparator;
import java.util.List;

public class Enrollee {
    private String surname;
    private int points;

    public Enrollee(String surname, int points) {
        this.surname = surname;
        this.points = points;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static Comparator<Enrollee> getEnrolLeePointsComparator() {
        return Comparator.comparingInt(Enrollee::getPoints);
    }

    public void getContractList(List<Enrollee> totalList, int budget, int contract) {
        /*totalList.stream()
                .sorted(getEnroleePointsComparator())
                .limit(totalList.size() - budget)
                .filter(e -> e.getPoints() > 60)
                .skip(totalList.size() - contract)
                .forEach(System.out::println);*/

    }

    @Override
    public String toString() {
        return "Enrollee{" +
                "surname='" + surname + '\'' +
                ", points=" + points +
                '}';
    }


}
