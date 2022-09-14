package ensyu03_01;

//乱数取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習3-1 p59<br>
 * 	整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_01 {

	public static void main(String[] args) {

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//整数値を入力値から取得するナビゲーション
		System.out.println ("整数値:");
		//zIntはキーボードからの入力値
		int zInt = stdIn.nextInt();

		//zIntが0未満か、0以上で条件分岐
		//zIntが0未満のとき
		if (zInt < 0) {
			//zIntに-1をかけたものが絶対値
			System.out.println("その絶対値は" + (-zInt) + "です。");
		}
		//zIntが0以上のとき
		else {
			//zIntそのままのものが絶対値
			System.out.println("その絶対値は" + zInt + "です。");
		}

		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
