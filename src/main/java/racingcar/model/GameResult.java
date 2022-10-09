package racingcar.model;

public class GameResult {
    private final Cars cars;

    public GameResult(Cars cars) {
        this.cars = report(cars);
    }

    private Cars report(Cars cars) {
        Cars result = new Cars();

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.getCar(i);

            Car copiedCar = new Car(new Name(car.getName()), new Move(car.getMove()));
            result.addCar(copiedCar);
        }

        return result;
    }

    public Cars geResult() {
        return cars;
    }
}