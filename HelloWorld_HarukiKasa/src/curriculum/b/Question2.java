package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		/*----------------------------------------
		 * Q1:合否判定
		 ----------------------------------------*/
		//int型の変数scoreに75を代入
		int score = 75;
		//60点以上なら合格と表示
		if (score >= 60) {
			System.out.println("合格");
		}

		/*----------------------------------------
		 * Q2:適正年齢の判別
		 ----------------------------------------*/
		//int型の変数ageに25を代入
		int age = 25;
		//適正年齢か対象外かを文字列で表示
		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}

		/*----------------------------------------
		 * Q3:年齢ごとの呼称の振り分け
		 ----------------------------------------*/
		//int型の変数ageに18を代入
		age = 18;
		//年齢区分を文字列で表示
		if (age >= 20) {
			System.out.println("成人です");
		} else if (age >= 13) {
			System.out.println("ティーンエイジャーです");
		} else {
			System.out.println("子供です");
		}

		/*----------------------------------------
		 * Q4:一番大きな数の判別
		 ----------------------------------------*/
		//int型の変数x,y,zを宣言・初期化
		int x = 30, y = 15, z = 50;
		//一番大きい値を表示
		if (x >= y && x >= z) {
			System.out.println(x);
		} else if (y >= x && y >= z) {
			System.out.println(y);
		} else if (z >= x && z >= y) {
			System.out.println(z);
		}

		/*----------------------------------------
		 * Q5:値の正負の判別
		 ----------------------------------------*/
		int num = 0;
		//正負の判別
		if (num > 0) {
			System.out.println("正の数です");
		} else if (num < 0) {
			System.out.println("負の数です");
		} else {
			System.out.println("0です");
		}

		/*----------------------------------------
		 * Q6:偶奇判別
		 ----------------------------------------*/
		//Scannerを用意
		Scanner sc = new Scanner(System.in);
		//コンソール入力した値をvalueに代入
		int value = sc.nextInt();
		//,2で割ったあまりが0になることを利用して偶奇判定
		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}

		/*----------------------------------------
		 * Q7:点数の評価
		 ----------------------------------------*/
		//コンソール入力から値を代入
		int score2 = sc.nextInt();
		//点数の評価
		if (score2 >= 90) {
			System.out.println("優");
		} else if (score2 >= 70) {
			System.out.println("良");
		} else if (score2 >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}

		/*----------------------------------------
		 * Q8:無効な入力の警告
		 ----------------------------------------*/
		//改行エラーを防ぐ
		sc.nextLine();
		//コンソール入力で文字列を参照
		String input = sc.nextLine();
		//nullとから文字に反応
		if (input == null || input.isEmpty()) {
			System.out.println("入力が無効です");
		}

		/*----------------------------------------
		 * Q9:曜日の判別
		 ----------------------------------------*/
		// 曜日を表す（1=月曜日, 2=火曜日, …, 7=日曜日）
		int day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("今日は月曜日です");
			break;
		case 2:
			System.out.println("今日は火曜日です");
			break;
		case 3:
			System.out.println("今日は水曜日です");
			break;
		case 4:
			System.out.println("今日は木曜日です");
			break;
		case 5:
			System.out.println("今日は金曜日です");
			break;
		case 6:
			System.out.println("今日は土曜日です");
			break;
		case 7:
			System.out.println("今日は日曜日です");
			break;
		default:
			System.out.println("無効な値です");
		}

		/*----------------------------------------
		 * Q10:季節の判別
		 ----------------------------------------*/
		//Scannerを用意

		//monthには月の数字が入る（例：1月→１）
		int month = sc.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		default:
			System.out.println("無効な月です");
		}
		//スキャナーを閉じてリソースを解放
		sc.close();
	}
}
