/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-11 p71
 * 	二つの整数値を読み込んで、それらの値の差が10以下であれば
 * 	「これらの値の差は10以下です。」と表示し、
 * 	そうでなければ「これらの値の差は11以上です。」と表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu03_11
 * クラス名:Ensyu03_11
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu03_11;

//乱数取得準備
import java.util.Scanner;

public class Ensyu03_11 {
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

		//2数の差が10以下か11以上かを判定して、結果を表示させる
		/*2数の差が10以下の場合、
		 * 	コメント出力「それらの差は10以下です。」
		 */
		if ((max - min) <= 10)
			System.out.println("それらの差は10以下です。");
		/*2数の差が11以上の場合、
		 * 	コメント出力「それらの差は11以上です。」
		 */
		else //if ((max - min) >= 11)
			System.out.println("それらの差は11以上です。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}
