package ensyu05_05;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu05_05 {

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習5-5 p163<br>
 * 	三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 * 	平均はキャスト演算子を利用して求め、実数として表示すること。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
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
				int z1 = standardInput.nextInt();
				System.out.print("整数b：");
				int z2 = standardInput.nextInt();
				System.out.print("整数c：");
				int z3 = standardInput.nextInt();

				//合計値を表示
				System.out.println("合計値は " + (z1 + z2 + z3) + " です。");
				//平均値を実数値で表示
				System.out.println("平均値は " + (double) (z1 + z2 + z3) / 3 + " です。");

			//retryNumを決めるかたまり
			do {
				//もう一度行うか聞く
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				//入力値を変数に入力
				retryNumber = standardInput.nextInt();
			//retryNumは0か1
			} while (retryNumber < 0 || retryNumber > 1);
		
		//retryNumが1のとき繰り返す
		} while (retryNumber == 1);

		//プログラムの終了を告げる
		System.out.println("プログラムを終了しました");

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}