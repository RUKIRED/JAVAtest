package curriculum.h;

public class FullTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1200;

	public FullTimeEmployee(String id, String name) {
		super(id, name);// 親クラスのコンストラクタを呼び出す
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			return hoursWorked * HOURLY_RATE;
		} else {
			int regularPay = 8 * HOURLY_RATE;
			int overtimeHours = hoursWorked - 8;
			//25%増：1200 * 1.25 = 1500円
			int overtimePay = (int) (overtimeHours * HOURLY_RATE * 1.25);
			return regularPay + overtimePay;
		}
	}
}