package ensyu03_06;

//乱数取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 * 
 * 問題:演習3-6 p61<br>
 * 	正の整数値を読み込んで、
 * 	それが10の倍数であれば「その値は10の倍数です。」と表示し、
 * 	そうでなければ「その値は10の倍数ではありません。」と表示するプログラムを作成せよ。
 * 		※正でない値を読み込んだ場合は、
 * 		「正でない値が入力されました。」と表示すること。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_06 {

	public static void main(String[] args) {

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//正の整数値nを入力値から取得
		System.out.println ("正の整数値n:");
		int n = stdIn.nextInt();

		//nが10の倍数かどうかを調べて結果を表示させる
		if (n > 0)		//nが正のとき10の倍数かどうかを調べる
			/*nを10で割った剰余が0のとき
			 * 	コメント出力「その値は10の倍数です。」*/
			if (n % 10 == 0)
				System.out.println("その値は10の倍数です。");
			/*nを10で割った剰余が0のとき
			 * 	コメント出力「その値は10の倍数です。」*/
			else
				System.out.println("その値は10の倍数ではありません。");
		//nが負の時コメント出力「正ではない値が入力されました。」
		else
			System.out.println("正ではない値が入力されました。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
