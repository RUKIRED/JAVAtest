package curriculum.h;

public abstract class Employee {//インスタンス化の禁止・必ず継承/コンストラクタの保持
	protected String employeeId;//メンバ変数
	protected String name;//メンバ変数

	// コンストラクタ--->継承可能!
	//Setter<コンストラクタ
	//理由：不変性・Nullの防止・
	public Employee(String id, String name) {
		this.employeeId = id;//メンバ変数＝引数
		this.name = name;//メンバ変数＝引数
	}

	public String getEmployeeId() {
		return employeeId;//メンバ変数を返す
	}

	public String getName() {
		return name;//メンバ変数を返す
	}

	// 抽象メソッドで具体的な計算はサブクラスに任せる命令を出す
	//理由：計算が分岐しておりclassで分けた方が保守性、可読性含め効率的
	public abstract int calculateDailyWage(int hoursWorked);
}