package ensyu07_01;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-1 p229<br>
 * 	受け取ったint型因数の値nが
 * 		負であれば-1を返却し、
 * 		0であれば0を返却し、
 * 		正であれば1を返却する
 * 	メソッドsign0fを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2023/01/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_01 {

	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("整数nの正負を判定するプログラムです。");
		System.out.println("負:-1/0:0/正:1 で結果表示します。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//整数nを入力してもらう
			System.out.print("\n整数n：");

			//変数nInに入力値を取得
			int nIn = stdIn.nextInt();

			//plusAndMinusメソッドを呼出して、正負判定結果をメッセージ表示
			System.out.println("\t正負判定：" + plusAndMinus(nIn));

			//retryNumは0か1
			do {
				System.out.print("もう一度？ YES・・・1/NO・・・0：");
				retryNum = stdIn.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	}

	/**
	 * 正か負かまたは0かを返却する
	 * 
	 * @param n int型因数の値
	 * @return plusAndMinus 負であれば-1を返却し、0であれば0を返却し、正であれば1を返却する
	 */
	private static int plusAndMinus(int n) {
		//返却値
		int plusAndMinus = n;
		//引数nが負のとき
		if (n < 0) {
			//-1を返却
			plusAndMinus = -1;
		}
		//引数nが0のとき
		else if (n == 0) {
			//0を返却
			plusAndMinus = 0;
		}
		//引数nが正のとき
		else {
			//1を返却
			plusAndMinus = 1;
		}
		return plusAndMinus;
	}

}