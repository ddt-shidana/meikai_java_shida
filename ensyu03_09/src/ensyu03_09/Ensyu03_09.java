/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-9 p71
 * 	二つの実数値を読み込んで大きい方の値を表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu03_09
 * クラス名:Ensyu03_09
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu03_09;

//乱数取得準備
import java.util.Scanner;

public class Ensyu03_09 {
//クラス内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//整数Aを入力値から取得
		System.out.println ("整数A:");
		int a = stdIn.nextInt();

		//整数Bを入力値から取得
		System.out.println ("整数B:");
		int b = stdIn.nextInt();

		//aとbを比較して、大きい方の値をコメント出力「大きい方の値は～です。」
		System.out.println("大きい方の値は" + (a > b ? a : b) + "です。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}
