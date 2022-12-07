package ensyu06_13;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-13 p203<br>
 * 	配列aの全要素を配列bに対して逆順にコピーするプログラムを作成せよ。
 * 	なお、二つの配列の要素数は同一であることを仮定して良い。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_13 {
	
	public static void main(String[] args) {
		
		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//配列aを用意し、その要素数を入力値から取得する
			System.out.print("要素数：");
			int aLength = standardInput.nextInt();
			int[] a = new int[aLength];

			//配列の全要素の値に1～100の乱数を格納
			for (int i = 0; i < aLength; i++) {
				a[i] = 1 + rand.nextInt(100);
			}

			//配列aの全要素の値を表示
			System.out.print("配列aの全要素の値\n{ ");
			for (int i = 0; i < aLength; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println("}");

			//配列b(要素数はaと同じに設定)を用意し、配列aを逆順で格納
			int[] b = new int[aLength];
			for (int iterator = 0; iterator < aLength; iterator++) {
				b[iterator] = a[aLength - 1 - iterator];
			}

			//配列bの全要素の値を表示
			System.out.print("配列aの全要素を逆順で配列bにコピーしました。\n{ ");
			for (int bInt : b) {
				System.out.print(bInt + " ");
			}
			System.out.println("}");

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNum = standardInput.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);


		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}