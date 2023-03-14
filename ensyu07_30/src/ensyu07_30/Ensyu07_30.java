package ensyu07_30;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-30 p263<br>
 * 	二つのint型整数a,bの最小値、
 * 	三つのint型整数a,b,cの最小値、
 * 	配列aの要素の最小値
 * 		を求める多重定義されたメソッド群を作成せよ。<br>
 *
 * 作成日:2022/03/09<br>
 * 修正日:2023/03/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_30 {

	//Scannerメソッド(stdInにキーボードからの入力値を初期設定)
	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {

		//もう一度プログラムを実行する場合のかたまり
		do {
			//プログラム開始のメッセージ
			System.out.println("3種類の実行プログラムがあります。");

			//-----3種類の実行プログラムからどれを実行するかを選んでもらう--------//
			//3種類のプログラムの案内
			System.out.println("\t①2つの整数値a,bから最小値を求めるプログラム");
			System.out.println("\t②3つの整数値a,b,cから最小値を求めるプログラム");
			System.out.println("\t③配列aの要素中の最小値を求めるプログラム");
			//選択用№を格納する変数を用意
			int selectPNum = 0;
			//1～3以外が入力されたら聞き直す
			do {
				//1～3を入力してもらう
				System.out.print("どれを実行しますか？(1～3）：");
				//入力された№を変数に格納する
				selectPNum = stdIn.nextInt();
				//0～3以外が入力された場合のエラーメッセージ
				if (selectPNum < 0 || selectPNum > 3) {
					System.out.println("1～3を入力してください。");
				}
			//0～3以外が入力されたらdoメソッドの頭に戻る
			} while (selectPNum < 0 || selectPNum > 3);

			//-----各プログラムの実行----------------------------------------------//
			switch (selectPNum) {
				//①2つの整数値a,bから最小値を求めるプログラム
				case 1: {
					//整数値aを決める
					int a = 0;
					a = determinX("a");
					//整数値bを決める
					int b = 0;
					b = determinX("b");
					//最小値を表示(最小値の値はメソッドminを呼び出し)
					System.out.println("\t最小値は " + min(a, b) + " です。");
					break;
				}

				//②3つの整数値a,b,cから最小値を求めるプログラム
				case 2: {
					//整数値aを決める
					int a = 0;
					a = determinX("a");
					//整数値bを決める
					int b = 0;
					b = determinX("b");
					//整数値cを決める
					int c = 0;
					c = determinX("c");
					//最小値を表示(最小値の値はメソッドminを呼び出し)
					System.out.println("\t最小値は " + min(a, b, c) + " です。");
					break;
				}

				//③配列aの要素中の最小値を求めるプログラム
				case 3: {
					//配列aを決める
					int[] a = scanArray("a");
					//最小値を表示(最小値の値はメソッドminを呼び出し)
					System.out.println("\t最小値は " + min(a) + " です。");
					break;
				}

			}

		//再度実行するかどうかを聞いて、もう一度なら繰り返す：confirmRetryメソッドの呼び出し
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
	 * 入力値から整数値xをきめる
	 * @param xSt 整数文字列
	 * @return 入力値
	 */
	private static int determinX (String xSt) {
		//返却値を格納する変数を用意
		int determinX;
		//整数を入力してもらうメッセージ
		System.out.print("整数" + xSt + "：");
		//入力値をdeterminXとして扱う
		determinX = stdIn.nextInt();
		//返却値
		return determinX;
	}
	
	/**
	 * 一次元配列の要素の値を入力によって決める
	 * @param xSt
	 * @return
	 */
	private static int[] scanArray (String xSt) {
		//要素数（列数）を格納する変数を用意
		int cLength = 0;
		//列数は1以上
		do {
			//列数を聞く
			System.out.print("配列" + xSt + "の列数：");
			//入力値を列数として扱う
			cLength = stdIn.nextInt();
			//0以下の値が入力されたらエラーメッセージを表示
			if (cLength < 1) {
				System.out.println("正の整数を入力してください。");
			}
		//1未満が入力されたらループ
		} while (cLength < 1);

		//配列xを用意
		int[] x = new int[cLength];

		//一次元配列xの要素数を定義
		x = new int[cLength];

		//要素の値を入力してもらう
		//メッセージ
		System.out.println("配列" + xSt + "の各要素の値を入力してください。");
		//xのインデックスを順番に動いて要素を入力値から取得する
		for (int idxItr = 0; idxItr < cLength; idxItr++) {
			//入力してもらうインデックスの見出し
			System.out.print("\t" + xSt + "[" + idxItr + "] = ");
			//入力値を該当要素の値として設定
			x[idxItr] = stdIn.nextInt();
		}
		//配列xを表示する
		//配列x
		System.out.println("＜配列" + xSt + "＞");
		printArray(x);

		//返却値は配列
		return x;
	}

	/**
	 * 二つのint型整数a,bの最小値を求める※多重定義
	 * @param a 整数
	 * @param b 整数
	 * @return 最小値
	 */
	private static int min(int a, int b) {
		//aとbで小さい方を返却値とする
		return a < b ? a : b;
	}

	/**
	 * 三つのint型整数a,b,cの最小値を求める※多重定義
	 * @param a 整数
	 * @param b 整数
	 * @param c 整数
	 * @return 最小値
	 */
	private static int min(int a, int b, int c) {
		//比較用に変数を用意し、初期値aを設定
		int min = a;
		//minが比較対象より大きい場合、比較対象をminに入れなおす
		if (min > b) min = b;
		if (min > c) min = c;
		//返却値は比較し終わったmin
		return min;
	}

	/**
	 * 配列aの要素の最小値を求める※多重定義
	 * @param a 配列
	 * @return 最小値
	 */
	private static int min(int[] a) {
		//比較用に変数を用意し、初期値a[0]を設定
		int min = a[0];
		//インデックスの小さい要素から順に比較していく
		for (int idxItr = 1; idxItr < a.length; idxItr++) {
			//もしminより比較対象の方が小さかったらminを比較対象に置き換える
			if (min > a[idxItr]) {
				min = a[idxItr];
			}
		}
		//返却値は比較し終わったmin
		return min;
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