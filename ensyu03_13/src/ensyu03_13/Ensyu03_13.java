package ensyu03_13;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習3-13 p73<br>
 * 	キーボードから読み込んだ三つの整数値の中央値を求めて
 * 	表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_13 {

	public static void main(String[] args) {

		//プログラム開始メッセージ
		System.out.println("3つの整数の中央値を判定するプログラムです。\n");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			System.out.println("整数値を3つ入力してください。");
			//整数型変数a,b,cを用意し、入力値(stdIn)を初期設定
			System.out.print("整数a：");
			int aInt = stdIn.nextInt();
			System.out.print("整数b：");
			int bInt = stdIn.nextInt();
			System.out.print("整数c：");
			int cInt = stdIn.nextInt();

			//3つの整数値から最小値を求める
			//aを最小値minに初期設定
			int min = aInt;
			//現在のminよりbが小さいならば、minにbを代入
			if (bInt < min) min = bInt;
			//現在のminよりcが小さいならば、minにcを代入
			if (cInt < min) min = cInt;

			//3つの整数値から最大値を求める
			//aを最大値maxに初期設定
			int max = aInt;
			//現在のmaxよりbが大きいならば、maxにbを代入
			if (bInt > max) max = bInt;
			//現在のmaxよりcが大きいならば、maxにcを代入
			if (cInt > max) max = cInt;

			//3つの整数値でmin.maxと一致しない中央値mediumを求める
			//中央値の初期値としてaIntを設定
			int med = aInt;
			//①a=b=cのとき
			if (aInt == bInt && bInt == aInt && cInt == aInt)
				//中央値：a=b=c
				med = aInt;
			//②a=b||b=c||c=aのとき
			else if (aInt == bInt || bInt == cInt || cInt == aInt) {
				//(1)a=b(!=c)のとき
				if (aInt == bInt) {
					//中央値：a=b
					med = aInt;
				}
				//(2)b=c(!=a)のとき
				else if (bInt == cInt) {
					//中央値：b=c
					med = cInt;
				}
				//(3)c=a(!=b)のとき
				else {
					//中央値：c=a
					med = bInt;
				}
			}
			//③a!=b&b!=c&&c!=aのとき
			else {
				//(1)a=maxのとき
				if (aInt == max) {
					//(ⅰ)b=minのとき
					if (bInt == min) {
						//中央値：c
						med = cInt;
					}
					//(ⅱ)c=minのとき
					else {
						//中央値：b
						med = bInt;
					}
				}
				//(2)b=maxのとき
				else if (bInt == max) {
					//(ⅰ)a=minのとき
					if (aInt == min) {
						//中央値：c
						med = cInt;
					}
					//(ⅱ)c=minのとき
					else {
						//中央値：a
						med = aInt;
					}
				}
				//(3)c=maxのとき
				else {
					//(ⅰ)a=minのとき
					if (aInt == min) {
						//中央値：b
						med = bInt;
					}
					//(ⅱ)b=minのとき
					else {
						//中央値：a
						med = aInt;
					}
				}
			}

			//3つの整数値の中央値(medium)を画面表示させる。
			System.out.println("3つの整数値の中央値は" + med + "です。");

			//このプログラムをもう一度実行するかどうかを聞くブロック
			do {
				//1か0を入力してもらう
				System.out.print("\nもう一度？ YES・・・1/NO・・・0：\n");
				//retryNumはキーボードからの入力値
				retryNum = stdIn.nextInt();
			
			//retryNumが0か1以外の場合もう一度doブロックを繰り返す
			} while (retryNum < 0 || retryNum > 1);
			
		//retryNumが1の間このプログラムを繰り返す
		} while (retryNum == 1);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}

}