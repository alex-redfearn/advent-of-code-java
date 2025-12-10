package com.alred.aoc.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class InputReader {

    /**
     * Provides a Stream<String> for line-by-line processing
     */
    public static Stream<String> streamLines(String path) {
        try {
            return Files.lines(Paths.get(path));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + path, e);
        }
    }


    /**
     * Stream comma-separated items across ALL lines.
     */
    public static Stream<String> streamCsv(String path) {
        return streamLines(path)
                .flatMap(line -> Stream.of(line.split(",")))
                .map(String::trim);
    }

}
