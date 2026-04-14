package racingcar.strategy.moving;

import racingcar.util.RandomUtil;

public class RandomMovingStrategy implements MovingStrategy {

	@Override
	public boolean movable(){
		return RandomUtil.getRandomInt() > 4;
	}
}
