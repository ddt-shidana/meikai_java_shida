package ensyu04_11;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-11 p121<br>
 * 	正の整数値を0までカウントするList4-4をfor文で実現せよ。。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/11/02<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_11 {

	public static void main(String[] args) {
		
		//Scannerクラスのインスタンス
		Scanner standardInput = new Scanner(System.in);
		
		//カウントダウンのアナウンス
		System.out.println("カウントダウンします。");
		
		//正の整数値
		int positiveInteger = 0;
		
		//正の整数値が入力されるまで繰り返す
		do {
			//正の整数値入力メッセージ
			System.out.print("正の整数値：");
			//キーボードからの入力値を受け取る
			positiveInteger = standardInput.nextInt();
		
		//0以下は聞き直す
		} while (positiveInteger <= 0);
		
		//positiveIntegerを0になるまで
		for (int countIndex = positiveInteger; countIndex >= 0; countIndex--) {
			//1ずつ減らして表示
			System.out.println(countIndex);
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		standardInput.close();

	}
}