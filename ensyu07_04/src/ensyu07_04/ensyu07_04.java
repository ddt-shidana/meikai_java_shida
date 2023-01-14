package ensyu07_04;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-4 p231<br>
 * 	1からnまでの全整数の和を求めて返却するメソッドsumUpを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2023/01/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class ensyu07_04 {

	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("1～nまでの全整数の和を求めるプログラムです。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//整数aを入力してもらう
			System.out.print("\n整数n：");
			//変数aInに入力値を取得
			int nIn = stdIn.nextInt();

			//sumUpメソッドを呼出して、総和をメッセージ表示
			System.out.println("\t総和：" + sumUp(nIn));

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
	 * 1からnまでの全整数の和を求めて返却する
	 * 
	 * @param n 1からnまでの全整数の最大数
	 * @return sum 1からnまでの全整数の和
	 */
	private static int sumUp(int n) {
		//1からnまでの全整数の和
		int sum = 0;
		//nが1以上の時
		if (n >= 1) {
			//1からnまでの繰り返し
			for (int zItr = 1; zItr <= n; zItr++) {
				//1からnまで加算する
				sum += zItr;
			}
		}
		//nが0以下の時
		else {
			//nから1までの繰り返し
			for (int zItr = n; zItr <= 1; zItr++) {
				//nから1まで加算する
				sum += zItr;
			}
		}
		
		return sum;
	}

}