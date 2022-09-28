package ensyu04_09;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-9 p113
 * 	正の整数値nを読み込んで、1からnまでの積を求めるプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_09 {

	public static void main(String[] args) {
		
		//キーボードからの入力値をうけるための新規インスタンス
		Scanner stdIn = new Scanner(System.in);
		
		//正の整数
		int nInt = 0;
		//正の整数が入力するブロック
		do {
			//正の整数を入力してもらう
			System.out.print("nの値：");
			//キーボードからの入力値をnIntに受け取る
			nInt = stdIn.nextInt();
			//正の整数が入力されるまで繰り返す
		} while (nInt <= 0);
		
		//1からnまでの積（初期値1）
		int ans = 1;
		//1からnまで順番に増やす
		int counter = 1;
		//counterがnIntになるまでくりかえす
		while (counter <= nInt) {
			//1から順番にかけ合わせていく
			ans *= counter;
			//counterを増やす
			counter++;
		}
		
		//かけ合わせた結果を表示
		System.out.println("1から" + nInt + "までの積は" + ans + "です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}

}
