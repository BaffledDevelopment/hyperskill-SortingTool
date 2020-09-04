package sorting;

public class ArgumentParser {
    public static Sorter parseArgs(String[] args) {
        for (String arg : args) {
            if ("-sortType".equals(arg)) {
                return new NumberSorting();
            }
        }

        for (int i = 0; i < args.length; i++) {
            if ("-dataType".equals(args[i])) {
                if (i == args.length - 1) {
                    return new WordSorting();
                } else {
                    return parseDataType(args[i + 1]);
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public static Sorter parseDataType(String argument) {
        switch (argument) {
            case "long":
                return new LongSorting();
            case "word":
                return new WordSorting();
            case "line":
                return new LineSorting();
            default:
                throw new IllegalArgumentException();
        }
    }
}
