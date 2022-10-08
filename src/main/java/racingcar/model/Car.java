package racingcar.model;

public class Car {
    private final Move move;
    private final Name name;

    public Car(Name name) {
        this.name = name;
        this.move = new Move();
    }

    public void move(int randomNumber) {
        move.move(randomNumber);
    }

    public int getMove() {
        return move.getMove();
    }

    public String getName() {
        return this.name.getName();
    }
}