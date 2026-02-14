package curriculum.c;

import java.util.Random;

public class Cpu {
	private final Random random = new Random();

	public int choose() {
		// 0, 1, 2 のいずれかをランダムに返す
		return random.nextInt(3);
	}
}