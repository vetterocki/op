package com.company.thread.implementations;

import com.company.thread.abstraction.ProgressionSolver;

public class SumProgressionSolver implements ProgressionSolver {
    @Override
    public long solve(int n, int N) {
        return ((2L * n + (long) n * (N - 1)) * N) / 2;
    }
}
