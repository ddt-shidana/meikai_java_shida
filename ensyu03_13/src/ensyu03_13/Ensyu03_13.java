/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-13 p73
 * 	キーボードから読み込んだ三つの整数値の中央値を求めて
 * 	表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu3_13
 * クラス名:Ensyu3_13
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:2022/03/03
 * 修正者:
 * ver:1.0.0
 */


package ensyu03_13;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu03_13 {
//ここからクラスの内容です。

	public static void main(String[] args) {
	//ここからmainメソッド

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
			int a = stdIn.nextInt();
			System.out.print("整数b：");
			int b = stdIn.nextInt();
			System.out.print("整数c：");
			int c = stdIn.nextInt();

			//3つの整数値から最小値を求める
			//aを最小値minに初期設定
			int min = a;
			//現在のminよりbが小さいならば、minにbを代入
			if (b < min) min = b;
			//現在のminよりcが小さいならば、minにcを代入
			if (c < min) min = c;

			//3つの整数値から最大値を求める
			//aを最大値maxに初期設定
			int max = a;
			//現在のmaxよりbが大きいならば、maxにbを代入
			if (b > max) max = b;
			//現在のmaxよりcが大きいならば、maxにcを代入
			if (c > max) max = c;

			//3つの整数値でmin.maxと一致しない中央値mediumを求める

			/*没 ※push前の物です
			int medium = a;		//int型変数mediumを用意
			if (a != min && a != max) medium = a;
			if (b != min && b != max) medium = b;
			if (c != min && c != max) medium = c;
			*/

			/*没2 ※push前の物です
			//aを中央値mediumに初期設定
			int medium = a;
			//aが最小値または最大値だった場合
				//bが最小値または最大値だった時、中央値はc
				//bが最小値でも最大値でもない時、中央値はb
			if (a == min || a == max)
				if (b == min || b == max) medium = c;
				else medium = b;
			//(aは最小値でも最大値でもない時)
			//bが最小値または最大値だった場合、中央値はc
			else if (b == min || b == max) medium = c;
			//(aもbも最小値でも最大値でもないとき)、中央値はa
			else medium = a;
			*/

			/*中央値medium
			 * ①a=b=cのとき・・・中央値：a=b=c
			 * ②a=b||b=c||c=aのとき
			 * 	(1)a=b(!=c)のとき・・・中央値：a=b
			 * 	(2)b=c(!=a)のとき・・・中央値：b=c
			 * 	(3)c=a(!=b)のとき・・・中央値：c=a
			 * ③a!=b&b!=c&&c!=aのとき
			 * 	(1)a=maxのとき
			 * 		(ⅰ)b=minのとき・・・中央値：c
			 * 		(ⅱ)c=minのとき・・・中央値：b
			 * 	(2)b=maxのとき
			 * 		(ⅰ)a=minのとき・・・中央値：c
			 * 		(ⅱ)c=minのとき・・・中央値：a
			 * 	(3)c=maxのとき
			 * 		(ⅰ)a=minのとき・・・中央値：b
			 * 		(ⅱ)b=minのとき・・・中央値：a
			 */
			int med = a;
			if (a == b && b == a && c == a)
				med = a;
			else if (a == b || b == c || c == a) {
				if (a == b) 		med = a;
				else if (b == c)	med = c;
				else 				med = b;
			}
			else {
				if (a == max) {
					if (b == min)			med = c;
					else if (c == min)		med = b;
				}
				else if (b == max) {
					if (a == min)			med = c;
					else if (c == min)		med = a;
				}
				else {
					if (a == min)			med = b;
					else if (b == min)		med = a;
				}
			}

			//3つの整数値の中央値(medium)を画面表示させる。
			System.out.println("3つの整数値の中央値は" + med + "です。");

		//retryNumは0か1
		do {
			System.out.print("\nもう一度？ YES・・・1/NO・・・0：\n");
			retryNum = stdIn.nextInt();
		} while (retryNum < 0 || retryNum > 1);

	} while (retryNum == 1);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	//ここまでmainメソッド
	}

//クラスの内容ここまで
}