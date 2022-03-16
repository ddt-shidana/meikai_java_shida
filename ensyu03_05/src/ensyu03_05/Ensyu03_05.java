/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-5 p61
 * 	正の整数値を読み込んで、それが5で割り切れれば
 * 	「その値は5で割り切れます。」と表示し、
 * 	そうでなければ「その値は5で割り切れません。」と表示するプログラムを作成せよ。
 * 		※正でない値を読み込んだ場合は、「正でない値が入力されました。」と表示すること。
 *
 * パッケージ名:ensyu03_05
 * クラス名:Ensyu03_05
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu03_05;

//乱数取得準備
import java.util.Scanner;

public class Ensyu03_05 {
//クラス内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//正の整数値nを入力値から取得
		System.out.println ("正の整数値n:");
		int n = stdIn.nextInt();

		//nが5で割り切れるかどうかを調べて結果を表示する
		if (n > 0)		//nが正のとき5で割り切れるかどうかを調べる
			/*nを5で割った剰余が0のとき
			 * 	コメント出力「その値は5で割り切れます。 */
			if (n % 5 == 0)
				System.out.println("その値は5で割り切れます。");
			/*nを5で割った剰余が0以外のとき
			 * 	コメント出力「その値は5で割り切れません。 */
			else
				System.out.println("その値は5で割り切れません。");
		//nが負の時コメント出力「正ではない値が入力されました。」
		else
		System.out.println("正ではない値が入力されました。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}
