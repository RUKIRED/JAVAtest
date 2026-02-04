package curriculum.b;

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

	}

}
