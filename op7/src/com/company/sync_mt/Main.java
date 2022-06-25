package com.company.sync_mt;

import com.company.sync_mt.context.FileDataExecutorContext;
import com.company.sync_mt.executors.MultiFileDataExecutor;
import com.company.sync_mt.executors.SingleFileDataExecutor;
import com.company.sync_mt.util.TimeExecutionCalculator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            FileDataExecutorContext multi = new FileDataExecutorContext(
                    new MultiFileDataExecutor(List.of("data.txt", "data2.txt", "data3.txt")));

            FileDataExecutorContext single = new FileDataExecutorContext(
                    new SingleFileDataExecutor(List.of("data.txt", "data2.txt", "data3.txt")));

            multi.executeContext(true);
            single.executeContext(true);

            TimeExecutionCalculator.calculateTime(multi);
            TimeExecutionCalculator.calculateTime(single);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
