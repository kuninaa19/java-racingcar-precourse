package racingcar.model;

public class Name {
    private final String name;
    private static final int minSize = 1;
    private static final int maxSize = 5;

    public Name(String name) {
        if (!validateNameSize(name)) {
            throw new IllegalArgumentException("[ERROR] 이름은 1자 이상 5자 이하로 작성해주세요");
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
