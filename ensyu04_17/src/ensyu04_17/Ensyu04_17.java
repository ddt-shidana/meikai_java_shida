package ensyu04_17;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-17 p121<br>
 * 	読み込んだ整数値のすべての約数を表示するList4-13を書き換えて、
 *  5個表示するごとに改行するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_17 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		//2以上の整数値
		int nInt;
		//整数値を聞くかたまり
		do {
			System.out.print("整数値：");
			nInt = stdIn.nextInt();
		//1より小さい場合意味がないので聞き直す
		} while (nInt < 1);
		
		//約数の数
		int count = 0;
		//1からnIntまで順番に
		for (int i = 1; i <= nInt; i++) {
			//nIntを割って、割り切れたら
			if (nInt % i == 0) {
				//割る数は約数なので画面表示
				System.out.print(" " + i);
				//約数カウントを増やす
				count++;
				
				//5回繰り返すごとに
				if (count % 5 == 0) {
					//改行
					System.out.println();
				}
			}
		}
		
		//最後に約数の数を表示する
		System.out.println("\n約数は" + count + "個です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}