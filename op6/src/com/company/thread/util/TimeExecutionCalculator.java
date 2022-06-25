package com.company.thread.util;

import com.company.thread.abstraction.ProgressionSolver;

public class TimeExecutionCalculator {

    public static void calculateTime(int n, int N, ProgressionSolver... solvers) {
        for (ProgressionSolver solver : solvers) {
            long startTime = System.nanoTime();
            solver.solve(n, N);
            long stopTime = System.nanoTime();
            System.out.println((double) (stopTime - startTime) / 1_000_000 + " ms");
        }
    }
}

