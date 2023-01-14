package ensyu07_09;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-9 p235<br>
 * 	「正の整数値：」と表示して
 * 	キーボードから正の整数値を読み込んで、
 * 	その値を返却するメソッドreadPlusIntを作成せよ。
 * 	0や負の値が入力されたら再入力させること。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2023/01/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_09 {

	/**	Scannerクラスのインスタンス */
	private static Scanner stdIn = new Scanner (System.in);

	
	/**
	 * mainメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		//プログラム開始メッセージ
		System.out.println("readPlusIntの返却値を表示します。");

		do {
			System.out.println("\t返却値：" + readPlusInt());
			
		//続行の確認
		} while (confirmRetry());

	}
	
	/**
	 * 「正の整数値：」と表示して、キーボードから正の整数値を読み込む。<br>
	 * 0や負の値が入力されたら再入力させる。
	 * @return readPlusInt 読み込んだ正の整数値の値
	 */
	private static int readPlusInt() {
		int readPlusInt;
		do {
			System.out.print("正の整数値：");
			readPlusInt = stdIn.nextInt();
			//入力値が0以下のとき
			if (readPlusInt <= 0) {
				//エラーのガイドメッセージ
				System.out.println("1以上を入力してください。\n");
			}
			//0や負の値が入力されたら再入力させる
		} while (readPlusInt <= 0);
		
		return readPlusInt;
	}
	
	/**
	 * 続行の確認を行う。
	 * 入力値が1のとき繰り返す、0のとき終了。
	 * 
	 * @return true or false 続行するかしないか
	 */
	private static boolean confirmRetry() {
		int retryNum;
		do {
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			retryNum = stdIn.nextInt();
		} while (retryNum < 0 || retryNum > 1);
		//改行
		System.out.println();
		return retryNum == 1;
	}

}
