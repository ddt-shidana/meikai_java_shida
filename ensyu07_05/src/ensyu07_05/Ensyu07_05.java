package ensyu07_05;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-5 p233<br>
 * 	「こんにちは。」と表示して改行するメソッドhelloを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2023/01/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_05 {

	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		//「こんにちは。」を表示
		hello();
	}
	
	/**
	 * 「こんにちは。」と表示して改行する
	 */
	private static void hello() {
		System.out.println("『こんにちは。』");
	}

}
