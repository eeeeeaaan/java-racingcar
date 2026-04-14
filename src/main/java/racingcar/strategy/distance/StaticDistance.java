package racingcar.strategy.distance;

public class StaticDistance implements DistanceStrategy {
	@Override
	public int decisionDistance() {
		return 1;
	}
}
