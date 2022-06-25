package com.company.sync_mt.thread;

import com.company.sync_mt.processors.FileStatisticsProcessor;
import com.company.sync_mt.processors.FileWordAnalyzer;

import java.io.IOException;

public class RunnableImpl implements Runnable{
    private final FileWordAnalyzer fileWordAnalyzer;
    private final FileStatisticsProcessor fileStatisticsProcessor;

    public RunnableImpl(FileWordAnalyzer commonestWordFinder, FileStatisticsProcessor fileStatisticsProcessor) {
        this.fileWordAnalyzer = commonestWordFinder;
        this.fileStatisticsProcessor = fileStatisticsProcessor;
    }

    @Override
    public void run() {
        try {
            String word = fileWordAnalyzer.getCommonestWord();
            fileStatisticsProcessor.updateStatisticsMap(fileWordAnalyzer.getFilename(), word);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FileWordAnalyzer getCommonestWordFinder() {
        return fileWordAnalyzer;
    }

    public FileStatisticsProcessor getFileStatisticsProcessor() {
        return fileStatisticsProcessor;
    }

}
