package com.company.sync_mt.util;

import com.company.sync_mt.processors.FileStatisticsProcessor;
import com.company.sync_mt.processors.FileWordAnalyzer;
import com.company.sync_mt.thread.RunnableImpl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadGenerator {

    public static List<Thread> generateThreads(FileStatisticsProcessor processor, Collection<FileWordAnalyzer> analyzers) {
        return analyzers.stream()
                .map(analyzer -> new Thread(new RunnableImpl(analyzer, processor)))
                .collect(Collectors.toList());
    }
}
