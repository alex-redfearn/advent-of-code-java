package com.alred.aoc.y2025.day03;

import com.alred.aoc.utils.InputReader;

public class Main {

    public static void main(String[] args) {
        // Part One
        int twoDigitVoltageSum = InputReader.streamLines("src/main/resources/input/2025/day03/input.txt")
                .mapToInt(VoltageReader::findLargestTwoDigitVoltage)
                .sum();

        System.out.println(twoDigitVoltageSum);

        // Part Two
        long twelveDigitVoltageSum = InputReader.streamLines("src/main/resources/input/2025/day03/input.txt")
                .mapToLong(VoltageReader::findLargestTwelveDigitVoltage)
                .sum();

        System.out.println(twelveDigitVoltageSum);
    }
}
