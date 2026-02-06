package curriculum.b;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*------------------------------------
		 * Q4:
		 -------------------------------------*/
		//Greetingを呼び出す
		Greeting.sayHello();

		/*------------------------------------
		 * Q5:
		 -------------------------------------*/
		Animal lion = new Animal();
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setVelocity(80);
		System.out.println("動物名:" + lion.getName());
		System.out.printf("体長:%fm\n速度:%dkm/h\n", lion.getLength(), lion.getVelocity());

	}

}
