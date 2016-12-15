package random;

import java.util.Random;

public class Rand7 {

	private static int rand5() {
		Random random = new Random();
		return random.nextInt(5);
	}

	public static int rand7() {
		int rand = 6 * rand5() + rand5();
	return 0;
	
	//4x+5
	}

	public static void main(String[] arg) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(5 * i + j);
			}
		}

	}
}
