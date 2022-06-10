package com.company.io;

public class Main {

    public static void main(String[] args) {
        WordFinder wordFinder = new WordFinder("data.txt");

        try {
            System.out.println(wordFinder.getCommonestWord());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
