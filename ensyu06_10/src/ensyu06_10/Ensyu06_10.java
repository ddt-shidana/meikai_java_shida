package ensyu06_10;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-10 p199<br>
 * 	連続する要素が同じ値をもつことのないように6-9のプログラムを改良したプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_10 {

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
			//要素数、入力値をセット
			int elementCount = standardInput.nextInt();
			//int型の配列
			int[] ints = new int[elementCount];

			//ints[0]の値を決めておく（配列の全要素の値に1～10の乱数を格納）
			ints[0] = 1 + rand.nextInt(10);
			
			for (int equalCheckIterator = 1; equalCheckIterator < elementCount; equalCheckIterator++) {
				//1つ前の要素と同じ値になってしまったら、異なる値になるまで繰り返す
				do {
					//1～10の乱数を要素値に設定
					ints[equalCheckIterator] = 1 + rand.nextInt(10);
				} while (ints[equalCheckIterator - 1] == ints[equalCheckIterator]);
			}

			//配列aの全要素の値を表示
			System.out.print("配列の全要素の値\n{ ");
			for (int intNumber : ints) {
				System.out.print(intNumber + " ");
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
