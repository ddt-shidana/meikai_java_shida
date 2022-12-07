package ensyu06_06;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-6 p191<br>
 * 	テストの点数の合計点、平均点、最高点、最低点を表示するプログラムを作成せよ。
 * 	人数と点数はキーボードから読み込むこと。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_06 {

	public static void main(String[] args) {

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//人数を聞く
			System.out.print("何人の点数を入力しますか？：");
			//人数を入力値から設定
			int peopleNumber = standardInput.nextInt();
			//人数分の得点を配列で用意
			int[] scores = new int[peopleNumber];

			//人数分繰り返す
			for (int i = 0; i <= peopleNumber-1; i++) {
				//何人目の点数か
				System.out.print((i + 1) + "人目の点数：");
				// i+1 人目の点数を入力値から設定
				scores[i] = standardInput.nextInt();
			}

			//合計を表す変数sumを用意し、初期値0としておく
			int sumScore = 0;
			
			//人数分繰り返す
			for (int score : scores) {
				//点数を足してゆく
				sumScore += score;
			}
			
			//合計点を表示
			System.out.print("合計点は ");
			System.out.printf("%3d", sumScore);
			System.out.println("\tです。");

			//平均点を表示
			System.out.print("平均点は ");
			System.out.printf("%3.2f", (double)sumScore / scores.length);
			System.out.println("\tです。");

			//最高点、scores[0]を初期値に設定する
			int maxScore = scores[0];
			//人数分繰り返す
			for (int score : scores) {
				//現在設定されている maxScore より点数が高かったら
				if (maxScore < score) {
					//最高点をいれかえる
					maxScore = score;
				}
			}
			//最高点の表示
			System.out.print("最高点は ");
			System.out.printf("%3d", maxScore);
			System.out.println("\tです。");

			//最低点、scores[0]を初期値に設定する
			int minScore = scores[0];

			//人数分繰り返す
			for (int score : scores) {
				//現在設定されている maxScore より点数が低かったら
				if (minScore > score) {
					//最低点をいれかえる
					minScore = score;
				}
			}
			//最低点を表示する
			System.out.print("最低点は ");
			System.out.printf("%3d", minScore);
			System.out.println("\tです。");

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNum = standardInput.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		//retryNum が1の間繰り返す
		} while (retryNum == 1);


		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}
