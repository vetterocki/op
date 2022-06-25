package com.company.thread.util;

import com.company.thread.abstraction.ProgressionSolver;

import java.util.Arrays;

public class SolverPrinter {

    public static void printResults(int n, int N, ProgressionSolver... progressionSolvers) {
        Arrays.stream(progressionSolvers)
                .mapToLong(solver -> solver.solve(n, N))
                .forEach(System.out::println);
    }
}