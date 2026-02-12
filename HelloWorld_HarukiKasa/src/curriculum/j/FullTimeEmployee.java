package curriculum.j;

/**
 * 正社員クラス。
 * 8時間を超える労働に対して割増賃金が適用されます。
 */
public class FullTimeEmployee extends Employee {
	// 定数定義：保守性を高めるため、数値は直接書かずに定数化
	private static final int HOURLY_RATE = 1250;
	private static final int REGULAR_HOURS_LIMIT = 8;
	private static final double OVERTIME_PREMIUM = 1.25;

	public FullTimeEmployee(int id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		if (hoursWorked <= REGULAR_HOURS_LIMIT) {
			return hoursWorked * HOURLY_RATE;
		}

		// 超過分の計算
		int overtimeHours = hoursWorked - REGULAR_HOURS_LIMIT;
		int regularPay = REGULAR_HOURS_LIMIT * HOURLY_RATE;
		int overtimePay = (int) (overtimeHours * HOURLY_RATE * OVERTIME_PREMIUM);

		return regularPay + overtimePay;
	}
}