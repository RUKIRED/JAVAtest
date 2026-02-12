package curriculum.k;

/**
 * 社員の基底抽象クラス。
 * 共通のデータ構造のみを持ち、計算ロジックの詳細はサブクラスに委ねます。
 */
public abstract class Employee implements Payable {
	protected String name;
	protected int hours;

	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}

	@Override
	public String getName() {
		return this.name;
	}
}