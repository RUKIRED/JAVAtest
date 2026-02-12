package curriculum.j;

/**
 * 請求可能なエンティティを表すインターフェース。
 * 労働時間に応じた費用の算出を規定します。
 */
public interface Billable {
	/**
	 * 指定された労働時間に基づき、その日の費用（日給）を算出します。
	 * @param hoursWorked 労働時間
	 * @return 算出された費用
	 */
	int costForDay(int hoursWorked);
}