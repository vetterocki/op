package com.company.thread.implementations;

import com.company.thread.abstraction.ProgressionSolver;

public class LoopProgressionSolver implements ProgressionSolver {
    @Override
    public long solve(int n, int N) {
        long sum = 0L;
        for (int i = 1; i <= N; i++) {
            long l = (long) i * n;
            sum += l;
        }
        return sum;
    }
}
