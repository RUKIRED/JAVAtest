package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 要件：Billable 型のリストで管理
		List<Billable> employees = new ArrayList<>();

		// データの追加（正社員と契約社員を混在させる）
		employees.add(new FullTimeEmployee(1, "田中太郎"));
		employees.add(new ContractEmployee(2, "佐藤次郎"));

		// 10時間労働とした場合のシミュレーション
		int simulationHours = 10;

		// 拡張forループで各社員のコストを出力
		// 呼び出し側は Employee か FullTimeEmployee かを意識せず、Billable 型として扱う
		for (Billable billable : employees) {
			int cost = billable.costForDay(simulationHours);
			System.out.println("日給: " + cost + "円");
		}
	}
}