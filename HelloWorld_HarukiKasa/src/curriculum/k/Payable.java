package curriculum.k;

/**
 * 給与支払い可能な対象を表すインターフェース。
 * 必要なメソッドのみを定義することで、インターフェース分離の原則(I)を遵守します。
 */
public interface Payable {
	/**
	 * 給与額を算出します。
	 * @return 算出された給与額
	 */
	int calculateSalary();

	/**
	 * 表示用の名前を取得します。
	 * @return 名前
	 */
	String getName();
}