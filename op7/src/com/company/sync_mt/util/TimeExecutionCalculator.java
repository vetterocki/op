package com.company.sync_mt.util;

import com.company.sync_mt.context.FileDataExecutorContext;

public class TimeExecutionCalculator {

    public static void calculateTime(FileDataExecutorContext context) {
        long startTime = System.nanoTime();
        context.executeContext(false);
        long stopTime = System.nanoTime();
        System.out.println((double) (stopTime - startTime) / 1_000_000 + " ms");

    }

}
