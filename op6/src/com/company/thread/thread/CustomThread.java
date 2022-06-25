package com.company.thread.thread;

public class CustomThread extends Thread {
    private int from;
    private int to;
    private int coefficient;
    private long result;

    public CustomThread(int from, int to, int coefficient) {
        this.from = from;
        this.to = to;
        this.coefficient = coefficient;
    }

    @Override
    public void run() {
        for (int i = from + 1; i <= to; i++) {
            result += (long) i * coefficient;
        }


    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}
