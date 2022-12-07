package ensyu06_15;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-15 p205<br>
 * 	曜日を表示して。その英語表現を入力させるプログラムを作成せよ。
 * 		・出題する曜日は乱数で生成する。
 * 		・学習者が望む限り、何度でも繰り返せる。
 * 		・同一曜日を連続して出題しない。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_15 {
	
	/*
	 * 	曜日の日本語と英語を（インデックスで）対応するようにしている
	 *    曜日    英語    配列インデックス
	 * ・日曜日　sunday		0
	 * ・月曜日　monday		1
	 * ・火曜日　tuesday	2
	 * ・水曜日　wednesday	3
	 * ・木曜日　thursday	4
	 * ・金曜日　friday		5
	 * ・土曜日　saturday	6
	 */
	//曜日（日本語）
	final static String[] YOUBHIS = {"日", "月", "火", "水", "木", "金", "土"};
	//曜日（英語）
	final static String[] DAY_OF_WEEKS = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
	
	public static void main(String[] args) {

		//英単語学習プログラムスタートのメッセージを表示
		System.out.println("英語の曜日名を小文字で入力してください。");

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//問題の曜日インデックスを生成する変数を用意
		int questionDayOfWeekIndex;
		//前問題インデックスを控えておくための変数を用意
		int beforeDayOfWeekIndex = 7;

		//retryNumが1のとき繰り返す
		do {
			//問題の曜日をランダム取得
			do {
				questionDayOfWeekIndex = rand.nextInt(7);
				//1問目の場合は
				if (beforeDayOfWeekIndex == 7) {
					//設定したらこのまま抜ける
					break;
				}
			//前の出題月と被っていたら再度取得し直す
			}while (beforeDayOfWeekIndex == questionDayOfWeekIndex);

			//前問題インデックスを控えておく
			beforeDayOfWeekIndex = questionDayOfWeekIndex;

			//回答の文字列を格納する変数をあらかじめ用意しておく
			String answerDayOfWeek;

			//出題
			do {
				//画面に出題表示
				System.out.print(YOUBHIS[questionDayOfWeekIndex] + "曜日 ：");
				//回答を取得するための変数を用意し、入力文字列を設定
				answerDayOfWeek = standardInput.next();
				
				//不正解の時のメッセージ表示
				if (! (answerDayOfWeek.equals(DAY_OF_WEEKS[questionDayOfWeekIndex]))) {
					System.out.println("不正解です。");
				}
				
			//不正解の場合、同じ問題を再度出題
			} while (! (answerDayOfWeek.equals(DAY_OF_WEEKS[questionDayOfWeekIndex])));

			//正解の場合のメッセージ表示
			if (answerDayOfWeek.equals(DAY_OF_WEEKS[questionDayOfWeekIndex])) {
				System.out.print("正解です。");
			}

			//retryNumは0か1
			do {
				System.out.print("もう一度？ YES・・・1/NO・・・0：");
				retryNum = standardInput.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}