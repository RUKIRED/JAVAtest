package curriculum.i;

/**
 * 契約社員クラス。
 * 労働時間に対して一律の時給で給与を算出します。
 */
class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	/**
	 * 契約社員向け給与計算ロジック
	 * 仕様：残業の概念はなく、全労働時間に対して時給1000円を適用
	 */
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}