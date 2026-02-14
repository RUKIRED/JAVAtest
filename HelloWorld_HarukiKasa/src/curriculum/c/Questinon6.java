package curriculum.c;

import java.util.Scanner;

public class Questinon6 {

	public static void main(String[] args) {
		/*----------------------------------------------
		 * Q1:じゃんけん
		 -----------------------------------------------*/

		Player player = new Player();
		Cpu cpu = new Cpu();
		Scanner sc = new Scanner(System.in);

		while (true) {
			// プレイヤー専用表示
			player.choose();
			// 1. Playerの手を決める
			int p = sc.nextInt();

			// Playerの手の判定
			if (p < 0 || p > 2) {
				System.out.println("0,1,2のいずれかを入力してください");
				System.out.println("---");
				continue;
			}

			// 2. JankenUtilを使って名前を表示（static呼び出し）
			int c = cpu.choose();// CPUの手を決める
			System.out.println("あなたの手: " + JankenUtil.toHandName(p));
			System.out.println("CPUの手: " + JankenUtil.toHandName(c));

			// 3. 勝敗判定（シンプルに比較）
			if (p == c) {
				System.out.println("あいこです。");
			} else if ((p == 0 && c == 1) || (p == 1 && c == 2) || (p == 2 && c == 0)) {
				System.out.println("あなたの勝ちです！");
				break; // ループを抜けて終了
			} else if ((p == 2 && c == 1) || (p == 0 && c == 2) || (p == 1 && c == 0)) {
				System.out.println("あなたの負けです。");
			} else {
				System.out.println("0~1を入力してください。");
			}
			System.out.println("---");
		}
		sc.close();

	}
}
