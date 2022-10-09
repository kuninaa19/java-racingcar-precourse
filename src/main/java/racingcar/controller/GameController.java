package racingcar.controller;

import racingcar.model.Cars;
import racingcar.model.Game;
import racingcar.model.Progress;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {

    /* 게임에서 사용될 5자 이하로 구성된 자동차 배열이 구성될때까지 재귀 */
    public Cars prepareCars() {
        try {
            return new Cars(InputView.inputCarNames());
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e);
        }

        return prepareCars();
    }

    /* 게임에서 사용될 1이상의 시도횟수 값을 받을때까지 재귀 */
    public Progress prepareProgressCount() {
        try {
            int count = InputView.inputProgressCount();
            return new Progress(count);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e);
        }
        return prepareProgressCount();
    }

    public void play(Cars cars, Progress progress) {
        Game game = new Game(cars, progress);
    }
}