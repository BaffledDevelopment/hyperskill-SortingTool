package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorting extends Sorter{

    private long maxNumber;
    List<Integer> numbersToSort;
    private int percentage;

    public NumberSorting() {
        numbersToSort = new ArrayList<>();
        this.percentage = 0;
        this.maxNumber = 0;

    }

    @Override
    public void read() {
        while (scanner.hasNextInt()) {
            counter += 1;
            numbersToSort.add(scanner.nextInt());
        }
    }

    @Override
    public void sort() {
        Collections.sort(numbersToSort);
//        System.out.println("Total numbers: " + counter + ".\nSorted data: ");
//        numbersToSort.forEach((n) -> System.out.print(n + " "));
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Total numbers: " + counter + ".\n" +
                "Sorted data: ");
        for (int i = 0; i < numbersToSort.size(); i++) {
            if (i == (numbersToSort.size() - 1)) {
                output.append(numbersToSort.get(i));
            } else {
                output.append(numbersToSort.get(i)).append(" ");
            }
        }
        return output.toString();
    }
}
