package racingcar.model;

public class Progress {
    private final int count;

    public Progress(int count) {
        if (!validateCountSize(count)) {
            throw new IllegalArgumentException("[ERROR]");
        }
        this.count = count;
    }

    public boolean validateCountSize(int count) {
        return count > 0;
    }

    public int getCount() {
        return this.count;
    }
}
