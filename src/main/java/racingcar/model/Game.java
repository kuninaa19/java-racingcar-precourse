package racingcar.model;

public class Game {
    private GameStatus status;

    public void play() {
        status = GameStatus.PLAY;
    }

    public void end(){
        status = GameStatus.END;
    }

    public GameStatus getStatus() {
        return status;
    }
}
