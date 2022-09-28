package ensyu04_07;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-7 p109<br>
 * 	読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
 * 	表示は*と+を交互に行うこと。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_07 {
	
	public static void main(String[] args) {
		
		//キーボードからの入力値を取得
		Scanner stdIn = new Scanner(System.in);
		
		//アスタリスクを表示する数
		int nInt;
		
		do {
			System.out.print("何個表示しますか：");
			nInt = stdIn.nextInt();
		} while (nInt < 1);
		
		//アスタリスクとプラスを1セットとして、index回表示するカウンター
		int counter = 0;
		//counterは0～nInt-1までカウントする
		while (counter < nInt) {
			//counterが偶数の時*、奇数の時+
			System.out.print(counter % 2 == 0 ? "*" : "+");
			//counterを増やす
			counter++;
		}

		//scannerのインスタンスを破棄
		stdIn.close();

	}
}