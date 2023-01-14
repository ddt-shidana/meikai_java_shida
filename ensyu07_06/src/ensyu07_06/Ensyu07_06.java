package ensyu07_06;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-6 p235<br>
 * 	引数mで指定された月の季節を表示するメソッドprintSeasonを作成せよ。
 * 	mが	3,4,5であれば「春」、
 * 		6,7,8であれば「夏」、
 * 		9,10,11であれば「秋」、
 * 		12,1,2であれば「冬」と表示し、
 * 		それ以外であれば何も表示しないこと。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2023/01/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_06 {

	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		
		//プログラム開始メッセージ
		System.out.println("入力月の季節を表示するプログラムです。");

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//monthを入力してもらう
			System.out.print("\n何月ですか？：");
			//変数monthに入力値を取得
			int month = stdIn.nextInt();

			//sumUpメソッドを呼出して、総和をメッセージ表示
			System.out.println("\t" + month + "月の季節：" + printSeason(month));

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
	 * 引数mで指定された月の季節を表示する
	 * 	m=3,4,5であれば「春」
	 * 	m=6,7,8であれば「夏」
	 * 	m=9,10,11であれば「秋」
	 * 	m=12,1,2であれば「冬」
	 * 	m=それ以外であれば何も表示しない
	 * 
	 * @param m 月
	 * @return printSeason 表示する季節
	 */
	private static String printSeason(int m) {
		String printSeason = "";
		switch (m) {
			case 3:
			case 4:
			case 5: printSeason = "春";		break;
			case 6:
			case 7:
			case 8: printSeason = "夏";		break;
			case 9:
			case 10:
			case 11: printSeason = "秋";	break;
			case 12:
			case 1:
			case 2: printSeason = "冬";		break;
		}
		return printSeason;
	}

}
