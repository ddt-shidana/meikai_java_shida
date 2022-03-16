/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-4 p61
 * 	二つの変数a, bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
 * 	「aの方が大きいです。」「bの方が大きいです。」「aとbは同じ値です。」
 *
 * パッケージ名:ensyu03_04
 * クラス名:Ensyu03_04
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu03_04;

//乱数取得準備
import java.util.Scanner;

public class Ensyu03_04 {
//クラス内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//整数aを入力値から取得
		System.out.print("整数a:");
		int a = stdIn.nextInt();
		//整数aを入力値から取得
		System.out.print("整数b:");
		int b = stdIn.nextInt();

		//とbの大小比較をして結果をメッセージで表示
		/*aがbより大きいとき、
		 * 	コメント出力「aの方が大きいです。」*/
		if (a > b)
			System.out.println("aの方が大きいです。");
		/*bがaより大きいとき、
		 * 	コメント出力「bの方が大きいです。」*/
		else if (a < b)
			System.out.println("bの方が大きいです。");
		/*aとbが同値のとき、
		 * 	コメント出力「aとbは同じ値です。」*/
		else if (a == b)
			System.out.println("aとbは同じ値です。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}
