package ensyu05_04;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習5-4 p161<br>
 * 	三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 * 	平均は実数として表示すること。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu05_04 {

	public static void main(String[] args) {

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNumber;

		//retryNumが1のとき繰り返す
		do {
				//プログラム開始のメッセージを表示させる
				System.out.println("3つの整数値の合計と平均を計算し、実数値で表示します。");
				//整数値を格納する変数z1,z2,z3を用意し、入力値を初期設定
				System.out.print("整数a：");
				int fistInt = standardInput.nextInt();
				System.out.print("整数b：");
				int secoundInt = standardInput.nextInt();
				System.out.print("整数c：");
				int thirdInt = standardInput.nextInt();

				//合計値を表示
				System.out.println("合計値は " + (fistInt + secoundInt + thirdInt) + " です。");
				//平均値を表示
				System.out.println("平均値は " + (fistInt + secoundInt + thirdInt) / 3.0 + " です。");

			//もう一度行うか聞くかたまり
			do {
				//もう一度行うか聞く
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				//入力値を変数に格納
				retryNumber = standardInput.nextInt();
			//retryNumは0か1
			} while (retryNumber < 0 || retryNumber > 1);
		//retryNumが1の時繰り返す
		} while (retryNumber == 1);

		//プログラムの終了を告げる
		System.out.println("プログラムを終了しました");

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}