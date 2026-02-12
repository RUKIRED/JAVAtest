package curriculum.j;

/**
 * 契約社員クラス。
 * 固定の時給計算を行います。
 */
public class ContractEmployee extends Employee {
	private static final int HOURLY_RATE = 1000;

	public ContractEmployee(int id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;
	}
}