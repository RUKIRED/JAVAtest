package curriculum.b;

public class Question5 {

	// TODO 自動生成されたメソッド・スタブ
	// Q1:メソッド helloWorld の定義
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	//Q2:２倍して返す
	public static int doubleValue(int num) {
		return num * 2;
	}

	//偶数ならtrue,奇数ならfalseを返す
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		/*------------------------------------
		 * Q1:
		 -------------------------------------*/
		// メソッドの呼び出し
		helloWorld();

		/*------------------------------------
		 * Q2:
		 -------------------------------------*/
		int input = 10;
		int result = doubleValue(input);
		System.out.printf("%dを２倍すると%dです\n", input, result);

		/*------------------------------------
		 * Q3:
		 -------------------------------------*/
		int num1 = 7;
		int num2 = 10;
		if (isEven(num2)) {
			System.out.printf("%dは偶数です。\n", num2);
		} else {
			System.out.printf("%dは奇数です。\n", num2);
		}
		if (isEven(num1)) {
			System.out.printf("%dは偶数です。\n", num1);
		} else {
			System.out.printf("%dは奇数です。\n", num1);
		}

		/*------------------------------------
		 * Q4:Main.javaに記述有
		 -------------------------------------*/
		/*------------------------------------
		 * Q5:
		 -------------------------------------*/

	}
}
