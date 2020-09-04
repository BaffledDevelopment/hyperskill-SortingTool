package sorting;
import java.util.Scanner;

public abstract class Sorter {

    protected int counter;
    protected Scanner scanner;

    public Sorter() {

        this.counter = 0;
        scanner = new Scanner(System.in);
    }

    public abstract void read();

    public abstract void sort();

}

