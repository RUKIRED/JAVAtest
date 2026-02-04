package curriculum.a;

public class Question1 {

	public static void main(String[] args) {

		/************************************
		 * 課題Q1:各型の変数を宣言し、初期値を設定
		 ************************************/
		// 変数byteNumの初期値を設定
		byte byteNum = 0;
		// 変数shortNumの初期値を設定
		short shortNum = 0;
		// 変数intNumの初期値を設定
		int intNum = 0;
		// 変数longNumの初期値を設定
		long longNum = 0L;
		// 変数floatNumの初期値を設定
		float floatNum = 0.0f;
		// 変数doubleNumの初期値を設定
		double doubleNum = 0.0;
		// 変数letterの初期値を設定
		char letter = '\u0000';
		// 変数lettersの初期値を設定
		String letters = null;
		// 変数isBooleanの初期値を設定
		boolean isBoolean = false;

		/*********************************************
		 * 課題Q2:Q1で宣言した各型の変数に指定された値を代入
		 *********************************************/
		// 変数byteNumに10を代入
		byteNum = 10;
		// 変数shortNumに100を代入
		shortNum = 100;
		// 変数intNumに1000を代入
		intNum = 1000;
		// 変数longNumに10000を代入
		longNum = 10000;
		// 変数floatNumに9.5fを代入
		floatNum = 9.5f;
		// 変数doubleNumに10.5を代入
		doubleNum = 10.5;
		// 変数letterに"a"を代入
		letter = 'a';
		// 変数lettersに"ハロー"を代入
		letters = "ハロー";
		// 変数isBooleanにtrueを代入
		isBoolean = true;

		/*******************************
		 * Q3:値を代入した変数を用いて出力
		 * 以下コメント問題文
		********************************/
		// 11110を出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		//20を出力
		System.out.println(floatNum + doubleNum);
		//aハローtrueを出力
		System.out.println(letter + letters + isBoolean);
		//数字を全て足して出力
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		//小数点以外の数字を全てかけて出力
		System.out.println(byteNum * shortNum * intNum * longNum);
		//10.5割る100をして出力
		System.out.println(doubleNum / shortNum);
		//10引く100をすして出力
		System.out.println(byteNum - shortNum);

		/*********************************************************
		 * [概要]Q4
		***********************************************************/
		//String型の変数の宣言と初期化
		String name = "山田太郎";
		//name変数を使用してコンソールに こんにちは、山田太郎さん! と表示。
		System.out.println("こんにちは、" + name + "さん!");

		/*********************************************************
		 * Q5:age という int型の変数 を宣言し
		 * その変数に 25 を代入してください。
		 * age変数を使用してコンソールに 年齢: 25歳 という表示。
		***********************************************************/
		//年齢を入力
		int age = 25;
		//コンソールに出力
		System.out.println("年齢:" + age + "歳");

		/*********************************************************
		 * Q6:num1 という int型の変数 を宣言し、10 を代入
		 * num2 という int型の変数 を宣言し、5 を代入
		 * num1 と num2 を足した結果を sum という変数に代入し、コンソールに表示。
		***********************************************************/
		//num1,num2を宣言して初期化
		int num1 = 10;
		int num2 = 5;
		//num1+num2を足してsumを宣言と初期化
		int sum = num1 + num2;
		//コンソールに出力
		System.out.println(sum);

		/*********************************************************
		 * Q7:score という int型の変数 を宣言し、80 を代入
		 * score に 20 を加えて、更新する
		 * 最終スコア: 100  をscoreを使用してコンソールに表示。
		***********************************************************/
		//int型変数scoreを宣言・初期化
		int score = 80;
		//scoreに加点
		score = score + 20;
		//コンソールに出力
		System.out.println(score);

		/*********************************************************
		 * Q8:price という double型の変数 を宣言し、99.99 を代入
		 * price を int型 に変換し、整数価格: 99 とコンソールに表示。
		***********************************************************/
		//double型変数priceを宣言・初期化
		double price = 99.99;
		// double → int (小数点以下が切り捨て)
		int priceInt = (int) price;
		//コンソールに出力
		System.out.println(priceInt);

		/*********************************************************
		 * Q9:String 型の変数 numStr に "123" を代入
		 * numStr を int 型に変換し、
		 * 変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示。
		***********************************************************/
		//String 型の変数 numStr に "123" を代入
		String numStr = "123";
		// numStr を int 型に変換
		int num3 = Integer.parseInt(numStr);
		//num3に10を足してコンソールに出力
		System.out.println(num3 + 10);

		/*********************************************************
		 * Q10:int 型の変数 num に 50 を代入
		 * num を String 型に変換し、"得点: 50点" の形で表示
		***********************************************************/
		//int 型の変数 num に 50 を代入
		int num = 50;
		//num を String 型に変換
		String str = String.valueOf(num);
		//得点を表示
		System.out.println("得点:" + str + "点");

		/*********************************************************
		 * Q11:次の条件を満たすプログラムを条件演算子を使用して作成してください。
		 *  int 型の変数 a に 10 を代入
		 * int 型の変数 b に 20 を代入
		 * a が b より小さいかどうかを boolean 変数 result に代入
		 * result の値を表示
		***********************************************************/
		//aとbを宣言・初期化
		int a = 10;
		int b = 20;
		//boolean型の変数resultでa<bであればtrueが出力される
		boolean result = (a < b);
		//コンソールに表示
		System.out.println(result);

		/*********************************************************
		 * Q12:条件演算子(三項演算子)
		***********************************************************/
		//xに15を代入
		int x = 15;
		//xが10以上かの判別
		boolean isPassed = (x >= 10);
		//x が 10 以上なら "OK"、そうでなければ "NG" をコンソールに表示
		System.out.println(isPassed ? "OK" : "NG");

		/*********************************************************
		 * Q13:文字列の置換
		***********************************************************/
		//textを宣言・初期化
		String text = "私はJavaが好きです。Javaは楽しい!";
		//textのJavaをPytho置換
		String text2 = text.replace("Java", "Python");
		//変更後の文をコンソールに表示
		System.out.println(text2);
	}

}
