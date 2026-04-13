package racingcar.flow;

import java.util.List;

import racingcar.Car;
import racingcar.Cars;
import racingcar.strategy.distance.DistanceStrategy;
import racingcar.strategy.moving.MovingStrategy;

public class Game {
	private final DistanceStrategy distanceStrategy;
	private final MovingStrategy movingStrategy;
	private int rounds;

	public Game(DistanceStrategy distanceStrategy, MovingStrategy movingStrategy) {
		this.distanceStrategy = distanceStrategy;
		this.movingStrategy = movingStrategy;
	}

	public void run() {
		List<String> carNames = InputView.getCarNames();
		int rounds = InputView.getRounds();

		Cars cars = new Cars(carNames);

		System.out.println("\nExecution Result");
		for (int i = 0; i < rounds; i++) {
			cars.moveAll(movingStrategy, distanceStrategy);
			render(cars);
		}

		OutputView.printResult(cars.findWinners());
	}

	private void render(Cars cars) {
		for (Car car : cars.getCars()) {
			System.out.println(car.getName() + " : " + "-".repeat(car.getDistance()));
		}
		System.out.println();
	}


}
