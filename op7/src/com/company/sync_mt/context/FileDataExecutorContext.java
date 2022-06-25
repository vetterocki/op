package com.company.sync_mt.context;

import com.company.sync_mt.abstractions.ExecutorResultPrinter;
import com.company.sync_mt.abstractions.FileDataExecutor;
import com.company.sync_mt.printer.FileDataResultPrinter;

public class FileDataExecutorContext {
    private final ExecutorResultPrinter printer;
    private final FileDataExecutor executor;

    public FileDataExecutorContext(FileDataExecutor executor) {
        this.printer = new FileDataResultPrinter();
        this.executor = executor;
    }

    public void executeContext(boolean flag) {
        this.executor.execute();
        if (flag) {
            this.printer.print(executor.getFileStatisticsProcessor());
        }

    }


}
