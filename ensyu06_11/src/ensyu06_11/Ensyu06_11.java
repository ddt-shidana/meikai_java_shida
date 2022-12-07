package ensyu06_11;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-11 p199<br>
 * 	異なる要素が同じ値をもつことのないように6-9のプログラムを改良したプログラムを作成せよ。
 * 	配列の要素数は10以下とする。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_11 {

	public static void main(String[] args) {

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {

			//配列の要素数
			int elementCount;
			//int型配列
			int[] ints;

			//0以下、11以上の値が入力されたら聞き直す
			do {
				//要素数を聞く
				System.out.print("要素数(1～10)：");
				//要素数（1～10）、入力値をセット
				elementCount = standardInput.nextInt();
				//要素数で配列を生成
				ints = new int[elementCount];
			//0以下、11以上の値の間繰り返す
			} while (elementCount <= 0 || elementCount > 10);

			//配列のインデックス0番目の要素の値に1～10の乱数を格納
			ints[0]= 1 + rand.nextInt(10);

			//1～10の乱数を配列に格納するラベル
			Outer:
			//インデックス1以降の要素を繰り返し処理
			for (int setIntsIterator = 1; setIntsIterator < elementCount; setIntsIterator++) {
				//1～10の乱数を配列に格納
				ints[setIntsIterator] = 1 + rand.nextInt(10);

				//今まで確定した要素をインデックス0から確認する
				for (int previousSetindex = 0; previousSetindex < setIntsIterator; previousSetindex++) {
					//前までに格納した値と同じ場合
					if (ints[setIntsIterator] == ints[previousSetindex]) {
						//setIntsIteratorを戻して
						--setIntsIterator;
						//やりなおし
						continue Outer;
					}
				}
			}

			//配列の全要素の値を表示
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
