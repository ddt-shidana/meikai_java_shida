package ensyu04_08;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-8 p113
 * 	正の整数を読み込んで、その桁数を出力せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_08 {

	public static void main(String[] args) {
		
		//キーボードからの入力値を取得
		Scanner stdIn = new Scanner(System.in);
		
		//1～nまでの和を求めるn
		int nInt = 0;
		
		//正の数
		do {
			//整数値を入力してもらう
			System.out.print("正の整数：");
			//キーボードからの入力値
			nInt = stdIn.nextInt();
		//0以下の場合doブロックを繰り返す
		} while (nInt <= 0);
		
		//仮変数にnIntを設定
		int temp = nInt;
		//10で割った回数
		int counter = 0;
		
		//10で割る塊
		do {
			//仮変数を10で割っていく
			temp /= 10;
			//割った分counterを増やす
			counter++;
		//tempが0以下になるまで繰り返す
		} while (temp > 0);
		
		//何桁か画面表示
		System.out.println("その値は" + counter + "桁です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();
	}
}