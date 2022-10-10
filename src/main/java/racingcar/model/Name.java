package racingcar.model;

import racingcar.utils.ErrorHandler;

public class Name {
    private final String name;
    private static final int minSize = 1;
    private static final int maxSize = 5;

    public Name(String name) {
        if (!validateNameSize(name)) {
            throw new IllegalArgumentException(ErrorHandler.NAME_LENGTH_ERROR);
        }
        this.name = name;
    }

    public static boolean validateNameSize(String name) {
        return name.length() >= minSize && name.length() <= maxSize;
    }

    public String getName() {
        return name;
    }
}
