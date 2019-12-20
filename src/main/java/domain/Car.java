package domain;

import java.util.Random;

public class Car {

	private static final int PROGRESS_OR_NOT_STANDARD = 4;

	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public void attempt() {
		Random random = new Random();
		if (random.nextInt(10) >= PROGRESS_OR_NOT_STANDARD) {
			progress();
		}
	}

	private void progress() {
		this.position++;
	}

	public String toString() {
		String info = this.name + " : ";
		for (int i = 0; i < this.position; i++) {
			info += "-";
		}
		return info;
	}
}
