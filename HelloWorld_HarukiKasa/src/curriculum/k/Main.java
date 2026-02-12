package curriculum.k;

public class Main {
	public static void main(String[] args) {
		SalaryReporter reporter = new SalaryReporter();

		// 異なる社員タイプを生成
		Payable fullTime = new FullTimeEmployee("田中太郎", 160);
		Payable contract = new ContractEmployee("佐藤次郎", 140);

		// レポート出力
		reporter.outputSalaryReport(fullTime);
		reporter.outputSalaryReport(contract);
	}
}