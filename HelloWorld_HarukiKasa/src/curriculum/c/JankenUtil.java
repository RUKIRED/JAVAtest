package curriculum.c;

public class JankenUtil {
	// インスタンス化せずに JankenUtil.toHandName(...) で呼べる
	public static String toHandName(int hand) {
		return switch (hand) {
		case 0 -> "グー";
		case 1 -> "チョキ";
		case 2 -> "パー";
		default -> "不明な手";
		};
		//配列による判別も検討したが、保守性を著しく下げるため不採用。
		/*Enumという変数を設定して判別する方法も検討したが、
		 変数の代入が多すぎてオーバーエンジニアリングになるため不採用*/
	}

}