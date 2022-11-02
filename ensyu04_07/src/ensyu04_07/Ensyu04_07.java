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
		Scanner standardInput = new Scanner(System.in);
		
		//アスタリスクを表示する数
		int nInt;
		
		//アスタリスクを表示する数を決める
		do {
			//何個表示するかを聞く
			System.out.print("何個表示しますか：");
			//nIntに入力値を格納
			nInt = standardInput.nextInt();
		
		//nIntは0以上
		} while (nInt < 0);
		
		//アスタリスクとプラスを1セットとして、indexCounter回表示するカウンター
		int indexCounter = 0;
		
		//indexCounterは0～nInt-1までカウントする
		while (indexCounter < nInt) {
			
			//counterが偶数の時*、奇数の時+
			System.out.print(indexCounter % 2 == 0 ? "*" : "+");
			//counterを増やす
			indexCounter++;
		}

		//scannerのインスタンスを破棄
		standardInput.close();

	}
}