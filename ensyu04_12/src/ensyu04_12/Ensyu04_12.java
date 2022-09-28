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
		Scanner stdIn = new Scanner(System.in);
		//カウントアップを宣言
		System.out.println("カウントアップします。");
		
		//正の整数値
		int zMax = 0;
		//正の整数値を聞く塊
		do {
			//正の整数値の入力ナビ
			System.out.print("正の整数値：");
			//キーボードからの入力値を受け取る
			zMax = stdIn.nextInt();
		//0以下だったら聞き直す
		} while (zMax <= 0);
		
		//0からzMaxまで
		for (int i = 0; i <= zMax; i++) {
			//1ずつ増やした値を画面表示
			System.out.println(i);
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}