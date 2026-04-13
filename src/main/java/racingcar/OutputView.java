package racingcar;

import java.util.List;

public class OutputView {
	public static void printResult(List<Car> winners){
		List<String> winnerName = winners.stream()
			.map(Car::getName)
			.toList();
		System.out.println("final Winner : "+String.join(", ", winnerName));

	}
}
