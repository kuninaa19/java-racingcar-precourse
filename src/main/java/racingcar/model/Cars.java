package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] carNames) {
        this.cars = mapCars(carNames);
    }

    private List<Car> mapCars(String[] carNames) {
        List<Car> cars = new ArrayList<Car>();

        for (String carName : carNames) {
            Name name = new Name(carName);
            Car car = new Car(name);
            cars.add(car);
        }

        return cars;
    }

    public void move() {
        for (Car car : cars) {
            int randomNumber = RandomNumber.pickNumber();
            car.move(randomNumber);
        }
    }

    public int size() {
        return cars.size();
    }
}
