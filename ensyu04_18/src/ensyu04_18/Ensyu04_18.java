package ensyu04_18;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-18 p121<br>
 * 	1からnまでの整数値の2乗値を表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_18 {

	public static void main(String[] args) {
		
		//Scannerのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		
		//整数値
		int nInt;
		//nの値を聞くかたまり
		do {
			//nの値入力ナビ
			System.out.print("nの値：");
			//キーボードからの入力値を取得
			nInt = stdIn.nextInt();
		//1以下は意味ないので、2以上の整数値
		} while (nInt < 1);
		
		//1からnIntまで繰り返す
		for (int i = 1; i <= nInt; i++) {
			//2乗の値を表示
			System.out.println(i + "の2乗は" + (i * i));
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}