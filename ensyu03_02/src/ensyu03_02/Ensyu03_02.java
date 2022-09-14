package ensyu03_02;

import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習3-2 p59<br>
 * 	二つの正の整数値を読み込んで、後者が前者の約数であれば
 * 	「BはAの約数です。」と表示し、
 * 	そうでなければ「BはAの約数ではありません。」と表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_02 {

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

		//aIntがbIntで割り切れるかどうかで条件分岐
		//aInt が bInt で割り切れるとき
		if (aInt % bInt == 0) {
			//bInt は aInt 約数
			System.out.println("BはAの約数です。");			
		}
		//aInt が bInt で割り切れないとき
		else {
			//bInt は aInt 約数ではない
			System.out.println("BはAの約数ではありません。");
		}

		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
