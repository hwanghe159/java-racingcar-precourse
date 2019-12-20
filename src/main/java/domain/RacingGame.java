package domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

	private static final List<Car> cars = new ArrayList<Car>();
	
	public void play() {
		prepare();
		gamePlay();
		result();
	}

	private void prepare() {
		UI.inputCarNamesMessage();
		split(UI.inputCarNames());
	}

	private void split(String carNames) {
		// TODO Auto-generated method stub
		
	}

	private void gamePlay() {
		// TODO Auto-generated method stub

	}

	private void result() {
		// TODO Auto-generated method stub

	}

}
