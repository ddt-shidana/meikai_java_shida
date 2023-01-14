package ensyu07_02;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-2 p229<br>
 * 	三つのint型引数a,b,cの最小値を求めるメソッドminを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2023/01/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_02 {

	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("3つの整数の最小値を判定するプログラムです。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//整数aを入力してもらう
			System.out.print("\n整数a：");
			//変数aInに入力値を取得
			int aIn = stdIn.nextInt();

			//整数bを入力してもらう
			System.out.print("整数b：");
			//変数bInに入力値を取得
			int bIn = stdIn.nextInt();

			//整数cを入力してもらう
			System.out.print("整数c：");
			//変数bInに入力値を取得
			int cIn = stdIn.nextInt();

			//minメソッドを呼出して、最小値をメッセージ表示
			System.out.println("\t最小値：" + min(aIn, bIn,cIn));

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
	 * 3つのint型引数a,b,cの最小値を求める
	 * 
	 * @param a int型引数
	 * @param b int型引数
	 * @param c int型引数
	 * @return min 3つのint型引数a,b,cの最小値
	 */
	private static int min(int a, int b, int c) {
		//最小値、初期値をaに設定しておく
		int min = a;
		//仮最小値とbを比較して、bの方が小さければ
		if (min > b) {
			//最小値をbにする
			min = b;
		}
		//仮最小値とcを比較して、cのほうが小さければ
		if (min > c) {
			//最小値をcにする
			min = c;
		}
		
		return min;
	}

}
