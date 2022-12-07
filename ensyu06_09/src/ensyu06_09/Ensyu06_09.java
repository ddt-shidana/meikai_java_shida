package ensyu06_09;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-9 p199<br>
 * 	要素型がint型である配列を作り、全要素を1〜10の乱数で埋め尽くす（1以上10以下の値を代入する）
 * 	プログラムを作成せよ。要素数はキーボードから読み込むこと。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_09 {

	public static void main(String[] args) {

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//要素数を決める
			System.out.print("要素数：");
			//要素数、入力値を設定
			int elementNumber = standardInput.nextInt();
			//int型の乱数の配列
			int[] randomInts = new int[elementNumber];

			//要素数分繰り返す
			for (int i = 0; i < elementNumber; i++) {
				//配列の全要素の値に1～10の乱数を格納
				randomInts[i] = 1 + rand.nextInt(10);
			}

			//配列randomIntsの全要素の値を表示
			System.out.print("配列randomIntsの全要素の値\n{ ");
			//要素数分繰り返す
			for (int randomInt : randomInts) {
				//要素値を表示する
				System.out.print(randomInt + " ");
			}
			System.out.println("}");

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNum = standardInput.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}