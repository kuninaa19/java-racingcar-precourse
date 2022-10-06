package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    @Test
    void 자동차_이름_생성() {
        Name carName = new Name("자동차이름");
        Car car = new Car(carName);

        assertThat(car.getName()).isEqualTo("자동차이름");
    }
}