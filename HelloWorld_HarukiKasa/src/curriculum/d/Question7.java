package curriculum.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	/*
	 * 共通のキャラクター情報を管理する内部クラス
	 */
	static class Character {
		private String name;
		private int hp;
		private int at;
		private int sp;

		public Character(String name, int hp, int at, int sp) {
			this.name = name;
			this.hp = hp;
			this.at = at;
			this.sp = sp;
		}

		public String getName() {
			return name;
		}

		public int getHp() {
			return hp;
		}

		public int getAt() {
			return at;
		}

		public int getSp() {
			return sp;
		}

		// ダメージ計算用メソッド
		public void takeDamage(int damage) {
			this.hp -= damage;
		}

		public boolean isAlive() {
			return this.hp > 0;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		List<String> battleLog = new ArrayList<>();

		try {
			// 1. Playerの作成
			System.out.print("Playerの名前を入力してください: ");
			String playerName = scanner.nextLine();

			// ステータスのランダム設定 (バランス調整: HP 50-100, AT 10-20, SP 1-15 と仮定)
			int playerHp = 50 + random.nextInt(51);
			int playerAt = 10 + random.nextInt(11);
			int playerSp = 1 + random.nextInt(15);

			Character player = new Character(playerName, playerHp, playerAt, playerSp);

			// ログ記録
			String playerInfo = String.format("Player生成: %s (HP:%d, AT:%d, SP:%d)",
					player.getName(), player.getHp(), player.getAt(), player.getSp());
			System.out.println(playerInfo);
			battleLog.add(playerInfo);

			// 2. Daemonの読み込み
			Character daemon = loadDaemon("daemon_status.txt");
			if (daemon == null) {
				System.out.println("Daemonファイルの読み込みに失敗しました。終了します。");
				return;
			}

			// ログ記録
			String daemonInfo = String.format("Daemon出現: %s (HP:%d, AT:%d, SP:%d)",
					daemon.getName(), daemon.getHp(), daemon.getAt(), daemon.getSp());
			System.out.println(daemonInfo);
			battleLog.add(daemonInfo);
			battleLog.add("--------------------------------");

			// 3. 先攻後攻の決定
			boolean isPlayerTurn;
			if (player.getSp() > daemon.getSp()) {
				isPlayerTurn = true;
				battleLog.add("スピード判定: " + player.getName() + " が先攻");
			} else if (daemon.getSp() > player.getSp()) {
				isPlayerTurn = false;
				battleLog.add("スピード判定: " + daemon.getName() + " が先攻");
			} else {
				// SPが同じ場合はランダム
				isPlayerTurn = random.nextBoolean();
				battleLog.add("スピード判定(同値): ランダムで " + (isPlayerTurn ? player.getName() : daemon.getName()) + " が先攻");
			}

			// 4. バトルループ
			int turnCount = 1;
			while (player.isAlive() && daemon.isAlive()) {
				Character attacker = isPlayerTurn ? player : daemon;
				Character defender = isPlayerTurn ? daemon : player;

				// 攻撃処理
				int damage = attacker.getAt();
				defender.takeDamage(damage);

				String logLine = String.format("Turn %d: %s の攻撃 -> %s に %d ダメージ (残りHP: %d)",
						turnCount, attacker.getName(), defender.getName(), damage, Math.max(0, defender.getHp())); // HP表示は負にならないよう整形

				System.out.println(logLine);
				battleLog.add(logLine);

				// ターン終了処理
				if (!defender.isAlive()) {
					String winLog = String.format("勝者: %s", attacker.getName());
					System.out.println(winLog);
					battleLog.add("--------------------------------");
					battleLog.add(winLog);
					break;
				}

				// 攻守交代
				isPlayerTurn = !isPlayerTurn;
				turnCount++;
			}

			// 5. 結果出力 (battle_log.txt)
			writeLogToFile(battleLog, "battle_log.txt");
			System.out.println("バトルログを battle_log.txt に保存しました。");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	/**
	 * 指定されたパスからDaemonのステータスを読み込むメソッド
	 * * @param filePath ファイルパス
	 * @return Characterインスタンス
	 */
	private static Character loadDaemon(String filePath) {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath, StandardCharsets.UTF_8))) {
			String name = br.readLine();
			if (name == null)
				return null;

			int hp = Integer.parseInt(br.readLine());
			int at = Integer.parseInt(br.readLine());
			int sp = Integer.parseInt(br.readLine());

			return new Character(name, hp, at, sp);
		} catch (IOException | NumberFormatException e) {
			System.err.println("ファイル読み込みエラー: " + e.getMessage());
			return null;
		}
	}

	/**
	 * ログリストをファイルに書き出すメソッド
	 * * @param logs ログのリスト
	 * @param filePath 出力ファイルパス
	 */
	private static void writeLogToFile(List<String> logs, String filePath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, StandardCharsets.UTF_8))) {
			for (String line : logs) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.err.println("ログ書き込みエラー: " + e.getMessage());
		}
	}
}