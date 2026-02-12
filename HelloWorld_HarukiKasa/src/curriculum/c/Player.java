package curriculum.c;

import java.util.Scanner;

public class Player {
	public int choose() {
		System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
		// 入力を受け取ってそのまま返す
		return new Scanner(System.in).nextInt();
	}
}