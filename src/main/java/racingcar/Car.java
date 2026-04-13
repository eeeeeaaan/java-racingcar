package racingcar;

import racingcar.strategy.distance.DistanceStrategy;
import racingcar.strategy.moving.MovingStrategy;

public class Car {
	private String name;
	private int distance=0;

	public Car(String name){
		validateName(name);
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public int getDistance(){
		return this.distance;
	}

	private void validateName(String name) {
		if (name == null || name.isBlank() || name.length() > 5) {
			throw new IllegalArgumentException("이름은 1자 이상 5자 이하만 가능합니다.");
		}
	}

	public void move(MovingStrategy movingStrategy, DistanceStrategy distanceStrategy){
		if(movingStrategy.movable())
			distance += distanceStrategy.decisionDistance();
	}
}
