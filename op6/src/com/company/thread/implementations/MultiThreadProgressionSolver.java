package com.company.thread.implementations;

import com.company.thread.abstraction.ProgressionSolver;
import com.company.thread.thread.CustomThread;
import com.company.thread.util.CustomThreadGenerator;

import java.util.List;

public class MultiThreadProgressionSolver implements ProgressionSolver {
    private final int threads;

    public MultiThreadProgressionSolver(int threads) {
        this.threads = threads;
    }

    @Override
    public long solve(int n, int N) {
        List<CustomThread> threads = CustomThreadGenerator.generateThreads(n, N, this.threads);

        threads.forEach(Thread::start);

        try {
            for (Thread t : threads) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return threads.stream().mapToLong(CustomThread::getResult).sum();
    }
}
