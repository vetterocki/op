package com.company.sync_mt.executors;

import com.company.sync_mt.abstractions.FileDataExecutor;
import com.company.sync_mt.processors.FileWordAnalyzer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SingleFileDataExecutor extends FileDataExecutor {

    public SingleFileDataExecutor(List<String> filenames) {
        super(filenames);
    }

    @Override
    public void execute() {
        List<FileWordAnalyzer> analyzers = new ArrayList<>();
        for (String filename : filenames) {
            analyzers.add(new FileWordAnalyzer(filename));
        }
        for (FileWordAnalyzer analyzer : analyzers) {
            try {
                fileStatisticsProcessor.updateStatisticsMap(analyzer.getFilename(), analyzer.getCommonestWord());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
