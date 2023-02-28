package ensyu07_21;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-21 p255<br>
 * 	配列aと配列bの全要素をの値を交換するメソッドaryExchngを作成せよ。<br>
 *
 * 作成日:2022/03/08<br>
 * 修正日:2023/02/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_21 {

	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列aと配列bの全要素をの値を交換するプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			//配列A
			int elementA;
			//要素数elementA(>0)を入力してもらう
			do {
				System.out.print("\n要素数：");
				elementA = stdIn.nextInt();
				//e<0だったときのエラーメッセージを表示
				if (elementA < 0) {
					System.out.println("0より大きい整数を入力してください。");
				}
			} while (elementA <= 0);

			//配列aを設定
			int[] arrayA = new int[elementA];

			//配列の各要素の値を入力値から読み込む
			for (int indexItr = 0; indexItr < elementA; indexItr++) {
				System.out.print("a[" + indexItr + "] = ");
				arrayA[indexItr] = stdIn.nextInt();
			}

			//配列B
			int elementB;
			//要素数elementB(>0)を入力してもらう
			do {
				System.out.print("\n要素数：");
				elementB = stdIn.nextInt();
				//e<0だったときのエラーメッセージを表示
				if (elementB < 0) {
					System.out.println("0より大きい整数を入力してください。");
				}
			} while (elementB <= 0);

			//配列aを設定
			int[] arrayB = new int[elementB];

			//配列の各要素の値を入力値から読み込む
			for (int indexItr = 0; indexItr < elementB; indexItr++) {
				System.out.print("a[" + indexItr + "] = ");
				arrayB[indexItr] = stdIn.nextInt();
			}

			//各要素の値を表示
			System.out.print("a");
			printArray(arrayA);
			System.out.print("b");
			printArray(arrayB);

			//比較する
			if (arrayA.length <= arrayB.length)  {
				exchangeArray(arrayA, arrayB);
			}
			else {
				exchangeArray(arrayB, arrayA);
			}

			//結果を表示する
			System.out.println("交換しました。");
			System.out.print("a");
			printArray(arrayA);
			System.out.print("b");
			printArray(arrayB);
		} while (confirmRetry());

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
	 * 配列aと配列bの全要素の値を交換する
	 * @param a 配列
	 * @param b 配列
	 */
	private static void exchangeArray(int[] a, int[] b) {
		for (int idxItr = 0; idxItr < a.length; idxItr++) {
			int tempValue = a[idxItr];
			a[idxItr] = b[idxItr];
			b[idxItr] = tempValue;
		}
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
	
}
