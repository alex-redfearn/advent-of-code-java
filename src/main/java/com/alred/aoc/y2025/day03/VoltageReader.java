package com.alred.aoc.y2025.day03;

/**
 * Utility class for determining battery pack "joltage" values based on
 * selecting the largest available cell values in order.
 *
 * <p>A battery pack is represented as a string of digits (e.g. "987654321111111"),
 * where each digit represents a cell's value. The "joltage" is formed by
 * concatenating selected cell values in sequence.</p>
 */
public class VoltageReader {

    public static int findLargestTwoDigitVoltage(String battery) {
        String voltage = "";

        int cellOneIndex = findLargestValueIndex(battery, 0, battery.length() - 1);
        voltage += String.valueOf(battery.charAt(cellOneIndex));
        voltage += String.valueOf(battery.charAt(findLargestValueIndex(battery, cellOneIndex + 1, battery.length())));

        return Integer.parseInt(voltage);
    }

    public static long findLargestTwelveDigitVoltage(String battery) {
        StringBuilder voltage = new StringBuilder();

        int startIndex = -1;
        for (int i = 11; i >= 0; i--) {
            int cellIndex = findLargestValueIndex(battery, startIndex + 1, battery.length() - i);
            voltage.append(battery.charAt(cellIndex));
            startIndex = cellIndex;
        }

        return Long.parseLong(voltage.toString());
    }

    /**
     * Finds the index of the largest digit within a section of the battery string.
     *
     * @param battery    the string of digit characters
     * @param startIndex inclusive start index to search from
     * @param endIndex   exclusive end index to search to
     * @return the index of the largest digit between the given bounds
     */
    private static int findLargestValueIndex(String battery, int startIndex, int endIndex) {
        int voltage = 0;
        int index = 0;
        for (int i = startIndex; i < endIndex; i++) {
            int cell = battery.charAt(i) - '0'; // The characters '0' to '9' are sequential in ASCII: '0' = 48, '1' = 49, '2' = 50, etc...
            if (cell > voltage) {
                voltage = cell;
                index = i;
            }
        }

        return index;
    }
}
