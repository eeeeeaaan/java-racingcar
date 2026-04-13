package racingcar;

public class RandomMovingStrategy implements MovingStrategy {

	@Override
	public boolean movable(){
		return RandomUtil.getRandomInt() > 4;
	}
}
