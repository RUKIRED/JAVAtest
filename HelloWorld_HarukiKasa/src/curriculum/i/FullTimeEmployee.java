package curriculum.i;

/**
 * 正社員クラス。
 * 基本時給に加え、8時間を超える労働に対して残業代（1.25倍）を算出します。
 */
class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	/**
	 * 正社員向け給与計算ロジック
	 * 仕様：基本8時間までは時給1250円、超過分は25%割増
	 */
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1250;
		// 残業時間の算出（0未満にならないようMath.maxを使用）
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;

		// 基本給と残業代（1.25倍）の合算
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
	}
}