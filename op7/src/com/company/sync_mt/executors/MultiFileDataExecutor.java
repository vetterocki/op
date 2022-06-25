package com.company.sync_mt.executors;

import com.company.sync_mt.abstractions.FileDataExecutor;
import com.company.sync_mt.processors.FileStatisticsProcessor;
import com.company.sync_mt.processors.FileWordAnalyzer;
import com.company.sync_mt.util.ThreadGenerator;

import java.util.ArrayList;
import java.util.List;

public class MultiFileDataExecutor extends FileDataExecutor {

    public MultiFileDataExecutor(List<String> filenames) {
        super(filenames);
    }

    @Override
    public void execute() {
        List<FileWordAnalyzer> analyzers = new ArrayList<>();
        for (String name : filenames) {
            analyzers.add(new FileWordAnalyzer(name));
        }

        List<Thread> threads = ThreadGenerator.generateThreads(fileStatisticsProcessor, analyzers);


        threads.forEach(Thread::start);

        try {
            for (Thread thread : threads) {
                thread.join();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public FileStatisticsProcessor getFileStatisticsProcessor() {
        return fileStatisticsProcessor;
    }


    public List<String> getFilenames() {
        return filenames;
    }

    public void setFilenames(List<String> filenames) {
        this.filenames = filenames;
    }


}
