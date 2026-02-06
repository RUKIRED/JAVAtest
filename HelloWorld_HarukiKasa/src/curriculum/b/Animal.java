package curriculum.b;

public class Animal {
	//それぞれのデータの型を決める
	String name;
	double length;
	int velocity;

	//Stringのgetter
	public String getName() {
		return name;
	}

	//フィールドを指定
	public void setName(String name) {
		//nameの指定
		this.name = name;
	}

	//lengthのgetter
	public double getLength() {
		return length;
	}

	//lingth.setter
	public void setLength(double length) {
		this.length = length;
	}

	//velocity.getter
	public int getVelocity() {
		return velocity;
	}

	//velocity.setter
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

}
