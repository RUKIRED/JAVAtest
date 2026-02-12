package curriculum.c;

import java.util.Scanner;

public class Player {
	// 1つだけのScannerを使い回す
	private final Scanner sc = new Scanner(System.in);

	public int choose() {
		System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
		return sc.nextInt();
	}
}