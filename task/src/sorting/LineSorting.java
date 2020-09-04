package sorting;

import java.util.ArrayList;
import java.util.List;

public class LineSorting extends Sorter {

    private String longestLine;
    List<String> linesToSort;
    private int percentage;
    protected int countRepeated;

    public LineSorting() {
        this.countRepeated = 0;
        this.longestLine = "";
        linesToSort = new ArrayList<>();
    }

    @Override
    public void read() {
        while(scanner.hasNextLine()) {
            counter += 1;
            linesToSort.add(scanner.nextLine());
        }
    }

    @Override
    public void sort() {

        longestLine = linesToSort.get(0);

        for (String line : linesToSort) {
            if (line.length() > longestLine.length()) {
                countRepeated = 1;
                longestLine = line;
            } else if (line.length() == longestLine.length()) {
                countRepeated += 1;
            }
        }
        percentage = countRepeated  * 100 / counter;
    }

    @Override
    public String toString() {
        return "Total lines: " + counter + ".\n" +
                "The longest line:\n" + longestLine + "\n(" + countRepeated +
                " time(s), " + String.format("%d", percentage) + "%).";
    }
}
