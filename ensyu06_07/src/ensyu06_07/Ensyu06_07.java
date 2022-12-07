package ensyu06_07;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-7 p195<br>
 * 	list6-9は探索するキー値と同じ値の要素が複数個存在する場合、
 * 	最も先頭に位置する要素を見つけるプログラムである。
 * 	最も末尾側に位置する要素を見つけるプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_07 {
//クラスの内容ここから

	public static void main(String[] args) {

		//randに乱数を初期設定
		Random rand = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//配列の要素数を決める
			System.out.print("要素数：");
			//要素数;
			int elementInt = standardInput.nextInt();
			//乱数の配列
			int[] randomInts = new int[elementInt];

			//要素数分繰り返す
			for (int i = 0; i < elementInt; i++) {
				//配列の全要素の値に1～10の乱数を格納
				randomInts[i] = 1 + rand.nextInt(10);
			}

			//配列の全要素の値を表示
			System.out.print("配列の全要素の値\n{ ");
			//要素数分繰り返す
			for (int randomInt : randomInts) {
				//要素値を表示する
				System.out.print(randomInt + " ");
			}
			System.out.println("}");

			//探す数値を決める
			System.out.print("探す数値：");
			//探索値、入力値から設定
			int keyInt = standardInput.nextInt();

			//発見したインデックス
			int serchItrator;
			//末尾から探索、要素数分繰り返す
			for (serchItrator = elementInt - 1; serchItrator >= 0; serchItrator--) {
				//探索値が要素値にあったら
				if (randomInts[serchItrator] == keyInt)
					//for分を抜ける
					break;
			}

			//末尾までに見つかった場合
			if (serchItrator >= 0) {
				//発見したインデックスを表示
				System.out.println("それはrandomInts[" + serchItrator + "]にあります。");
			}
			//末尾までに見つからなかった場合
			else {
				//なかったことを表示
				System.out.println("それはありません");
			}
			
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