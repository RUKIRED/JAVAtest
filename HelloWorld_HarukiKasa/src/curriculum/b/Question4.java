package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*----------------------------------
		 * Q1:
		 -----------------------------------*/
		// 1. int型の配列を作成し、1, 2, 3, 4, 5 を格納
		int[] numbers = { 1, 2, 3, 4, 5 };
		// 2. 配列の全要素を順番に表示
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		/*----------------------------------
		 * Q2:
		 -----------------------------------*/
		// 1. int型の配列 {10, 20, 30, 40, 50} を用意
		int[] numbers2 = { 10, 20, 30, 40, 50 };
		// 2. 配列の要素を逆順に表示
		// インデックスは 4, 3, 2, 1, 0 の順で変化させる
		for (int i = numbers2.length - 1; i >= 0; i--) {
			System.out.println(numbers2[i]);
		}

		/*----------------------------------
		 * Q3:
		 -----------------------------------*/
		// 1. int型の配列 {3, 5, 7, 9, 11} を用意
		int[] numbers3 = { 3, 5, 7, 9, 11 };
		// 2. 合計値を保持する変数を 0 で初期化
		int sum = 0;
		// 3. 配列の全要素を順番に足していく
		for (int i = 0; i < numbers3.length; i++) {
			sum += numbers3[i];
		}
		// 4. 合計値を表示
		System.out.println(sum);

		/*----------------------------------
		 * Q4:
		 -----------------------------------*/
		// 1. int型の配列 {12, 7, 9, 21, 5, 18} を用意
		int[] numbers4 = { 12, 7, 9, 21, 5, 18 };
		// 2. 最大値・最小値の初期値を配列の最初の要素（12）に設定
		int max = numbers4[0];
		int min = numbers4[0];
		// 3. 配列を順番にチェックして、最大・最小を更新していく
		for (int i = 1; i < numbers4.length; i++) {
			// 現在の最大値より大きい値を見つけたら更新
			if (numbers4[i] > max) {
				max = numbers4[i];
			}
			// 現在の最小値より小さい値を見つけたら更新
			if (numbers4[i] < min) {
				min = numbers4[i];
			}
		}
		// 4. 結果を表示
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);

		/*----------------------------------
		 * Q5:
		 -----------------------------------*/
		// 1. int型の配列 {1, 2, 3, 4, 5} を用意
		int[] numbers5 = { 1, 2, 3, 4, 5 };
		// 2. 配列のすべての要素を 2 倍にする
		for (int i = 0; i < numbers5.length; i++) {
			numbers5[i] = numbers5[i] * 2;
		}
		// 3. 拡張for文を使用して結果を表示
		for (int num : numbers5) {
			System.out.println(num);
		}

		/*----------------------------------
		 * Q6:
		 -----------------------------------*/
		// 1. int型の配列 {4, 7, 10, 15, 20} を用意
		int[] numbers6 = { 4, 7, 10, 15, 20 };
		// 2. ユーザーから数値を入力してもらう
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		// 3. 配列に含まれているか判定
		boolean found = false; // 見つかったらtrueにする
		for (int num : numbers6) {
			if (num == input) {
				found = true;
				break; // 見つかったらこれ以上ループする必要はないので抜ける
			}
		}
		// 4. 結果を表示
		if (found) {
			System.out.println(input + " は配列に含まれています");
		} else {
			System.out.println(input + " は配列に含まれていません");
		}
		scanner.close();

		/*----------------------------------
		 * Q7:
		 -----------------------------------*/
		// 1. 2次元配列 {{1, 2}, {3, 4}, {5, 6}} を用意
		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		// 2. 2重のループですべての要素を表示
		for (int i = 0; i < array.length; i++) { // 外側のループ（行：0〜2）
			for (int j = 0; j < array[i].length; j++) { // 内側のループ（列：0〜1）
				System.out.println(array[i][j]);
			}
		}

		/*----------------------------------
		 * Q8:
		 -----------------------------------*/
		// 1. 2次元配列を用意
		int[][] array2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		// 2. 合計値を保持する変数を 0 で初期化
		int sum2 = 0;
		// 3. 2重ループですべての要素を足していく
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				sum2 += array2[i][j];
			}
		}
		// 4. 結果を表示
		System.out.println(sum2);

		/*----------------------------------
		 * Q9:
		 -----------------------------------*/
		// 1. 2次元配列を用意
		int[][] array3 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
		// 2. 最大値・最小値の初期値を配列の最初の要素 [0][0]（12）に設定
		int max2 = array3[0][0];
		int min2 = array3[0][0];
		// 3. 2重ループですべての要素を比較
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				// 現在の最大値より大きい値があれば更新
				if (array3[i][j] > max2) {
					max2 = array3[i][j];
				}
				// 現在の最小値より小さい値があれば更新
				if (array3[i][j] < min2) {
					min2 = array3[i][j];
				}
			}
		}
		// 4. 結果を表示
		System.out.println("最大値: " + max2);
		System.out.println("最小値: " + min2);

		/*----------------------------------
		 * Q10:
		 -----------------------------------*/
		// 1. 3次元配列を用意
		int[][][] array4 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		for (int[][] area : array4) { // 2次元配列を取り出す
			for (int[] row : area) { // 1次元配列を取り出す
				for (int val : row) { // 値を取り出す
					System.out.println(val);
				}
			}
		}

	}

}
