package racingcar.model;

public class Progress {
    private final int count;

    public Progress(int count) {
        if (!validateCount(count)) {
            throw new IllegalArgumentException("[ERROR] 0이상의 값을 입력해주세요");
        }
        this.count = count;
    }

    private boolean validateCount(int count) {
        return count > 0;
    }

    public int getCount() {
        return this.count;
    }
}
