package racingcar.model;

public class Move {
    private int count;

    public Move() {
        count = 0;
    }

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            count++;
        }
    }

    public int getMove() {
        return count;
    }
}
