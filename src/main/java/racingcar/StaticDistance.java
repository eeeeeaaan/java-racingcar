package racingcar;

public class StaticDistance implements DistanceStrategy{
	@Override
	public int decisionDistance() {
		return 1;
	}
}
