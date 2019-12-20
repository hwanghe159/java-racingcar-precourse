package domain;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;

public class RacingGame {

	private static List<Car> cars;
	private static int ATTEMPT_NUM;
	
	public void play() {
		prepare();
		gamePlay();
		result();
	}

	private void prepare() {
		UI.inputCarNamesMessage();
		splitCarNames(UI.inputCarNames());
		UI.inputAttemptNumbersMessage();
		ATTEMPT_NUM = UI.inputAttemptNumbers();
	}

	private void splitCarNames(String carNames) {
		if(carNames.isEmpty()) {
			throw new IllegalArgumentException("자동차 이름들을 입력해주세요.");
		}
		if(carNames.contains(",,")) {
			throw new IllegalArgumentException("자동차 이름들을 올바르게 입력해주세요.");
		}
		cars = new ArrayList(Arrays.asList(carNames.split(",")));
	}

	private void gamePlay() {
		UI.printExecutionResultMessage();

	}

	private void result() {
		// TODO Auto-generated method stub

	}

}
