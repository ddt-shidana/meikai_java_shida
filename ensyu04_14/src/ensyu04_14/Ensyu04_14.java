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
 * 修正日:2022/11/02<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_14 {

	public static void main(String[] args) {
		
		Scanner standardInput = new Scanner(System.in);
		
		//足す最後の自然数
		int naturalNumber;
		
		//nの値を聞くかたまり
		do {
			//nの値入力ナビ
			System.out.print("nの値：");
			//キーボードからの入力値を受け取る
			naturalNumber = standardInput.nextInt();
			
		//0以下は聞き直す
		} while (naturalNumber <= 0);
		
		//合計値
		int sumInt = 0;
		//1からnMaxまで繰り返す
		for (int sumIndex = 1; sumIndex <= naturalNumber; sumIndex++) {
			
			//順番に足していく
			sumInt += sumIndex;
			//足した数を表示
			System.out.print(sumIndex);
			//最後に足す数だった場合、=を、それ以外は+を表示
			System.out.print(sumIndex == naturalNumber ? " = " : " + ");
		}
		
		//足し合わせた結果を表示
		System.out.println(sumInt);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		standardInput.close();

	}
}