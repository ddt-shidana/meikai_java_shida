package ensyu07_23;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-23 p257<br>
 * 	配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッドarraySrchIdxを作成せよ。<br>
 *
 * 作成日:2022/03/08<br>
 * 修正日:2023/02/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_23 {

	//Scannerメソッド(stdInにキーボードからの入力値を初期設定)
	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を求めるプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			int elementA;
			//要素数n(>0)を入力してもらう
			do {
				System.out.print("\n配列aの要素数：");
				elementA = stdIn.nextInt();
				//n<=0だったときのエラーメッセージを表示
				if (elementA <= 0) {
					System.out.println("正の整数を入力してください。");
				}
			} while (elementA <= 0);

			//配列aを設定
			int[] array = new int[elementA];

			//配列の各要素の値を入力値から読み込む
			for (int indexItr = 0; indexItr < elementA; indexItr++) {
				System.out.print("a[" + indexItr + "] = ");
				array[indexItr] = stdIn.nextInt();
			}

			//xを入力してもらう
			System.out.print("\n検索する整数値：");
			int xIn = stdIn.nextInt();

			//各要素の値を表示
			System.out.print("a");
			printArray(array);

			//取得したインデックスの配列を表示
			System.out.println("配列を求めました。");
			System.out.print("b");
			printArray(arrayToIndexArray(array, xIn));

		} while (confirmRetry());

		stdIn.close();
	}
	
	/**
	 * 続行の確認を行うメソッド
	 * 入力値が1のとき繰り返す、0のとき終了
	 * @return 入力値が1のときTrue
	 */
	private static boolean confirmRetry() {
		int retryNum;
		do {
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			retryNum = stdIn.nextInt();
		} while (retryNum < 0 || retryNum > 1);
		return retryNum == 1;
	}
	
	/**
	 * 配列を表示する
	 * @param a 配列
	 */
	private static void printArray(int[] a) {
		System.out.print(" = {");
		for (int indexItr = 0; indexItr < a.length; indexItr++) {
			System.out.print(a[indexItr]);
			if(indexItr < a.length - 1)
				System.out.print(", ");
		}
		System.out.println("}");
	}
	
	/**
	 * 配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却する
	 * @param a 配列
	 * @param x 探したい要素値
	 * @return インデックスを格納した配列
	 */
	private static int[] arrayToIndexArray(int[] a, int x) {
		//xの個数＝arraySrchIdxの長さ
		int idxLength = 0;
		for (int placeItr = 0; placeItr < a.length; placeItr++) {
			if (a[placeItr] == x) {
				idxLength++;
			}
		}
		//xである全要素のインデックスを先頭から順に格納
		int arrayToIndexArray[] = new int[idxLength];
		int k = 0;
		for (int placeItr = 0; placeItr < a.length; placeItr++) {
			if (a[placeItr] == x) {
				arrayToIndexArray[k] = placeItr;
				k++;
			}
		}
		//返却値
		return arrayToIndexArray;
	}

}
