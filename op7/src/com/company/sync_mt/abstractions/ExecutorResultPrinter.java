package com.company.sync_mt.abstractions;

import com.company.sync_mt.processors.FileStatisticsProcessor;

public interface ExecutorResultPrinter {
    void print(FileStatisticsProcessor processor);
}
