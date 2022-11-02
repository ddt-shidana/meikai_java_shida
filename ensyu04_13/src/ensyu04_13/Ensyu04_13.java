package ensyu04_13;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-13 p121<br>
 * 	1からnまでの和をを求めるList4-10をfor文で実現せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_13 {

	public static void main(String[] args) {
		
		//Scannerクラスのインスタンスを生成
		Scanner standardInput = new Scanner(System.in);
		//何のプログラムか画面表示
		System.out.println("1からnまでの和を求めます。");
		
		//naturalNumberは自然数
		int naturalNumber;
		//nの値を聞くかたまり
		do {
			//naturalNumberの値入力ナビ
			System.out.print("nの値：");
			//キーボードからの入力値を受け取る
			naturalNumber = standardInput.nextInt();
			
		//0以下は聞き直す
		} while (naturalNumber <= 0);

		//合計値
		int sumInt = 0;
		//1からnまで
		for (int sumIndex = 1; sumIndex <= naturalNumber; sumIndex++) {
			//加算していく
			sumInt += sumIndex;
		}
		
		//結果を画面表示
		System.out.println("1から" + naturalNumber + "までの和は" + sumInt + "です。");

		//newされているので、scannerのインスタンス(standardInput)をクローズ
		standardInput.close();

	}
}