/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-10 p71
 * 	二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu03_10
 * クラス名:Ensyu03_10
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu03_10;

//乱数取得準備
import java.util.Scanner;

public class Ensyu03_10 {
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

		//int変数maxに整数AとBで大きい方の値を初期設定
		int max = (a < b ? b : a);
		//int変数minに整数AとBで小さい方の値を初期設定
		int min = (a < b ? a : b);

		//コメント出力「二数の差は～です。」
		System.out.println("二数の差は" + (max - min) + "です。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}
