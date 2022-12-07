package ensyu06_05;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-5 p189<br>
 * 	配列の要素数と、個々の要素の値を読み込んで、
 * 	各要素の値を表示するプログラムを作成せよ。
 * 	表示の形式は、初期化子を同じ形式、
 * 	すなわち、各要素の値をコンマで区切って{}で囲んだ形式とすること。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_05 {

	public static void main(String[] args) {

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//要素数を聞く
			System.out.print("要素数：");
			//要素数を入力値から決定
			int elementCount = standardInput.nextInt();
			//int型の配列を、入力した数の要素数で作成
			int[] ints = new int[elementCount];

			//配列の各要素の値を入力値から読み込む
			for (int elementItrator = 0; elementItrator <= elementCount-1; elementItrator++) {
				//配列の要素値を入力してもらう
				System.out.print("ints[" + elementItrator + "] = ");
				//入力値を配列に格納
				ints[elementItrator] = standardInput.nextInt();
			}

			//各要素の値を表示
			System.out.print("a = {");
			//要素数分繰り返す
			for (int i = 0; i <= elementCount - 1; i++) {
				//要素値を表示
				System.out.print(ints[i]);
				//最後の表示でなければ
				if(i < elementCount - 1) {
					// , で区切る
					System.out.print(", ");
				}
			}
			//各要素の値の表示を終了
			System.out.println("}");

		//retryNumは0か1
		do {
			System.out.println("もう一度？ YES・・・1/NO・・・0");
			retryNum = standardInput.nextInt();
		} while (retryNum < 0 || retryNum > 1);

	//retryNumが1の時くりかえす
	} while (retryNum == 1);


		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}
