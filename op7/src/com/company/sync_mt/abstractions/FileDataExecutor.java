package com.company.sync_mt.abstractions;

import com.company.sync_mt.processors.FileStatisticsProcessor;

import java.util.List;

public abstract class FileDataExecutor {
    protected FileStatisticsProcessor fileStatisticsProcessor;
    protected List<String> filenames;

    public FileDataExecutor(List<String> filenames) {
        this.fileStatisticsProcessor = new FileStatisticsProcessor();
        this.filenames = filenames;
    }

    public abstract void execute();

    public FileStatisticsProcessor getFileStatisticsProcessor() {
        return fileStatisticsProcessor;
    }

    public void setFileStatisticsProcessor(FileStatisticsProcessor fileStatisticsProcessor) {
        this.fileStatisticsProcessor = fileStatisticsProcessor;
    }

    public List<String> getFilenames() {
        return filenames;
    }

    public void setFilenames(List<String> filenames) {
        this.filenames = filenames;
    }
}
