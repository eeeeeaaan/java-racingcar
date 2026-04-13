package racingcar;

import java.util.Collections;
import java.util.List;

public class Cars {
	private final List<Car> cars;

	public Cars(List<String> names) {
		// 이름 리스트를 받아서 Car 객체 리스트로 변환
		this.cars = names.stream()
			.map(Car::new)
			.toList();
	}

	public void moveAll(MovingStrategy movingStrategy, DistanceStrategy distanceStrategy) {
		for (Car car : cars) {
			car.move(movingStrategy, distanceStrategy);
		}
	}

	public List<Car> getCars() {
		return Collections.unmodifiableList(cars);
	}

	public List<Car> findWinners(){
		int maxDistance = cars.stream()
			.mapToInt(Car::getDistance)
			.max()
			.orElse(0);

		return cars.stream().filter(car -> car.getDistance() == maxDistance)
			.toList();
	}
}
