package com.company.thread.util;

import com.company.thread.thread.CustomThread;

import java.util.ArrayList;
import java.util.List;

public class CustomThreadGenerator {
    public static List<CustomThread> generateThreads(int coefficient, int totalAmount, int threads) {
        int divider = totalAmount / threads;
        int left = totalAmount % threads;

        List<CustomThread> threadList = new ArrayList<>();

        for (int i = 0; i < totalAmount - left; i += divider) {
            if (i + divider != totalAmount){
                threadList.add(new CustomThread(i, i + divider, coefficient));
            } else {
                threadList.add(new CustomThread(i, totalAmount, coefficient));
            }
        }

        return threadList;
    }
}
