package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		/*----------------------------------------
		 * Q1:1から10までを表示
		 ----------------------------------------*/
		for (int a = 1; a <= 10; a++) {
			//１つずつ改行して表示
			System.out.println(a);
		}

		/*----------------------------------------
		 * Q2:2から20までの2*xを表示
		 ----------------------------------------*/
		//
		for (int b = 1; b <= 10; b++) {
			//1つずつ改行して表示
			System.out.println(b * 2);
		}

		/*----------------------------------------
		 * Q3:10 から 1 まで カウントダウン
		 ----------------------------------------*/
		for (int c = 10; c >= 1; c--) {
			System.out.println(c);
		}

		/*----------------------------------------
		 * Q4:
		 ----------------------------------------*/
		//変数sumを用意(別枠の確保)
		int sum = 0;
		//1〜100出力
		for (int d = 1; d <= 100; d++) {
			//sumにdを足していく処理を繰り返す
			sum += d;
		}
		//sumの値１つのみ表示
		System.out.println(sum);

		/*----------------------------------------
		 * Q5:*でAAを作る
		 ----------------------------------------*/
		// 外側のループ：1行目から5行目まで
		for (int i = 1; i <= 5; i++) {
			// 内側のループ：行の番号と同じ数だけ星を表示
			for (int j = 1; j <= i; j++) {
				// 改行せずに「*」を出す
				System.out.print("*");
			}
			// 1行分の星を出し終えたら改行する
			System.out.println();
		}

		/*----------------------------------------
		 * Q6:whileの練習
		 ----------------------------------------*/
		int count = 1;
		while (count <= 5) {
			//表示して改行
			System.out.println(count);
			//改行後count=count＋1
			count++;
		}

		/*----------------------------------------
		 * Q7:
		 ----------------------------------------*/
		int eve = 2;
		while (eve <= 20) {
			//表示して改行
			System.out.println(eve);
			//２ずつ足していく
			eve += 2;
		}

		/*----------------------------------------
		 * Q8:
		 ----------------------------------------*/
		int count2 = 10;
		while (count2 >= 1) {
			System.out.println(count2);
			//-1ずつ足していく
			count2--;
		}

		/*----------------------------------------
		 * Q9:
		 ----------------------------------------*/
		int sum2 = 0;
		int e = 1;
		while (e <= 100) {
			//まずsum2=sum2+e
			sum2 += e;
			//その後eに+1
			e++;
		}
		System.out.println(sum2);

		/*----------------------------------------
		 * Q10:
		 ----------------------------------------*/
		//スキャナーを用意
		Scanner sc = new Scanner(System.in);
		//0以外で他と競合しにくい数で初期化
		int num = -1;
		while (num != 0) {
			//入力を受け付ける
			num = sc.nextInt();
			//表示して改行
			System.out.println(num);
		}
		//num=0で表示
		System.out.println("終了しました");
		sc.nextLine();
		/*
		 * int input;
		 * do {
		 * num = scanner.nextInt();
		 * } while (num != 0);
		 * System.out.println("終了しました");
		 * こっちの方が簡潔で優秀
		 */

		/*----------------------------------------
		 * Q11:
		 ----------------------------------------*/
		//行に対応する変数l
		for (int l = 1; l <= 9; l++) {
			//列に対応する変数r
			for (int r = 1; r <= 9; r++) {
				//改行せずに指定の表示で9つ表示
				System.out.printf("|%02d*%02d=%02d|", l, r, l * r);
			}
			//9つ表示されたら改行
			System.out.println();
		}

		/*----------------------------------------
		 * Q12:
		 ----------------------------------------*/
		// 1. ユーザーからの入力を受け取る
		String inputLine = sc.nextLine();
		// 2. 入力された文字列を「、」で分割して配列にする
		String[] items = inputLine.split("、");
		// 3. ランダムな値（0〜11）を生成
		Random rand = new Random();
		int tvCount = rand.nextInt(12); // 0〜11のランダム
		int displayCount = 11 - tvCount; // 合計が11になるように計算
		// 4. 拡張for文で各商品を処理
		for (String item : items) {
			// 5. Switch文で分岐（if文は使用不可）
			switch (item) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(item + "の残り台数は " + rand.nextInt(12) + "台です");
				break;

			case "テレビ":
			case "ディスプレイ":
				// 6. 条件演算子を使用して出力する値を切り替える
				int count3 = (item.equals("テレビ")) ? tvCount : displayCount;
				System.out.println(item + "の残り台数は " + count3 + "台です");
				break;

			default:
				// 7. 指定の商品以外の場合
				System.out.println("『 " + item + " 』は指定の商品ではありません");
				break;
			}
		}
		sc.close();

	}

}
