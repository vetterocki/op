package com.company.stream.task1and3;

import java.util.List;
import java.util.stream.Collectors;

public class Committee {
    private int budgetAmount;
    private int contractAmount;
    private List<Enrollee> enrolleeList;

    public Committee(int budgetAmount, int contractAmount, List<Enrollee> enrolleeList) {
        this.budgetAmount = budgetAmount;
        this.contractAmount = contractAmount;
        this.enrolleeList = enrolleeList;
    }

    public List<Enrollee> getEnrolleeContractList() {
        return enrolleeList.stream()
                .sorted(Enrollee.getEnrolLeePointsComparator().reversed())
                .skip(budgetAmount)
                .filter(elem -> elem.getPoints() > 60)
                .collect(Collectors.toList());
    }

    public List<String> getFailedEnrolleList() {
        return enrolleeList.stream()
                .filter(enrollee -> enrollee.getPoints() < 60)
                .map(Enrollee::getSurname)
                .collect(Collectors.toList());
    }

    public int getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(int budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public int getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(int contractAmount) {
        this.contractAmount = contractAmount;
    }

    public List<Enrollee> getEnrolleeList() {
        return enrolleeList;
    }

    public void setEnrolleeList(List<Enrollee> enrolleeList) {
        this.enrolleeList = enrolleeList;
    }

    @Override
    public String toString() {
        return "Committee{" +
                "budgetAmount=" + budgetAmount +
                ", contractAmount=" + contractAmount +
                ", enrolleeList=" + enrolleeList +
                '}';
    }
}
