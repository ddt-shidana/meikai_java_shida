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
		Scanner stdIn = new Scanner(System.in);
		//何のプログラムか画面表示
		System.out.println("1からnまでの和を求めます。");
		
		//nは自然数
		int nInt;
		//nの値を聞くかたまり
		do {
			//nの値入力ナビ
			System.out.print("nの値：");
			//キーボードからの入力値を受け取る
			nInt = stdIn.nextInt();
		//0以下は聞き直す
		} while (nInt <= 0);

		//合計値
		int sum = 0;
		//1からnまで
		for (int i = 1; i <= nInt; i++) {
			//加算していく
			sum += i;
		}
		
		//結果を画面表示
		System.out.println("1から" + nInt + "までの和は" + sum + "です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}