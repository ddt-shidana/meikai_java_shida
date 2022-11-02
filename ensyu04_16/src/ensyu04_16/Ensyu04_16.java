package ensyu04_16;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-16 p121<br>
 * 	読み込んだ個数だけ*を表示するList4-11を書きかえて、
 * 5個表示するごとに改行するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_16 {

	public static void main(String[] args) {
		
		Scanner standardInput = new Scanner(System.in);
		
		//*を何個表示するか
		int printNumber = 0;
		
		//何個表示するかを聞くかたまり
		do {
			//何個表示するかを聞くナビ
			System.out.print("何個*を表示しますか？：");
			//キーボードからの入力値を取得
			printNumber = standardInput.nextInt();
			
		//0以下だったら聞き直す
		} while (printNumber <= 0);
		
		//1からprintNumberまで繰り返す
		for (int printIndex = 1; printIndex <= printNumber; printIndex++) {
			
			//アスタリスク表示
			System.out.print('*');
			
			//5の倍数個表示するごと
			if (printIndex % 5 == 0) {
				//改行
				System.out.println();
			}
		}
		
		//newされているので、scannerのインスタンス(stdIn)をクローズ
		standardInput.close();

	}
}