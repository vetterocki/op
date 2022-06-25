package com.company.sync_mt.processors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileWordAnalyzer {
    private String filename;
    private final List<String> wordsList;

    public FileWordAnalyzer(String filename) {
        this.filename = filename;
        this.wordsList = new ArrayList<>();

    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    private List<String> getListOfWords(String filename) throws IOException {
        List<String> wordsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordsList.addAll(Arrays.asList(words));
            }
        }

        return wordsList;
    }
    public String getCommonestWord() throws IOException {
        wordsList.addAll(getListOfWords(filename));
        Map<String, Integer> map = new HashMap<>();

        for (String word : wordsList) {
            int counter = 0;

            for (String temp : wordsList) {
                if (word.equals(temp)) {
                    counter++;
                }
            }
            map.put(word, counter);
        }

        String commonestWord = null;
        int maxValue = 0;
        for (var entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                commonestWord = entry.getKey();
            }
        }

        return commonestWord;

    }



    @Override
    public String toString() {
        return "Word{" +
                "filename='" + filename + '\'' +
                '}';
    }
}
