package ensyu04_15;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-15 p121<br>
 * 	身長と標準体重の対応表を表示するプログラムを作成せよ。
 * 	表示する身長の範囲（開始値/終了値/増分）整数値として読み込むこと。
 * 	※標準体重は（身長 - 100）× 0.9によって求められる。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/11/02<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_15 {

	public static void main(String[] args) {
		
		//Scannerクラスのインスタンスを生成
		Scanner standardInput = new Scanner(System.in);
		//開始値
		int startChart;
		//終了値
		int endChart;
		//増分
		int displayChart;
		
		//何センチか聞くかたまり
		do {
			//開始値を入力値から受け取る
			System.out.print("何cmから：");
			startChart = standardInput.nextInt();
			//終了値を入力値から受け取る
			System.out.print("何cmまで：");
			endChart = standardInput.nextInt();
			//増分を入力値から受け取る
			System.out.print("何cmごと：");
			displayChart = standardInput.nextInt();
		//開始値・終了値が、標準体重が現実的な値で求められる身長100cm以上であり、
		//増分が0より大きいこと。
		//そうでない場合は聞き直す
		} while (startChart <= 100 || endChart <= 100 || displayChart <= 0);
		
		//身長と標準体重のカラム表示
		System.out.println("身長 標準体重");
		//開始値、終了値、増分で繰り返し
		for (int chartIndex = startChart; chartIndex <= endChart; chartIndex += displayChart) {
			//身長と標準体重を表示
			System.out.println(chartIndex + "  " + (chartIndex - 100) * 0.9);
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		standardInput.close();

	}
}