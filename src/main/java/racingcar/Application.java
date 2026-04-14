package racingcar;

import racingcar.flow.Game;
import racingcar.strategy.distance.DistanceStrategy;
import racingcar.strategy.moving.MovingStrategy;
import racingcar.strategy.moving.RandomMovingStrategy;
import racingcar.strategy.distance.StaticDistance;

public class Application {
    public static void main(String[] args) {
        MovingStrategy movingStrategy = new RandomMovingStrategy();
        DistanceStrategy distanceStrategy = new StaticDistance();

        Game game = new Game(distanceStrategy, movingStrategy);

        try{
            game.run();
        } catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
