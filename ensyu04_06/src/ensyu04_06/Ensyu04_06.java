package ensyu04_06;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-6 p109<br>
 * 	読み込んだ値が1未満であれば改行文字を出力しないようにList4-7および
 * 	List4-8を書きかえたプログラムをそれぞれ作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();

		int index = 0;
		//n回行うまで
		while (index < n) {
			//*を画面表示
			System.out.print('*');
			//画面表示が終わるたび、indexをn-1まで1ずつ増やす
			index++;
		}

		//1以上の時は
		if (n >= 1) {
			//改行をする
			System.out.println();
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
