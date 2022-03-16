/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-2 p59
 * 	二つの正の整数値を読み込んで、後者が前者の約数であれば
 * 	「BはAの約数です。」と表示し、
 * 	そうでなければ「BはAの約数ではありません。」と表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu03_02
 * クラス名:Ensyu03_02
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu03_02;

import java.util.Scanner;

public class Ensyu03_02 {
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

		//aがbで割り切れるかどうかで条件分岐
		/*aがbで割り切れるとき
		 	コメント出力「BはAの約数です。」*/
		if (a % b == 0)
			System.out.println("BはAの約数です。");
		/*aがbで割り切れないとき
	 		コメント出力「BはAの約数ではありません。」*/
		else
			System.out.println("BはAの約数ではありません。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}
