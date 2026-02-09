package curriculum.g;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();//empというインスタンスをEmployeeから作成
		emp.setEmployeeId("E002");//引数を渡す
		emp.setName("田中花子");
		System.out.println("社員ID:" + emp.getEmployeeId() + ",名前:" + emp.getName());
		//メンバ変数と引数が同じでメンバ変数がメソッドから返ってきてるから出力できる
	}

}
