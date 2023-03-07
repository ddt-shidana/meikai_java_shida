package ensyu07_26;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-26 p257<br>
 * 	配列の要素a[idx]にxを挿入した配列を返却するメソッドarrayInsOfを作成せよ。<br>
 *
 * 作成日:2022/03/08<br>
 * 修正日:2023/03/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_26 {

	//Scannerメソッド(stdInにキーボードからの入力値を初期設定)
	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("配列要素a[idx]にxを挿入するプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			int eIn;
			//要素数e(>0)を入力してもらう
			do {
				System.out.print("\n要素数：");
				eIn = stdIn.nextInt();
				//e<=0だったときのエラーメッセージを表示
				if (eIn < 0) {
					System.out.println("0以上の整数を入力してください。");
				}
			} while (eIn < 0);

			//配列aを設定
			int[] array = new int[eIn];

			//配列の各要素の値を入力値から読み込む
			for (int indexItr = 0; indexItr < eIn; indexItr++) {
				System.out.print("a[" + indexItr + "] = ");
				array[indexItr] = stdIn.nextInt();
			}

			//配列a要素を挿入するインデックスを入力してもらう
			int idxIn;
			//0<=idx<=eInなので、それ以外は聞き直す
			do {
				System.out.print("配列aに要素を挿入するインデックス値：");
				idxIn = stdIn.nextInt();
				//0より小さい場合のエラーメッセージの表示
				if (idxIn < 0) {
					System.out.println("インデックスは0以上を入力してください。");
				}
				//最終インデックス+1(要素数)より大きい場合のエラーメッセージを表示
				else if (idxIn > eIn) {
					System.out.println("インデックスは要素数以下の値を入力してください。");
				}
			} while (idxIn < 0 || idxIn > eIn);

			//挿入する要素の値x
			System.out.print("配列aに挿入する要素の値：");
			int xIn = stdIn.nextInt();


			//各要素の値を表示
			//ヘッダを表示
			System.out.print("a");
			//中身からフッダまでの表示をメソッド呼び出し
			printArray(array);

			//結果を表示
			System.out.println("配列を求めました。");
			//ヘッダを表示
			System.out.print("b");
			//中身からフッダまでの表示をメソッド呼び出し
			printArray(insertValueArray(array, idxIn, xIn));


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
	 * 配列の要素a[idx]にxを挿入した配列を返却する
	 * @param a 配列
	 * @param idx 挿入したいインデックス位置
	 * @param x 挿入する値
	 * @return 配列
	 */
	private static int[] insertValueArray(int[] a, int idx, int x) {
		//求める配列、要素数は引数の長さからxを1追加する為+1した値
		int[] insertValueArray = new int[a.length + 1];
		//追加するインデックス位置より手前に要素がある場合
		if (idx > 0) {
			//求める配列に元の配列をそのまま格納するループ
			for (int placeItr = 0; placeItr < idx; placeItr++) {
				insertValueArray[placeItr] = a[placeItr];
			}
		}
		//xを追加
		insertValueArray[idx] = x;
		//追加するインデックス位置より後方に要素がある場合
		if (idx < a.length) {
			//繰り返し回数を求めて置く
			int times = a.length - idx;
			//求める配列はxを追加した分1つ後ろのインデックスから、元の配列の要素を格納するループ
			for (int timeItr = 0; timeItr < times; timeItr++) {
				insertValueArray[idx + 1 + timeItr] = a[idx + timeItr];
			}
		}
		//返却値は配列
		return insertValueArray;
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
