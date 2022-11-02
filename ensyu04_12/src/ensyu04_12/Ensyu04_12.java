package ensyu04_12;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-12 p121<br>
 * 	0から正の整数値までカウントアップするプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_12 {

	public static void main(String[] args) {
		
		//Scannerクラスのインスタンス生成
		Scanner standardInput = new Scanner(System.in);
		//カウントアップを宣言
		System.out.println("カウントアップします。");
		
		//正の整数値
		int positiveInteger = 0;
		
		//正の整数値を聞くかたまり
		do {
			//正の整数値の入力ナビ
			System.out.print("正の整数値：");
			//キーボードからの入力値を受け取る
			positiveInteger = standardInput.nextInt();
		//0以下だったら聞き直す
		} while (positiveInteger <= 0);
		
		//0からpositiveIntegerまで
		for (int countIndex = 0; countIndex <= positiveInteger; countIndex++) {
			//1ずつ増やした値を画面表示
			System.out.println(countIndex);
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		standardInput.close();

	}
}