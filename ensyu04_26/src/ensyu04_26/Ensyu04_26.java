package ensyu04_26;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-26 p129<br>
 * 	合計だけでなく平均も求めるようにList4-19のプログラムを書きかえよ。
 * 	なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/02<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_26 {

	public static void main(String[] args) {

		//standardInputにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//整数値の個数を格納する変数nを用意
			int quantityNumber;

			do {
				System.out.println("整数の合計値と平均値を求めます。");
				System.out.print("何個の整数値を使用しますか？：");
				//入力値を初期設定
				quantityNumber = standardInput.nextInt();
			

			//nは正の整数なので、0以下の場合聞き直す
			} while (quantityNumber < 1);

			//quantityNumber個の入力した整数値の合計値と平均値を求めます
			//合計値
			double sumDouble = 0;
			//平均値
			double averageDouble = 0;
			//加算する個数の格納する変数を用意し、初期値は1に設定
			int addCounter = 0;

			//負の数は加算から除外して、n個の整数を加算し、その平均を求める
			for (int i = 1; i <= quantityNumber; i++) {
				System.out.print("整数：");
				double addInteger = standardInput.nextDouble();

				if (addInteger < 0) {
					System.out.println("負の数は加算しません");
					continue;
				}
				sumDouble += addInteger;
				addCounter++;
				averageDouble = sumDouble / addCounter;
			}

			//合計値と平均値をメッセージで表示させる
			System.out.println("合計は" + sumDouble + "、平均は" + averageDouble + "です。");

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNum = standardInput.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//プログラムの終了を告げる
		System.out.println("合計・平均計算プログラムを終了しました。");

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}