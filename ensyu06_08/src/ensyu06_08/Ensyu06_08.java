package ensyu06_08;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-8 p197<br>
 * 	double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。
 * 	要素数と全要素の値はキーボードから読み込むこと。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_08 {

	public static void main(String[] args) {

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//配列を用意し、その要素数を入力値から取得する
			System.out.print("要素数：");
			//要素数を入力値から設定
			int elementInt = standardInput.nextInt();
			//double型の値の配列
			double[] doubles = new double[elementInt];

			//要素数分繰り返す
			for (int setNumberIterator = 0; setNumberIterator < elementInt; setNumberIterator++) {
				//何番目の値か
				System.out.print((setNumberIterator + 1) + "番目の値：");
				//配列の各要素に入力値を格納する
				doubles[setNumberIterator] = standardInput.nextDouble();
			}

			//合計値
			double sumDouble = 0;
			//要素数分繰り返す
			for (double doubleNumber : doubles) {
				//double型の値を足していく
				sumDouble += doubleNumber;
			}
			//合計値の表示
			System.out.println("全要素の合計値は" + sumDouble + "です。");

			//平均を求めて表示
			System.out.print("全要素の平均値は");
			System.out.printf("%.2f", sumDouble / elementInt);
			System.out.println("です。");

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