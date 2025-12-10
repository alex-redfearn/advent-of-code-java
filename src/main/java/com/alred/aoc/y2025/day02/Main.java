package com.alred.aoc.y2025.day02;

import com.alred.aoc.utils.InputReader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Part 1
        long matchingHalvesSum = InputReader.streamCsv("src/main/resources/input/2025/day02/input.txt")
                .map(s -> s.split("-"))
                .flatMapToLong(strings -> PatternMatcher.findMatchingHalves(Long.parseLong(strings[0]), Long.parseLong(strings[1])).stream().mapToLong(Long::longValue))
                .sum();

        System.out.println(matchingHalvesSum);

        // Part 2
        long repeatingSequencesSum = InputReader.streamCsv("src/main/resources/input/2025/day02/input.txt")
                .map(s -> s.split("-"))
                .flatMapToLong(strings -> PatternMatcher.findRepeatingSequences(Long.parseLong(strings[0]), Long.parseLong(strings[1])).stream().mapToLong(Long::longValue))
                .sum();

        System.out.println(repeatingSequencesSum);
    }


}
