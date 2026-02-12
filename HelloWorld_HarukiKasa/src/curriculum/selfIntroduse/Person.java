package curriculum.selfIntroduse;

public class Person {
	//インスタンスフィールドを定義
	private String name;
	private int age;
	private double hight;
	private double weight;

	public static int count = 0;

	//コンストラクタを定義ンインスタンスフィールドに値をセット
	public Person(String name, int age, double hight, double weight) {
		this.name = name;
		this.age = age;
		this.hight = hight;
		this.weight = weight;

		Person.count++;
	}

	public double bmi() {
		return this.weight / (this.hight * this.hight);
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + Math.floor(bmi() * 100) / 100 + "です");
	}

}
