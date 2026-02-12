package curriculum.i;

/**
 * 社員情報の基底抽象クラス。
 * 全ての社員種別（正社員、契約社員など）に共通する属性と
 * 給与計算のインターフェースを定義します。
 */
abstract class Employee {
	/** 社員ID */
	protected String id;
	/** 社員名 */
	protected String name;

	/**
	 * コンストラクタ
	 * @param id 社員ID
	 * @param name 社員名
	 */
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * 日給を計算する抽象メソッド。
	 * 算出ロジックは各サブクラス（正社員・契約社員など）の就業規則に従います。
	 * @param hoursWorked 労働時間
	 * @return 算出された日給（円）
	 */
	public abstract int calculateDailyWage(int hoursWorked);
}