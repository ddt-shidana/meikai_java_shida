package ensyu07_28;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-28 p259<br>
 * 	行列xとyの和を格納した2次元配列を返すメソッドを作成せよ。<br>
 *
 * 作成日:2022/03/09<br>
 * 修正日:2023/03/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_28 {

	//Scannerメソッド(stdInにキーボードからの入力値を初期設定)
	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {

		//プログラム開始のメッセージ
		System.out.println("行列aとbを足した行列cを求めるプログラムです。\n");

		//もう一度プログラムを実行する場合のかたまり
		do {
			/*配列a,bを決めるルール
			 * 	配列a,bの行数・列数は一緒
			 * 	行数(lLength)は1以上、
			 * 	列数(cLength[])は全行がNULLの場合不適切
			 */
			//----------行数を決める-----------------------------------------------//
			//先に変数だけ用意：lLength・・・配列a,bの行数
			int lLength;
			//行数は1以上なので、0以下の場合聞き直すためのループ
			do {
				//a,bの行数を聞く
				System.out.print("行数：");
				//今の入力値を行数として格納する
				lLength = stdIn.nextInt();
				//入力値が0以下の時エラーメッセージを表示
				if (lLength < 1) {
					System.out.println("正の整数を入力してください。");
				}
			//0以下でループ
			} while (lLength < 1);

			//----------配列a,bを宣言する------------------------------------------//
			int[][] a = new int[lLength][];
			int[][] b = new int[lLength][];

			//----------列数を決める-----------------------------------------------//
			//先に変数だけ用意：cLength[]・・・配列a,bの各行の列数を格納する配列(要素数は行数lLength)
			int[] cLength = new int[lLength];

			//全行の入力が終わり、全ての行の列数がNULLだと成り立たないので聞き直す
			do {
				//a,bの各行の列数を聞くため、行数分ループ
				for (int lineItr = 0; lineItr < lLength; lineItr++) {
					//列数に0未満が入力されたら聞き直す
					do {
						//現在の行の列数を聞く
						System.out.print(lineItr + "行目の列数：");
						//今の入力値を現在の行数の列数として格納する
						cLength[lineItr] = stdIn.nextInt();
						//配列a,bの各行の列数を宣言
						a[lineItr] = new int[cLength[lineItr]];
						b[lineItr] = new int[cLength[lineItr]];
						//入力値が0未満の時エラーメッセージを表示
						if (cLength[lineItr] < 0) {
							System.out.println("0以上の整数を入力してください。");
						}
					//列数に0未満が入力されたら聞き直す
					} while (cLength[lineItr] < 0);
				}
				//cLengthがisNullAllの時のエラーメッセージ
				if (isNullAll(cLength)) {
					System.out.println("少なくとも1行は1以上を入力してください。");
				}
			//cLengthがisNullAll(メソッド呼び出す)の場合ループ
			} while (isNullAll(cLength));

			//----------要素の値を決める--------------------------------------------//
			//配列a
			System.out.println("＜配列a＞");
			//配列aの各要素の値を入力値から得る：scanArrayメソッド呼び出し
			scanArray(a);
			//配列b
			System.out.println("＜配列b＞");
			//配列bの各要素の値を入力値から得る：scanArrayメソッド呼び出し
			scanArray(b);

			//----------配列cを求める---------------------------------------------//
			//cはa+bが入る、要素数はa,bと同じにならなければならない
			int[][] c = new int[lLength][];
			//a+bを計算する
			addMatrix(a, b, c);
			//結果を表示する
			System.out.println("\n配列cを求めました。結果を表示します。");
			//配列a
			System.out.println("＜配列a＞");
			printMatrix(a);
			//配列b
			System.out.println("＜配列b＞");
			printMatrix(b);
			//配列c
			System.out.println("＜配列c＞");
			printMatrix(c);

		//再度実行するかどうかを聞いて、もう一度なら繰り返す：confirmRetryメソッドの呼び出し
		} while (confirmRetry());

	}
	
	/**
	 * 配列の中身がすべて0か確認する
	 * @param x 配列
	 * @return 全要素が0の時true
	 */
	private static boolean isNullAll (int[] x) {
		//判定用の値を格納するための変数を、あらかじめ用意しておく
		int judgeNum = -1;
		//受け取った配列の要素の値を順番に見てゆくループ
		for (int i : x) {
			//値が1以上なら0を返して終わり
			if (i > 0) {
				return false;
			}
			//すべて0なら1を返す
			if (i == 0) {
				judgeNum = 1;
			}
		}
		return judgeNum == 1;
	}

	/**
	 * 行列xとyの和をzに代入する
	 * @param x 行列
	 * @param y 行列
	 * @param z 行列
	 * @return 行列の和をセットする
	 */
	private static void addMatrix(int[][] x, int[][] y, int[][] z) {
		if (equalMatrixLengthOfThree(x, y, z)) {
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					z[i][j] = x[i][j] + y[i][j];
				}
			}
		}
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

	/**
	 * 二次元配列の要素の値を入力によって決める
	 * @param x 配列
	 */
	private static void scanArray (int[][] x) {
		//要素の値を聞く
		System.out.println("各要素の値を入力してください。");
		//各行
		for (int lineItr = 0; lineItr < x.length; lineItr++) {
			//もし列数が0なら飛ばす
			if (x[lineItr].length > 0) {
				//各列
				for (int colItr = 0; colItr < x[lineItr].length; colItr++) {
					//聞く行列数目の表示
					System.out.print("\t" + lineItr + "行" + colItr + "列目：");
					//入力値を現在聞いているインデックスに要素数として格納
					x[lineItr][colItr] = stdIn.nextInt();
				}
			}
		}
	}

	/**
	 * 任意の3つの2次元配列の行数と列数が同一か確認する
	 * @param p 2次元配列
	 * @param q 2次元配列
	 * @param r 2次元配列
	 * @return 行数列数全てが一致している場合にtrue
	 */
	private static boolean equalMatrixLengthOfThree(int[][] p, int[][] q, int[][] r) {
		//行数列数全てが一致している場合（1）にtrueを返す
		return equalMatrixLength(p, q) && equalMatrixLength(q, r) && equalMatrixLength(r, p);
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

}
