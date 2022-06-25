package com.company.sync_mt.printer;

import com.company.sync_mt.abstractions.ExecutorResultPrinter;
import com.company.sync_mt.processors.FileStatisticsProcessor;

public class FileDataResultPrinter implements ExecutorResultPrinter {

    @Override
    public void print(FileStatisticsProcessor processor) {
        processor.getStatisticsMap()
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);
    }
}
