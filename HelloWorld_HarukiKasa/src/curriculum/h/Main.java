package curriculum.h;

public class Main {
	public static void main(String[] args) {
		FullTimeEmployee ft = new FullTimeEmployee("FT01", "Full Timer");
		PartTimeEmployee pt = new PartTimeEmployee("PT01", "Part Timer");

		int hours = 9;

		System.out.println("正社員の給与: " + ft.calculateDailyWage(hours) + " 円");
		System.out.println("パート社員の給与: " + pt.calculateDailyWage(hours) + " 円");
	}
}