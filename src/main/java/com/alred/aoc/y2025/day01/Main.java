package com.alred.aoc.y2025.day01;

import com.alred.aoc.utils.InputReader;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String rotations = "src/main/resources/input/2025/day01/input.txt";
        System.out.println(zeroCount(new Dial(50), rotations));
        System.out.println(zeroClickCount(new Dial(50), rotations));
    }

    private static int zeroCount(Dial dial, String rotations) {
        // Part 1
        try (Stream<String> input = InputReader.streamLines(rotations)) {

            return (int) input.map(line -> {
                        String direction = line.substring(0, 1);
                        int count = Integer.parseInt(line.substring(1));
                        return switch (direction) {
                            case "R" -> {
                                dial.turnRight(count);
                                yield dial.getNumber();
                            }
                            case "L" -> {
                                dial.turnLeft(count);
                                yield dial.getNumber();
                            }
                            default -> throw new RuntimeException("Unknown turn direction");
                        };
                    })
                    .filter(result -> result == 0)
                    .count();
        }
    }

    private static int zeroClickCount(Dial dial, String rotations) {
        // Part 2
        try (Stream<String> input = InputReader.streamLines(rotations)) {

            input.forEach(line -> {
                String direction = line.substring(0, 1);
                int count = Integer.parseInt(line.substring(1));
                switch (direction) {
                    case "R" -> dial.turnRight(count);
                    case "L" -> dial.turnLeft(count);
                    default -> throw new RuntimeException("Unknown turn direction");
                }
            });

            return dial.getZeroClickCount();
        }
    }
}
