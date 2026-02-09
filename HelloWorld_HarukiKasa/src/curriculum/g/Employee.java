package curriculum.g;

public class Employee {
	String employeeId;//メンバ変数
	String name;

	public void setEmployeeId(String id) {//()内、引数
		this.employeeId = id;//メンバ変数＝引数
	}

	public String getEmployeeId() {
		return employeeId;//メンバ変数の中身を返す
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
