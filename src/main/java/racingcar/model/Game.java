package racingcar.model;

public class Game {
    private final Cars cars;
    private final Progress progress;
    private GameStatus status;

    public Game(Cars cars, Progress progress) {
        this.cars = cars;
        this.progress = progress;
    }

    public void play() {
        status = GameStatus.PLAY;
    }

    public void end() {
        status = GameStatus.END;
    }

    public GameStatus getStatus() {
        return status;
    }

    public int carCount() {
        return cars.size();
    }

    public int progressCount() {
        return progress.getCount();
    }
}
