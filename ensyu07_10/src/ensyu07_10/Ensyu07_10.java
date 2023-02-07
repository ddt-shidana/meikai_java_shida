package ensyu07_10;

//乱数取得するための準備
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-10 p235<br>
 * 	List7-11を拡張して、以下の四つの問題をランダムに出題するプログラムを作成せよ。<br>
 *		x + y + z<br>
 *		x + y - z<br>
 *		x - y + z<br>
 *		x - y - z<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2023/01/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_10 {

	/** キーボードからの入力値を受けるメソッドを使うためのクラスインスタンス */
	private static Scanner stdIn = new Scanner (System.in);

	/** 乱数生成するメソッドを使うためのクラスインスタンス */
	private static 	Random rand = new Random();

	/**
	 * 4種類の問題をランダムに出題する。
	 *	0～3の乱数を生成し、返却値を以下のスイッチで取得
	 *		0： x + y + z
	 *		1： x + y - z
	 *		2： x - y + z
	 *		3： x - y - z
	 */
	static void randomQuestion() {
		do {
			//暗算問題で足し合わせる3桁の整数を3種類、ランダム生成する
			int x = ramdomThreeDigits();
			int y = ramdomThreeDigits();
			int z = ramdomThreeDigits();

			//暗算問題の答え
			int randomQuestionInt = 0;
			//回答者の回答
			int answerInt = 0;
			//4種類の暗算問題の問題番号
			int randomQuestionNumber = rand.nextInt(3);

			//4種類の各暗算問題で分岐
			switch (randomQuestionNumber) {
			
			//0： x + y + z
			case 0:
				do {
					System.out.print(x + " + " + y + " + " + z + " = ");
					answerInt = stdIn.nextInt();
					randomQuestionInt = (x + y + z);
					isIncorrectAnswer(answerInt, randomQuestionInt);
				} while (answerInt != randomQuestionInt);
			break;
			
			//1： x + y - z
			case 1:
				do {
					System.out.print(x + " + " + y + " - " + z + " = ");
					answerInt = stdIn.nextInt();
					randomQuestionInt = x + y - z;
					isIncorrectAnswer(answerInt, randomQuestionInt);
				} while (answerInt != randomQuestionInt);
			break;
			
			//2： x - y + z
			case 2:
				do {
					System.out.print(x + " - " + y + " + " + z + " = ");
					answerInt = stdIn.nextInt();
					randomQuestionInt = x - y + z;
					isIncorrectAnswer(answerInt, randomQuestionInt);
				} while (answerInt != randomQuestionInt);
			break;
			
			//3： x - y - z
			case 3:
				do {
					System.out.print(x + " - " + y + " - " + z + " = ");
					answerInt = stdIn.nextInt();
					randomQuestionInt = x - y - z;
					isIncorrectAnswer(answerInt, randomQuestionInt);
				} while (answerInt != randomQuestionInt);
			break;
			
			}
		
		//暗算トレーニングを続行するかどうか
		} while (confirmRetry());
	}
	
	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("暗算力トレーニング2!!!");
		//見やすくするために改行
		System.out.println("");
		//ランダムに4つの暗算問題を出題
		randomQuestion();

	}

	/**
	 * 回答が不正解かどうかを判定する。<br>
	 * 不正解だった場合メッセージを表示する。
	 * 
	 * @param inputAnser 入力した値
	 * @param randQAnswer 正解の値
	 * @return 回答が不正解の時true
	 */
	private static boolean isIncorrectAnswer(int inputAnser, int randQAnswer) {
		if (inputAnser != randQAnswer) {
			System.out.println("違いますよ！！");
		}

		return (inputAnser != randQAnswer);
	}

	/**
	 * 3桁の整数をランダム生成する
	 * 
	 * @return rand3New 3桁の整数
	 */
	private static int ramdomThreeDigits() {
		int ramdomThreeDigits = rand.nextInt(900) + 100;
		return ramdomThreeDigits;
	}

	/**
	 * 続行の確認を行う。
	 * 入力値が1のとき繰り返す、0のとき終了。
	 * 
	 * @return true or false 続行するかしないか
	 */
	private static boolean confirmRetry() {
		int retryNum;
		do {
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			retryNum = stdIn.nextInt();
		} while (retryNum < 0 || retryNum > 1);
		//改行
		System.out.println();
		return retryNum == 1;
	}
}
