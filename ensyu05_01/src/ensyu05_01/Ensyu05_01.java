package ensyu05_01;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習5-1 p149<br>
 * 	10進数を読み込んで、その値を８進数と16進数で表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu05_01 {

	public static void main(String[] args) {

		//プログラム開始のメッセージを表示させる
		System.out.println("10進整数を8進数と16進数で表示します。");

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNumber;

		//retryNumが1のとき繰り返す
		do {
			//10進整数を入力してもらう
			System.out.print("整数：");
			//入力値をaに格納
			int inputInt = standardInput.nextInt();

			//入力した10進数を8進数で表示する
			System.out.printf(" 8進数では%6o です。\n", inputInt);
			//入力した10進数を16進数で表示する
			System.out.printf("16進数では%6x です。\n", inputInt);

			//もう一度プログラムを行うかを聞く
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				//入力値を変数に格納
				retryNumber = standardInput.nextInt();
			//retryNumは0か1
			} while (retryNumber < 0 || retryNumber > 1);
		
		//retryNumが1の間、プログラムを実行し続ける
		} while (retryNumber == 1);

		//プログラムの終了を告げる
		System.out.println("プログラムを終了しました");

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}