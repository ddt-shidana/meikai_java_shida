package ensyu03_10;

//乱数取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 * 
 * 問題:演習3-10 p71<br>
 * 	二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_10 {

	public static void main(String[] args) {

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//整数Aを入力値から取得ナビゲーション
		System.out.println ("整数A:");
		//aIntはキーボードからの入力値
		int aInt = stdIn.nextInt();

		//整数Bを入力値から取得
		System.out.println ("整数B:");
		//aIntはキーボードからの入力値
		int bInt = stdIn.nextInt();

		//int変数maxに整数AとBで大きい方の値を初期設定
		int max = (aInt < bInt ? bInt : aInt);
		//int変数minに整数AとBで小さい方の値を初期設定
		int min = (aInt < bInt ? aInt : bInt);

		//コメント出力「二数の差は～です。」
		System.out.println("二数の差は" + (max - min) + "です。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
