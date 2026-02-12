package curriculum.k;

/**
 * 給与レポートの出力を担当するクラス。
 * 具体的な社員クラスではなく Payable インターフェースに依存(D)しています。
 */
public class SalaryReporter {
	/**
	 * 指定された対象の給与情報を出力します。
	 * 相手が正社員か契約社員かを問わず、Payableの実装であれば正常に動作します(L)。
	 * @param target 給与支払い対象
	 */
	public void outputSalaryReport(Payable target) {
		int salary = target.calculateSalary();
		System.out.println(target.getName() + " の給料は " + salary + " 円");
	}
}