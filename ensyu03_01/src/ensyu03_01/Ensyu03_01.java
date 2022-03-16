/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-1 p59
 * 	整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu03_01
 * クラス名:Ensyu03_01
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu03_01;

//乱数取得準備
import java.util.Scanner;

public class Ensyu03_01 {
//クラス内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//整数値を入力値から取得
		System.out.println ("整数値:");
		int z = stdIn.nextInt();

		//zが0未満か、0以上で条件分岐
		/*zが0未満のとき
			コメント出力「絶対値は-zです。」*/
		if (z < 0)
			System.out.println("その絶対値は" + (-z) + "です。");
		/*zが0以上のとき
			コメント出力「絶対値はzです。」*/
		else
			System.out.println("その絶対値は" + z + "です。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}
