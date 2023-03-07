package ensyu07_27;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-27 p259<br>
 * 	List7-20のプログラムを三つの配列の要素数が
 * 	等しければ加算を行ってtrueを返し、
 * 	等しくなければ加算を行わずにfalseを返すメソッドに書き換えよ。<br>
 *
 * 作成日:2022/03/09<br>
 * 修正日:2023/03/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_27 {

	//Scannerメソッド(stdInにキーボードからの入力値を初期設定)
	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {

		//配列a,bを決める
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };

		//配列a,bの表示
		System.out.println("行列a");	printMatrix(a);
		System.out.println("行列b");	printMatrix(b);

		//配列cを用意
		int[][] c = new int[2] [3];

		//3つの配列の行列が一致したら
		if (addMatrix(a, b, c) == true) {
			//一致したメッセージを表示
			System.out.println("3つの配列の行列が一致しました。");
			//a+bをcとし、cを表示
			System.out.println("行列c");
			printMatrix(c);
		}
		//3つの配列の行列が一致しなかったら
		else {
			//一致しないメッセージを表示
			System.out.println("3つの配列の行列が一致しません。");
		}
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
	 * 任意の2つの2次元配列の行数と列数が同一か確認する
	 * @param p 二次元配列
	 * @param q 二次元配列
	 * @return 行数と列数が一致していたらTrue
	 */
	private static boolean equalMatrixLength(int[][] p, int[][] q) {
		int equalNum = -1;
		//行数一致の確認
		if (p.length == q.length) {
			//各行の
			for (int lItr = 0; lItr < p.length; lItr++) {
				//列数一致の確認
				if (p[lItr].length != q[lItr].length) {
					//一致していなかったら0
					equalNum = 0;
					break;
				}
				//一致していたら1
				else {
					equalNum = 1;
				}
			}
		}
		//行数が一致していなかったら0
		else {
			equalNum = 0;
		}
		//行数列数全てが一致している場合（1）にtrueを返す
		return equalNum == 1;
	}

	/**
	 * 任意の3つの2次元配列の行数と列数が同一か確認する
	 * @param p 2次元配列
	 * @param q 2次元配列
	 * @param r 2次元配列
	 * @return
	 */
	private static boolean equalMatrixLengthOfThree(int[][] p, int[][] q, int[][] r) {
		int equalNum3;
		if (equalMatrixLength(p, q) && equalMatrixLength(q, r) && equalMatrixLength(r, p)) {
			equalNum3 = 1;
		}
		else {
			equalNum3 = 0;
		}
		//行数列数全てが一致している場合（1）にtrueを返す
		return equalNum3 == 1;
	}

	/**
	 * 行列xとyの和をzに代入する
	 * @param x 行列
	 * @param y 行列
	 * @param z 行列
	 * @return 行列の和をセットする
	 */
	private static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if (equalMatrixLengthOfThree(x, y, z)) {
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					z[i][j] = x[i][j] + y[i][j];
				}
			}
		}
		//x,y,zの行列が全て一致している時true
		return (equalMatrixLengthOfThree(x, y, z));
	}

	/**
	 * 行列mの全要素を表示する
	 * @param m 行列
	 */
	private static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();
		}
	}
	

}
