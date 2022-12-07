package ensyu06_14;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-14 p205<br>
 * 	月を1〜12の数値として表示して、その英語表現を入力させるプログラムを作成せよ。
 * 		・出題する月の値は乱数で生成する。
 * 		・学習者が望む限り、何度でも繰り返せる。
 * 		・同一月を連続して出題しない。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_14 {
	
	/** 1月から12月の英語の月名の配列 */
	private final static String[] MONTHS = {
			"January", "February", "March", "April", "May", "June", "July",
			"Auguest", "September", "October", "November", "December"};
	
	public static void main(String[] args) {

		//英単語学習プログラムスタートのメッセージを表示
		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//出題月インデックス（0～11）を生成する変数を用意
		int questionMonthIndex;
		//同一月を連続して出題しないため、前問題のmonthを控えておくための変数を用意、初期値12
		int beforeMonthIndex = 12;

		//retryNumが1のとき繰り返す
		do {
			
			do {
				//出題月インデックスをランダム取得（0～11）
				questionMonthIndex = rand.nextInt(12);
				//1問目の場合は
				if (beforeMonthIndex == 12) {
					//前の問題がないためループを抜ける
					break;
				}
			//同一月を連続して出題していたらdoくりかえす
			}while (beforeMonthIndex == questionMonthIndex);

			//monthPを更新
			beforeMonthIndex = questionMonthIndex;

			//回答月
			String answerMomth;

			do {
				//画面に出題表示
				System.out.print(questionMonthIndex + 1 + "月 ：");
				
				//回答月に入力文字列を設定
				answerMomth = standardInput.next();
				
				//不正解の時のメッセージ表示
				if (! (answerMomth.equals(MONTHS[questionMonthIndex]))) {
					System.out.println("不正解です。");
				}
				
			//不正解の場合、同じ問題を再度出題
			} while (! (answerMomth.equals(MONTHS[questionMonthIndex])));

			//正解の場合のメッセージ表示
			if (answerMomth.equals(MONTHS[questionMonthIndex])) {
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