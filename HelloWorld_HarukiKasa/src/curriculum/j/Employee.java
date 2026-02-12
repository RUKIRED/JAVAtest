package curriculum.j;

/**
 * 社員を表す抽象クラス。
 * すべての社員が持つ共通の属性を保持します。
 */
public abstract class Employee implements Billable {
	// フィールド。サブクラスからアクセスできるよう protected に設定
	protected int id;
	protected String name;

	/**
	 * コンストラクタ
	 * @param id 社員ID
	 * @param name 社員名
	 */
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// costForDay は実装せず、抽象メソッドのままサブクラスに引き継ぐ
}