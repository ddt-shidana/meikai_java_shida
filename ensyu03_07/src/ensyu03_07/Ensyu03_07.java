package ensyu03_07;

//乱数取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 * 
 * 問題:演習3-7 p61<br>
 * 	正の整数値を読み込んで、それを3で割った値に応じて
 * 	「その値は3で割り切れます。」
 * 	「その値を3で割った余りは1です。」
 * 	「その値を3で割った余りは2です。」
 * 	のいずれかを表示するプログラムを作成せよ。
 * 		※正でない値を読み込んだ場合は、
 * 		「正でない値が入力されました。」と表示すること。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_07 {

	public static void main(String[] args) {

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//正の整数値nを入力値から取得
		System.out.print("正の整数値n:");
		//nIntはキーボードからの入力値
		int nInt = stdIn.nextInt();

		//nIntを3で割ったとき、割り切れるか、余りはいくらかを調べて表示させる
		//nIntが正の場合のみ3で割る
		if (nInt > 0) {
			//nが3で割り切れる（剰余0）のとき
			if (nInt % 3 == 0) {
				//コメント出力「その値は3で割り切れます。
				System.out.println("その値は3で割り切れます。");
			}
			//nIntを3で割った剰余が1のとき
			else if (nInt % 3 ==1) {
				//コメント出力「その値を3で割った余りは1です。」*/
				System.out.println("その値を3で割った余りは1です。");
		}
		//nIntを3で割った剰余が2のとき
			else if (nInt % 3 ==2) {
				//コメント出力「その値を3で割った余りは2です。」
				System.out.println("その値を3で割った余りは2です。");
			}
		}
		//nが正ではないときコメント出力「正ではない値が入力されました。」
		else {
			System.out.println("正ではない値が入力されました。");
		}
		
		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
