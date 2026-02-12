package curriculum.c;

public class Questinon6 {

	public static void main(String[] args) {
		/*----------------------------------------------
		 * Q1:じゃんけん
		 -----------------------------------------------*/

		Player player = new Player();
		Cpu cpu = new Cpu();

		while (true) {
			// 1. お互いの手を決める
			int p = player.choose();
			int c = cpu.choose();

			// 2. JankenUtilを使って名前を表示（static呼び出し）
			System.out.println("あなたの手: " + JankenUtil.toHandName(p));
			System.out.println("CPUの手: " + JankenUtil.toHandName(c));

			// 3. 勝敗判定（シンプルに比較）
			if (p == c) {
				System.out.println("あいこです。");
			} else if ((p == 0 && c == 1) || (p == 1 && c == 2) || (p == 2 && c == 0)) {
				System.out.println("あなたの勝ちです！");
				break; // ループを抜けて終了
			} else {
				System.out.println("あなたの負けです。");
			}
			System.out.println("---");
		}
	}
}
