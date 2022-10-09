package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameResultTest {
    private Cars cars;
    private Progress progress;

    @BeforeEach
    void setUp() {
        String[] carNames = new String[]{"test", "test2"};
        cars = new Cars(carNames);
        progress = new Progress(3);
    }

    @Test
    void 매_차수_마다_자동차_진행한_값과_동일한지_비교() {
        for (int i = 0; i < progress.getCount(); i++) {
            cars.move();
            GameResult gameResult = new GameResult(cars);

            assertThat(gameResult.geResult()).usingRecursiveComparison().isEqualTo(cars);
        }
    }
}
