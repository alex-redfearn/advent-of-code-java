package com.alred.aoc.y2025.day02;

import java.util.ArrayList;
import java.util.List;

public class PatternMatcher {

    public static List<Long> findMatchingHalves(long start, long end) {
        ArrayList<Long> repeatedEvenSequenceList = new ArrayList<>();

        for (long i = start; i <= end; i++) {
            String id = String.valueOf(i);
            int length = id.length();

            if (length % 2 != 0)
                continue;

            int halfLength = length / 2;
            String left = id.substring(0, halfLength);
            String right = id.substring(halfLength);

            if (left.equals(right))
                repeatedEvenSequenceList.add(i);
        }

        return repeatedEvenSequenceList;
    }

    public static List<Long> findRepeatingSequences(long start, long end) {
        ArrayList<Long> allRepeatedSequenceList = new ArrayList<>();

        for (long i = start; i <= end; i++) {
            String id = String.valueOf(i);
            int length = id.length();

            for (int divisor = 1; divisor < length; divisor++) {
                if (length % divisor == 0) {

                    boolean match = true;
                    for (int index = 0; index < length - divisor; index += divisor) {
                        String current = id.substring(index, index + divisor);
                        String next = id.substring(index + divisor, index + divisor + divisor);

                        if (!current.equals(next)) {
                            match = false;
                            break;
                        }
                    }

                    if (match) {
                        allRepeatedSequenceList.add(i);
                        break;
                    }
                }
            }

        }

        return allRepeatedSequenceList;
    }

}
