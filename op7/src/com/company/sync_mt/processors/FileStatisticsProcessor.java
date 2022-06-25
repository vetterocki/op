package com.company.sync_mt.processors;

import java.util.HashMap;
import java.util.Map;

public class FileStatisticsProcessor {
    private final Map<String, String> map;

    public FileStatisticsProcessor() {
        this.map = new HashMap<>();
    }

    public synchronized void updateStatisticsMap(String filename, String commonestWord) {
        map.put(filename, commonestWord);
    }

    public Map<String, String> getStatisticsMap() {
        return map;
    }
}