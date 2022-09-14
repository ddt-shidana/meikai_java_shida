package ensyu03_04;

//乱数取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 * 
 * 問題:演習3-4 p61<br>
 * 	二つの変数a, bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
 * 	「aの方が大きいです。」「bの方が大きいです。」「aとbは同じ値です。」<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_04 {

	public static void main(String[] args) {

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//整数aを入力値から取得
		System.out.print("整数a:");
		//aIntはキーボードからの入力値
		int aInt = stdIn.nextInt();
		//整数aを入力値から取得
		System.out.print("整数b:");
		//bIntはキーボードからの入力値
		int bInt = stdIn.nextInt();

		//とbの大小比較をして結果をメッセージで表示
		//aがbより大きいとき、
		if (aInt > bInt) {
			//aのほうが大きいと出力
			System.out.println("aの方が大きいです。");
		}
		//bがaより大きいとき、
		else if (aInt < bInt) {
			//bのほうが大きいと出力
			System.out.println("bの方が大きいです。");
		}
		//aとbが同値のとき、
		else if (aInt == bInt) {
			//aとbは同じと出力
			System.out.println("aとbは同じ値です。");
		}
		
		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
