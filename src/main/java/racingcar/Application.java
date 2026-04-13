package racingcar;

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
