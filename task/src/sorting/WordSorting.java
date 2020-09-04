package sorting;

import java.util.ArrayList;
import java.util.List;

public class WordSorting extends Sorter {
    private int countRepeated;
    private String longestWord;
    List<String> wordsToSort;
    private int percentage;

    public WordSorting() {
        this.countRepeated = 0;
        this.longestWord = "";
        wordsToSort = new ArrayList<>();

    }

    @Override
    public void read() {
        while (scanner.hasNext()) {
            counter += 1;
            wordsToSort.add(scanner.next());
        }
    }

    @Override
    public void sort() {
        longestWord = wordsToSort.get(0);

        for (String word : wordsToSort) {
            if (word.length() > longestWord.length()) {
                countRepeated = 1;
                longestWord = word;
            } else if (word.length() == longestWord.length()) {
                countRepeated += 1;
            }
        }
        percentage = (countRepeated * 100) / counter;
    }

    @Override
    public String toString() {
        return "Total words: " + counter + ".\n" +
                "The longest word: " + longestWord + " (" + countRepeated +
                " time(s), " + String.format("%d", percentage) + "%).";
    }
}
