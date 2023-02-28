package ensyu07_24;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-24 p257<br>
 * 	配列aから要素a[idx]を削除した配列を返却するメソッドarrayRmvOfを作成せよ。<br>
 *
 * 作成日:2022/03/08<br>
 * 修正日:2023/02/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_24 {

	//Scannerメソッド(stdInにキーボードからの入力値を初期設定)
	private static Scanner stdIn = new Scanner (System.in);
	
	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列aから要素a[idx]を削除した配列を求めるプログラムです。");

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

			//配列aから削除する要素のインデックスを入力してもらう
			//0<=idx<array.lengthなので、それ以外は聞き直す
			int idxIn;
			do {
				System.out.print("配列aから削除するインデックス値：");
				idxIn = stdIn.nextInt();
				//0より小さい値が入力されたとき、エラーメッセージの表示
				if (idxIn < 0) {
					System.out.println("インデックスは0以上を入力してください。");
				}
				//要素数より小さい値が入力されたとき、エラーメッセージの表示
				else if (idxIn >= array.length) {
					System.out.println("インデックスは要素数より小さい値を入力してください。");
				}
			} while (idxIn < 0 || idxIn >= array.length);

			//各要素の値を表示
			//ヘッダを表示
			System.out.print("a");
			//中身からフッダまでの表示をメソッド呼び出し
			printArray(array);

			//取得したインデックスの配列を表示
			System.out.println("配列を求めました。");
			//ヘッダを表示
			System.out.print("b");
			//中身からフッダまでの表示をメソッド呼び出し
			printArray(removeArrayIndex(array, idxIn));

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
	 * 配列aから要素a[idx]を削除した配列を返却する
	 * @param a 配列
	 * @param idx 削除するインデックス
	 * @return あるインデックスの要素削除後の配列
	 */
	private static int[] removeArrayIndex(int[] a, int idx) {
		//1こ削除するのでaの要素の長さ-1の要素数をもつ配列を用意
		int[] arrayRmvOf = new int[a.length - 1];
		//idxの手前まではコピー
		for (int placeItr = 0; placeItr < idx; placeItr++) {
			arrayRmvOf[placeItr] = a[placeItr];
		}
		//idxより後は1個ずらして格納
		for (int placeItr = idx; placeItr < arrayRmvOf.length; placeItr++) {
			arrayRmvOf[placeItr] = a[placeItr + 1];
		}
		return arrayRmvOf;
	}

}
