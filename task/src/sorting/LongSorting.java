package sorting;

import java.util.ArrayList;
import java.util.List;

public class LongSorting extends Sorter {

    private long maxLongNumber;
    private int percentage;
    private int countRepeated;
    private final List<Long> longsToSort;

    public LongSorting() {
        longsToSort = new ArrayList<>();
        this.maxLongNumber = 0;
        this.countRepeated = 0;
    }

    @Override
    public void read() {
        while (scanner.hasNextLong()) {
            counter += 1;
            longsToSort.add(scanner.nextLong());
        }
    }

    @Override
    public void sort() {

        maxLongNumber = longsToSort.get(0);

        for (long longNumber : longsToSort) {
            if (longNumber > maxLongNumber) {
                countRepeated = 1;
                maxLongNumber = longNumber;
            } else if (longNumber == maxLongNumber) {
                countRepeated += 1;
            }
        }

        percentage = (countRepeated * 100) / counter ;
    }

    @Override
    public String toString() {
        return "Total numbers: " + counter + ".\n" +
                "The greatest number: " + maxLongNumber + " (" + countRepeated +
                " time(s), " + String.format("%d", percentage) + "%).";
    }
}
