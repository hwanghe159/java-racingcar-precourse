package domain;

import java.util.Random;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

	public void attempt() {
		Random random = new Random();
		if(random.nextInt(10)>=4) {
			
		}
	}
	
	private void progress() {
		this.position++;
	}
}
