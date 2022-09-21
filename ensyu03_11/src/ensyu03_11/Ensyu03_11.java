package ensyu03_11;

//乱数取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習3-11 p71<br>
 * 	二つの整数値を読み込んで、それらの値の差が10以下であれば
 * 	「これらの値の差は10以下です。」と表示し、
 * 	そうでなければ「これらの値の差は11以上です。」と表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_11 {

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

		//int変数maxに整数AとBで大きい方の値を初期設定
		int max = (aInt < bInt ? bInt : aInt);
		//int変数minに整数AとBで小さい方の値を初期設定
		int min = (aInt < bInt ? aInt : bInt);

		//2数の差が10以下か11以上かを判定して、結果を表示させる
		//2数の差が10以下の場合、
		if ((max - min) <= 10) {
			//コメント出力「それらの差は10以下です。」
			System.out.println("それらの差は10以下です。");
		}
		//2数の差が11以上の場合、
		else {
			 //コメント出力「それらの差は11以上です。」
			System.out.println("それらの差は11以上です。");
		}
		
		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
