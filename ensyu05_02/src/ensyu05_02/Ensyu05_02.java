package ensyu05_02;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習5-2 p153<br>
 * 	float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu05_02 {

	public static void main(String[] args) {

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNumber;

		//retryNumが1のとき繰り返す
		do {
			//整数を入力してもらう
			System.out.print("整数a：");
			//入力値をaに格納
			float inputFloat = standardInput.nextFloat();

			//整数を入力してもらう
			System.out.print("整数b：");
			//入力値をbに格納
			double inputDouble = standardInput.nextDouble();

			System.out.println("a = " + inputFloat );
			System.out.println("b = " + inputDouble );

			//retryNumを決めるかたまり
			do {
				//もう一度プログラムを実行するか聞く
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				//入力値を変数にいれる
				retryNumber = standardInput.nextInt();
			//retryNumは0か1
			} while (retryNumber < 0 || retryNumber > 1);
		//retryNumが1の間繰り返す
		} while (retryNumber == 1);

		//プログラムの終了を告げる
		System.out.println("プログラムを終了しました");

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}