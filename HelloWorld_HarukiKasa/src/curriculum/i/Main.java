package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new FullTimeEmployee("F001", "田中（正社員）"));
		employees.add(new ContractEmployee("C001", "鈴木（契約）"));
		employees.add(new FullTimeEmployee("F002", "佐藤（正社員）"));
		employees.add(new ContractEmployee("C002", "高橋（契約）"));

		int hoursWorked = 9;

		System.out.println("--- 給与計算実行 (労働時間: " + hoursWorked + "時間) ---");

		for (Employee e : employees) {
			int wage = e.calculateDailyWage(hoursWorked);
			System.out.println("ID: " + e.id + " | 名前: " + e.name + " | 給与: " + wage + "円");
		}
	}
}