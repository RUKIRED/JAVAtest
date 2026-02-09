package sample;

public class pokemon {
	/*============================
	 * プライベートフィールド
	 ===========================*/
	private int id;
	private String name;
	private String category;
	private String type;
	private double hight;
	private double whight;
	private String characteristic;
	private int hp;
	private int atk;
	private int bou;
	private int satk;
	private int diff;
	private int speed;

	/*========================
	 * setter
	 ========================*/
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public void setWhight(double whight) {
		this.whight = whight;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public void setBou(int bou) {
		this.bou = bou;
	}

	public void setSatk(int satk) {
		this.satk = satk;
	}

	public void setDiff(int diff) {
		this.diff = diff;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/*=============================
	 * getter
	 =============================*/
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public String getType() {
		return type;
	}

	public double getHight() {
		return hight;
	}

	public double getWhight() {
		return whight;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public int getBou() {
		return bou;
	}

	public int getSatk() {
		return satk;
	}

	public int getDiff() {
		return diff;
	}

	public int getSpeed() {
		return speed;
	}

	public void disply() {
		System.out.println("ID:%d  名前:%s  %sポケモン  ");
	}

}
