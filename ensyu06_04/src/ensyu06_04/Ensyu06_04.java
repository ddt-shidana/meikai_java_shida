package ensyu06_04;

//乱数の取得するために準備のimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-4 p187<br>
 * 	List6-5を書きかえて、縦向きの棒グラフで表示するプログラムを作成せよ。
 * 	最下段には、インデックスを10で割った剰余を表示すること。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_04 {
	
	public static void main(String[] args) {

		//randに乱数を初期設定
		Random randomInstance = new Random();

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNumber;

		//retryNumが1のとき繰り返す
		do {

			//配列の要素数を聞く
			System.out.print("要素数：");
			//入力値から配列の要素数を取得
			int arrayIndex = standardInput.nextInt();
			//配列を用意
			int[] intArray = new int[arrayIndex];

			//配列の全要素分ループ
			for (int inIndex = 0; inIndex < arrayIndex; inIndex++) {
				//配列の全要素の値に1～10の乱数を格納
				intArray[inIndex] = 1 + randomInstance.nextInt(10);
			}

			//配列arrayIndexの全要素中、取得したランダム数がMaxである値を求める
			int maxInt = intArray[0];
			//配列の全要素分ループ
			for (int searchMaxIndex = 1; searchMaxIndex < intArray.length; searchMaxIndex++) {
				//現在のmaxIntと比較対象の配列の要素を比べて、配列の要素のほうが大きかったら
				if (maxInt < intArray[searchMaxIndex])
					//配列の要素を最大値に設定
					maxInt = intArray[searchMaxIndex];
			}

			//配列の要素値を棒グラフで表示する
			//縦ループ（配列の要素値）
			for (int verticalIndex = maxInt; verticalIndex >= 1; verticalIndex--) {
				//横ループ（配列のインデックス）
				for (int besideIndex = 0; besideIndex <= arrayIndex - 1; besideIndex++) {
					//配列の要素数が、縦メモリより小さい時
					if (intArray[besideIndex] < verticalIndex) {
						//スペース
						System.out.print("   ");
					}else {
						//棒グラフを表すアスタリスク
						System.out.print("*  ");
					}
				}
				//改行
				System.out.println("");
			}
			//横線の表示
			for (int i = 0; i <= arrayIndex * 3 - 3; i++) {
				System.out.print('-');
			}
			
			//改行
			System.out.println("");
			
			//配列の要素数分ループ
			for (int i = 0; i <= arrayIndex - 1; i++) {
				//表の最下段にインデックスを10で割った剰余を表示
				System.out.print(i % 10 + "  ");
			}

			//改行
			System.out.println("");
			
			//retryNumberを決めるかたまり
			do {
				//もう一度行うか聞く
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				//retryNumberに入力値を設定
				retryNumber = standardInput.nextInt();
			//retryNumは0か1
			} while (retryNumber < 0 || retryNumber > 1);
	
		//retryNumberが1の時繰り返し
		} while (retryNumber == 1);

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}
