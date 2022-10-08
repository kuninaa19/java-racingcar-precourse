package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarsTest {
    @Test
    void 자동차_2대_생성() {
        String[] carNames = "국내차,외제차".split(",");

        Cars cars = new Cars(carNames);

        assertThat(cars.size()).isEqualTo(2);
    }

    @Test
    void 자동차_이름_없음() {
        String[] carNames = "".split(",");

        assertThatThrownBy(() -> {
            Cars cars = new Cars(carNames);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}
