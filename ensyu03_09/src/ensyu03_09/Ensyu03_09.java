package ensyu03_09;

//乱数取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 * 
 * 問題:演習3-9 p71<br>
 * 	二つの実数値を読み込んで大きい方の値を表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_09 {

	public static void main(String[] args) {

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//整数Aを入力値から取得ナビゲーション
		System.out.println ("整数A:");
		//aIntはキーボードからの入力値
		int aInt = stdIn.nextInt();

		//整数Bを入力値から取得ナビゲーション
		System.out.println ("整数B:");
		//bIntはキーボードからの入力値
		int bInt = stdIn.nextInt();

		//aIntとbIntを比較して、大きい方の値をコメント出力「大きい方の値は～です。」
		System.out.println("大きい方の値は" + (aInt > bInt ? aInt : bInt) + "です。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
