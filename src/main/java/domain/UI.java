package domain;

import java.util.Scanner;

public class UI {

	public static void inputCarNamesMessage() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표 기준으로 구분)");
	}
	
	public static String inputCarNames() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}

}