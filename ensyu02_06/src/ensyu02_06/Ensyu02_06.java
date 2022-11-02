/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-6 p41
 * 	三角形の底辺と高さをを読み込んで、その面積を表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu02_06
 * クラス名:Ensyu02_06
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu02_06;

//キーボードからの入力値取得準備
import java.util.Scanner;

public class Ensyu02_06 {

	public static void main(String[] args) {

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//コメント出力:三角形の面積を求めます。
		System.out.println ("三角形の面積を求めます。");

		//底辺の値を入力案内
		System.out.println ("底辺:");
		//底辺の大きさを入力値から取得
		double buttom = stdIn.nextDouble();

		//高さの値を入力案内
		System.out.println ("高さ:");
		//高さの大きさを入力値から取得
		double height = stdIn.nextDouble();

		//コメント出力:三角形の面積を計算して表示
		System.out.println ("面積は" + (buttom * height) / 2 + "です。");

		//scannerのインスタンスをクローズ
		stdIn.close();
	}

}
