package ensyu03_05;

//乱数取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 * 
 * 問題:演習3-5 p61<br>
 * 	正の整数値を読み込んで、それが5で割り切れれば
 * 	「その値は5で割り切れます。」と表示し、
 * 	そうでなければ「その値は5で割り切れません。」と表示するプログラムを作成せよ。
 * 		※正でない値を読み込んだ場合は、「正でない値が入力されました。」と表示すること。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_05 {

	public static void main(String[] args) {

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//正の整数値nを入力値から取得ナビゲーション
		System.out.println ("正の整数値n:");
		//nIntはキーボードからの入力値
		int nInt = stdIn.nextInt();

		//nIntが5で割り切れるかどうかを調べて結果を表示する
		//nIntが正の時
		if (nInt > 0) {
			//nを5で割った剰余が0のとき
			if (nInt % 5 == 0) {
				//nIntは5で割り切れる
				System.out.println("その値は5で割り切れます。");
			}
			//nIntを5で割った剰余が0以外のとき
			else {
				//nIntは5で割り切れない
				System.out.println("その値は5で割り切れません。");
			}
		}
		//nIntが負の時
		else {
			//コメント出力「正ではない値が入力されました。」
			System.err.println("正ではない値が入力されました。");
		}
		
		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
