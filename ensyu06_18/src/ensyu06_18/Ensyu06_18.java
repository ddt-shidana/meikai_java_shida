package ensyu06_18;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-18 p215<br>
 * 	行数・各行の列数・各要素の値をキーボードから読み込むようにlist6-18を書き換えたプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_18 {

	public static void main(String[] args) {

		//プログラム開始メッセージ
		System.out.println("二次元配列を作成します。");

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//配列cを用意
		int[][] cArray;

		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {

			//配列の行数を決める
			System.out.print("行数：");
			int lineNum = standardInput.nextInt();
			cArray = new int[lineNum][];

			//配列の列数を決める
			int colNum;
			for (int lineItr = 0; lineItr < lineNum; lineItr++) {
				System.out.print((lineItr + 1) + "行目の列数：");
				colNum = standardInput.nextInt();
				cArray[lineItr] = new int[colNum];
				//要素の値を入力してもらう
				System.out.println("要素の値を入力してください。");
				for (int colItr = 0; colItr < colNum; colItr++) {
					System.out.print("\t" + (lineItr + 1) + "行"
											+ (colItr + 1) + "列目の値：");
					//入力値を取得
					int elementValue = standardInput.nextInt();
					//取得した入力値を、配列に格納
					cArray[lineItr][colItr] = elementValue;
				}
			}

			//配列cを表示
			for (int i = 0; i < cArray.length; i++) {
				for (int j = 0; j < cArray[i].length; j++) {
					System.out.printf("%3d", cArray[i][j]);
				}
				System.out.println();
			}

			//retryNumは0か1
			do {
				System.out.print("もう一度？ YES・・・1/NO・・・0：");
				retryNum = standardInput.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}