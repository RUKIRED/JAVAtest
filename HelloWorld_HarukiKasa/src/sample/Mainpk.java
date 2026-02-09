package sample;

public class Mainpk {

	public static void main(String[] args) {
		pokemon pk = new pokemon();
		pk.setId(8898);
		pk.setName("卍");
		pk.setCategory("まんじ");
		pk.setType("ほのお、ノーマル");
		pk.setCharacteristic("回転");
		pk.setHight(300.4);
		pk.setWhight(300.4);
		pk.setHp(255);
		pk.setAtk(255);
		pk.setBou(1);
		pk.setSatk(1);
		pk.setDiff(80);
		pk.setSpeed(255);

		pk.disply();

	}

}
