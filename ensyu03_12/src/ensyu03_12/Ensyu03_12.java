package ensyu03_12;

//入力値取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習3-12 p73<br>
 * 	キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_12 {

	public static void main(String[] args) {

		//stdInに入力値を取得
		Scanner stdIn = new Scanner (System.in);

		//「整数値を3つ入力してください」と画面表示させる
		System.out.println("整数値を3つ入力してください。");
		//z1はキーボードからの入力値1つ目
		int z1 = stdIn.nextInt();
		//z2はキーボードからの入力値2つ目
		int z2 = stdIn.nextInt();
		//z3はキーボードからの入力値3つ目
		int z3 = stdIn.nextInt();

		//3つの整数値から最小値を求める
		//z1を最小値minに初期設定
		int min = z1;
		
		//現在のminよりz2が小さいならば、minにz2を代入
		if (z2 < min) {
			min = z2;
		}
		
		//現在のminよりz3が小さいならば、minにz3を代入
		if (z3 < min) {
			min = z3;
		}
		
		//「3つの整数値の最小値は minです。」と画面表示させる
		System.out.println("3つの整数値の最小値は" + min + "です。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
