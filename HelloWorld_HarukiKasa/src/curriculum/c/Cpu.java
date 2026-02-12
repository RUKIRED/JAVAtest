package curriculum.c;

import java.util.Random;

public class Cpu {

	public int choose() {
		// 0, 1, 2 のいずれかをランダムに返す
		return new Random().nextInt(3);
	}
}