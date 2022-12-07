package ensyu06_16;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-16 p211<br>
 * 	4行3列の行列なと3行4列の行列の積を求めるプログラムを作成せよ。
 * 	各要素の値はキーボードから読み込むこと。<br>
 *
 * 作成日:2022/03/02<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_16 {
	
	/*配列の積を求める為の準備
	 * 	配列a[i][k]×配列b[k][j]=配列c[i][j] とする
	 * 	今回は
	 * 		i=4, k=3, j=4とする
	 */
	//左の行列の行数
	private static int LEFT_ROW_NUMBER = 4;
	//左の行列の列数
	private static int LEFT_COLUMN_NUMBER = 3;
	//右の行列の行数
	private static int RIGHT_ROW_NUMBER = 3;
	//右の行列の列数
	private static int RIGHT_COLUMN_NUMBER = 4;
	
	public static void main(String[] args) {
		
		//行列の積の前提条件チェック：左の行列の列数＝右の行列の行数
		if (LEFT_COLUMN_NUMBER != RIGHT_ROW_NUMBER) {
			//異常終了のメッセージを出す
			System.err.print("異常終了：左の行列の列数＝右の行列の行数になっていません。");
			//終了
			System.exit(0);
		}

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//配列a(左)
		int[][] leftArray = new int[LEFT_ROW_NUMBER][LEFT_COLUMN_NUMBER];
		//配列b(右)
		int[][] rightArray = new int[RIGHT_ROW_NUMBER][RIGHT_COLUMN_NUMBER];
		//配列c(a*b)
		int[][] multiplicationArray = new int[LEFT_ROW_NUMBER][RIGHT_COLUMN_NUMBER];

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {
			
			//配列aの中身を決定する -----------------------------
			//配列aの行数分繰り返す
			for (int rowIterator = 0; rowIterator < LEFT_ROW_NUMBER; rowIterator++) {
				//配列aの列数分繰り返す
				for (int columnIterator = 0; columnIterator < LEFT_COLUMN_NUMBER; columnIterator++) {
					//処理中のインデックスの表示
					System.out.print("a[" + rowIterator + "][" + columnIterator + "] = ");
					//処理中の要素値に入力値をセット
					leftArray[rowIterator][columnIterator] = stdIn.nextInt();
				}
			}

			//改行
			System.out.println();
			
			//配列bの中身を決定する -----------------------------
			//配列bの行数分繰り返す
			for (int rowIterator = 0; rowIterator < RIGHT_ROW_NUMBER; rowIterator++) {
				//配列bの列数分繰り返す
				for (int columnIterator = 0; columnIterator < RIGHT_COLUMN_NUMBER; columnIterator++) {
					//処理中のインデックスの表示
					System.out.print("b[" + rowIterator + "][" + columnIterator + "] = ");
					//処理中の要素値に入力値をセット
					rightArray[rowIterator][columnIterator] = stdIn.nextInt();
				}
			}

			/*	表示する時に何桁揃えにするかを求める為に、
			 * 	配列aと配列bの要素値の最大桁数を求めます。
			 * 		配列aの全要素値の最大桁数：leftMaxDigits
			 * 		配列bの全要素値の最大桁数：rightMaxDigits
			 * 		配列cの全要素値の最大桁数：matrixMaxDigits
			 * 			leftMaxDigits + rightMaxDigits <= matrixMaxDigits
			 */
			//配列aの全要素値の最大桁数：leftMaxDigits
			int leftMaxDigits = maxDigits(leftArray);
			//配列bの全要素値の最大桁数：rightMaxDigits
			int rightMaxDigits = maxDigits(rightArray);
			//leftMaxDigits + rightMaxDigits <= matrixMaxDigits
			int matrixMaxDigits = maxDigits(leftArray) + maxDigits(rightArray);

			//配列aを画面表示
			System.out.println("行列a");
			matrixDisplay(leftArray, leftMaxDigits);

			//配列bを画面表示
			System.out.println("行列b");
			matrixDisplay(rightArray, rightMaxDigits);

			//配列cの中身を決定する -----------------------------
			System.out.println("行列c=abです");
			//配列cの行のループ
			for (int i = 0; i < LEFT_ROW_NUMBER; i++) {
				//配列cの列のループ
				for (int j = 0; j < RIGHT_COLUMN_NUMBER; j++) {
					//aとbの積の和
					int matrixMultiplicationInt = 0;
					//配列aの列、配列bの行のループ
					for (int k = 0; k < LEFT_COLUMN_NUMBER; k++) {
						//配列aは行固定、配列bは列固定でかけ合わせた値の合計値を計算
						matrixMultiplicationInt += leftArray[i][k] * rightArray[k][j];
					}
					//行列cの要素値
					multiplicationArray[i][j] = matrixMultiplicationInt;
					//行列cの全要素の最大桁数で要素値を表示
					System.out.printf("%" + matrixMaxDigits +"d ", multiplicationArray[i][j]);
				}
				//改行
				System.out.println("");
			}

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
	 * int型二次元配列の全要素の最大桁数を求める
	 * 
	 * @param matrixArray 行列（二次元配列）
	 * @return maxNumberOfDigits matrixArray 全要素の最大桁数
	 */
	private static int maxDigits(int[][] matrixArray) {
		//全要素の最大桁数、初期値に0行0列目の要素値を設定
		int maxNumberOfDigits = String.valueOf(matrixArray[0][0]).length();
		
		//行列の行のループ
		for (int rowIterator = 0; rowIterator < matrixArray.length; rowIterator++) {
			//行列の列のループ
			for (int columnIterator = 0; columnIterator < matrixArray[rowIterator].length; columnIterator++) {
				//0行0列目のときは
				if(rowIterator == 0 && columnIterator == 0) {
					//とばす
					break;
				}
				//処理中の要素の値の桁数
				int numberOfDigits = String.valueOf(matrixArray[rowIterator][columnIterator]).length();
				//現在の最大桁数より処理中の要素の桁数が大きい場合
				if(maxNumberOfDigits < numberOfDigits) {
					//処理中の要素の値の桁数を最大桁数に設定
					maxNumberOfDigits = numberOfDigits;
				}
			}
		}
		
		return maxNumberOfDigits;
	}
	
	/**
	 * 二次元配列を表示する
	 * 
	 * @param matrixArray 行列（二次元配列）
	 * @param maxDigits 行列（二次元配列）の全要素の最大桁数
	 */
	private static void matrixDisplay(int[][] matrixArray, int maxDigits) {
		//行列の行のループ
		for (int rowIterator = 0; rowIterator < matrixArray.length; rowIterator++) {
			//行列の列のループ
			for (int columnIterator = 0; columnIterator < matrixArray[rowIterator].length; columnIterator++) {
				//最大桁数で処理中のインデックスの要素値を表示する
				System.out.printf("%" + maxDigits +"d ", matrixArray[rowIterator][columnIterator]);
			}
			//1行処理したら改行
			System.out.println("");
		}
		
	}
}
