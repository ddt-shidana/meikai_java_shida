package ensyu07_03;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-3 p229<br>
 * 	三つのint型引数a, b, cの中央値を求めるメソッドmedを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2023/01/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_03 {

	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("3つの整数の中央値を判定するプログラムです。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

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

			//medメソッドを呼出して、中央値をメッセージ表示
			System.out.println("\t中央値：" + med(aIn, bIn,cIn));

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

	/**
	 * 3つのint型引数a,b,cの最大値を求める
	 * 
	 * @param a int型引数
	 * @param b int型引数
	 * @param c int型引数
	 * @return max 3つのint型引数a,b,cの最大値
	 */
	private static int max(int a, int b, int c) {
		//最大値、初期値をaにしておく
		int max = a;
		//仮最大値とbを比較して、bの方が大きければ
		if (max < b) {
			//最大値をbにする
			max = b;
		}
		//仮最大値とcを比較して、cのほうが大きければ
		if (max < c) {
			//最大値をcにする
			max = c;
		}
		
		return max;
	}

	/**
	 * 3つのint型引数a,b,cの中央値を求める
	 * 
	 * @param a int型引数
	 * @param b int型引数
	 * @param c int型引数
	 * @return med 3つのint型引数a,b,cの中央値
	 */
	private static int med(int a, int b, int c) {
		//maxメソッドを呼び出し
		int max = max(a, b, c);
		//minメソッドを呼び出し
		int min = min(a, b, c);
		//比較用にmed変数を初期値aで用意
		int med = a;
		
		//①a=b=cのとき
		if (a == b && b == a && c == a) {
			//中央値：a=b=c
			med = a;
		}
		
		//②a=b||b=c||c=aのとき
		else if (a == b || b == c || c == a) {
			//(1)a=b(!=c)のとき
			if (a == b) {
				//中央値：a=b
				med = a;
			}
			//(2)b=c(!=a)のとき
			else if (b == c) {
				//中央値：b=c
				med = c;
			}
			//(3)c=a(!=b)のとき
			else {
				//中央値：c=a
				med = b;
			}
		}
		
		//③a!=b&b!=c&&c!=aのとき
		else {
			//(1)a=maxのとき
			if (a == max) {
				//(ⅰ)b=minのとき
				if (b == min) {
					//中央値：c
					med = c;
				}
				//(ⅱ)c=minのとき
				else if (c == min) {
					//中央値：b
					med = b;
				}
			}
			//(2)b=maxのとき
			else if (b == max) {
				//(ⅰ)a=minのとき
				if (a == min) {
					//中央値：c
					med = c;
				}
				//(ⅱ)c=minのとき
				else if (c == min) {
					//中央値：a
					med = a;
				}
			}
			//(3)c=maxのとき
			else {
				//(ⅰ)a=minのとき
				if (a == min) {
					//中央値：b
					med = b;
				}
				//(ⅱ)b=minのとき
				else if (b == min) {
					//中央値：a
					med = a;
				}
			}
		}

		//戻り値
		return med;
	}
	
}