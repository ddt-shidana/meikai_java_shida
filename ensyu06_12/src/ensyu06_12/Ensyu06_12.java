package ensyu06_12;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-12 p199<br>
 * 	配列の要素の並びをシャッフルする（ランダムな順と、なるようにかき混ぜる）プログラムを作成せよ。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_12 {

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

			//要素数分繰り返す
			for (int randomSetIterator = 0; randomSetIterator < elementCount; randomSetIterator++) {
				//配列の全要素の値に1～100の乱数を格納
				ints[randomSetIterator] = 1 + rand.nextInt(100);
			}

			//配列の全要素の値を表示
			System.out.print("配列の全要素の値\n{ ");
			//要素数分繰り返す
			for (int intNumber : ints) {
				//要素値を表示
				System.out.print(intNumber + " ");
			}
			System.out.println("}");

			//配列の全要素の値をシャッフル表示する
			//前から順番にランダムなインデックスの要素数と入れ替える
			for (int intNumber : ints) {

				//いれかえるランダムな要素のインデックスに 0 ～ (elementCount-1) の乱数をセット
				int displayRandomIndex = rand.nextInt(elementCount);
				//いれかえるため退避させるための仮変数に、要素値をセット
				int shuffleTempInt = intNumber;
				//ランダムなインデックスの要素値といれかえる
				intNumber = ints[displayRandomIndex];
				ints[displayRandomIndex] = shuffleTempInt;
			}

			//シャッフルした配列の全要素を表示
			System.out.print("配列の全要素の値をシャッフルしました。\n{ ");
			//要素数分繰り返す
			for (int intNumber : ints) {
				//全要素を表示
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