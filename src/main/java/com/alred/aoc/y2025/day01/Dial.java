package com.alred.aoc.y2025.day01;

public class Dial {

    private static final int MAX = 100;
    private int number;
    private int zeroClickCount;

    public Dial(int startNumber) {
        this.number = startNumber;
        this.zeroClickCount = 0;
    }

    public int getNumber() {
        return this.number;
    }

    public int getZeroClickCount() {
        return this.zeroClickCount;
    }

    public void turnRight(int count) {
        int total = number + count;

        this.zeroClickCount += total / MAX;
        this.number = total % MAX;
    }

    public void turnLeft(int count) {
        int value = (MAX - number) % MAX;
        this.zeroClickCount += (value + count) / MAX;

        int result = (number - count) % MAX;
        // Handle possible negative value
        this.number = (result + MAX) % MAX;
    }
}
