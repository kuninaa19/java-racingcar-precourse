package racingcar.model;

public class Move {
    private int count;

    public Move() {
        count = 0;
    }

    public Move(int count) {
        this.count = count;
    }

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            count++;
        }
    }

    public int getMove() {
        return count;
    }

    public boolean matchMoveCount(Move move) {
        return this.count == move.count;
    }
}
