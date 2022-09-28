package ensyu04_14;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-14 p121<br>
 * 	演習4-13を書きかえて、右のように式を表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_14 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		//足す最後の自然数
		int nMax;
		//nの値を聞くかたまり
		do {
			//nの値入力ナビ
			System.out.print("nの値：");
			//キーボードからの入力値を受け取る
			nMax = stdIn.nextInt();
		//0以下は聞き直す
		} while (nMax <= 0);
		
		//合計値
		int sum = 0;
		//1からnMaxまで繰り返す
		for (int i = 1; i <= nMax; i++) {
			
			//順番に足していく
			sum += i;
			//足した数を表示
			System.out.print(i);
			//最後に足す数だった場合、=を、それ以外は+を表示
			System.out.print(i == nMax ? " = " : " + ");
		}
		
		//足し合わせた結果を表示
		System.out.println(sum);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}