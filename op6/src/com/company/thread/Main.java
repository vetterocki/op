package com.company.thread;

import com.company.thread.abstraction.ProgressionSolver;
import com.company.thread.implementations.LoopProgressionSolver;
import com.company.thread.implementations.MultiThreadProgressionSolver;
import com.company.thread.implementations.SumProgressionSolver;
import com.company.thread.util.SolverPrinter;
import com.company.thread.util.TimeExecutionCalculator;

public class Main {
    public static void main(String[] args) {
        ProgressionSolver solver1 = new SumProgressionSolver();
        ProgressionSolver solver2 = new LoopProgressionSolver();
        ProgressionSolver solver3 = new MultiThreadProgressionSolver(2);
        ProgressionSolver solver4 = new MultiThreadProgressionSolver(4);
        ProgressionSolver solver5 = new MultiThreadProgressionSolver(8);
        ProgressionSolver solver6 = new MultiThreadProgressionSolver(16);
        ProgressionSolver solver7 = new MultiThreadProgressionSolver(32);


        SolverPrinter.printResults(6, 400_000_000, solver1, solver2, solver3,
                solver4, solver5, solver6, solver7);
        TimeExecutionCalculator.calculateTime(6, 400_000_000, solver1, solver2, solver3,
                solver4, solver5, solver6, solver7);

    }

}


