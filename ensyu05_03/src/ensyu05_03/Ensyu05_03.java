package ensyu05_03;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習5-3 p157<br>
 * 	論理型の変数にtrueやfalseを代入して、その値を表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu05_03 {

	public static void main(String[] args) {

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNumber;

		boolean trueOrFalse;

		//繰り返しをするかたまり
		do {
				//プログラム開始のメッセージを表示させる
				System.out.println("true/falseを選択してください。");
				//TRUEかFALSEかを選択してもらう
				System.out.print("true/false:");
				//boolean型の変数trueOrFalseに入力値を代入
				trueOrFalse = standardInput.nextBoolean();
			//代入した値を表示する
			System.out.println(trueOrFalse);

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNumber = standardInput.nextInt();
			} while (retryNumber < 0 || retryNumber > 1);

		//retryNumが1のとき繰り返す
		} while (retryNumber == 1);

		//プログラムの終了を告げる
		System.out.println("プログラムを終了しました");

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}