package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {

        List<String> sortedDataEntries = new ArrayList<>();
        Sorter sorter = ArgumentParser.parseArgs(args); // в обьект с переменной сортер впихивается
        // статический метод парсарг класса АргументПарсер
        sorter.read();
        sorter.sort();
        System.out.println(sorter.toString());
    }
}
