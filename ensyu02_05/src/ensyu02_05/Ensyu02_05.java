/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-5 p41
 * 	二つの実数値を読み込み、
 * 	その和と平均を求めて表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu02_05
 * クラス名:Ensyu02_05
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu02_05;

import java.util.Scanner;

public class Ensyu02_05 {
//クラス内容ここまで

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//xの値を入力値から取得
		System.out.println ("xの値:");
		double x = stdIn.nextDouble();

		//yの値を入力値から取得
		System.out.println ("yの値:");
		double y = stdIn.nextDouble();

		//コメント出力:xとyの合計値を表示
		System.out.println ("合計は" + (x + y) + "です。");
		//コメント出力:xとyの平均値を表示
		System.out.println ("平均は" + (x + y) / 2 + "です。");

		stdIn.close();		//scannerのインスタンスをクローズ

	//mainメソッドここまで
	}

//クラス内容ここまで
}
