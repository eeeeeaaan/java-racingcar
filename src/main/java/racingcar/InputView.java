package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);
	private static final String DELIMITER = ",";

	public static List<String> getCarNames() {
		System.out.println("Enter car name to play the game.(please separate by ,)");
		String input = scanner.nextLine();

		validateEmpty(input);

		return Arrays.stream(input.split(DELIMITER))
			.map(String::trim) // 공백 제거
			.toList();
	}

	public static int getRounds() {
		System.out.println("How many times do you want to try?");
		String input = scanner.nextLine();

		try {
			int rounds = Integer.parseInt(input.trim());
			validatePositive(rounds);
			return rounds;
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("[ERROR] try number has to int");
		}
	}

	private static void validateEmpty(String input) {
		if (input == null || input.isBlank()) {
			throw new IllegalArgumentException("[ERROR] empty inpu");
		}
	}

	private static void validatePositive(int rounds) {
		if (rounds <= 0) {
			throw new IllegalArgumentException("[ERROR] trial is must over 1");
		}
	}
}
