package curriculum.i;

import java.util.ArrayList;
import java.util.List;

/**
 * 実行エントリーポイント。
 * ポリモーフィズムを活用し、異なる社員種別の給与を一括計算します。
 */
public class Main {
	public static void main(String[] args) {
		// リストを抽象型（Employee）で宣言することで、異なる実装クラスを混在させる
		List<Employee> employees = new ArrayList<>();

		// テストデータの投入
		employees.add(new FullTimeEmployee("F001", "田中（正社員）"));
		employees.add(new ContractEmployee("C001", "鈴木（契約）"));
		employees.add(new FullTimeEmployee("F002", "佐藤（正社員）"));
		employees.add(new ContractEmployee("C002", "高橋（契約）"));

		// 業務要件：全社員一律 9時間労働として計算
		int hoursWorked = 9;

		System.out.println("--- 給与計算実行 (労働時間: " + hoursWorked + "時間) ---");

		// ポリモーフィズムの適用箇所
		// ループ内では各オブジェクトの具体的な型（FullTimeかContractか）を意識せず、
		// 共通メソッド calculateDailyWage を呼び出すだけで適切な計算が行われる。
		for (Employee e : employees) {
			int wage = e.calculateDailyWage(hoursWorked);
			System.out.println("ID: " + e.id + " | 名前: " + e.name + " | 給与: " + wage + "円");
		}
	}
}