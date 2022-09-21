package ensyu04_02;

//乱数を生成する準備のためimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-2 p99<br>
 * 	2桁の整数値（10～99）を当てさせる《数当てゲーム》を作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/21<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_02 {

	public static void main(String[] args) {
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//randに乱数を初期設定
		Random rand = new Random();

		//整数型変数noに、（0～89）＋10の乱数randを初期設定
		int no = rand.nextInt(90) + 10;

		//ゲームプレイする人が数当てで入力する値を格納するための、整数型変数xを用意
		int x;

		//ゲームスタートの文言を画面表示させる
		System.out.println("数当てゲーム開始!!\n10～99の値を入力してください。");

		do {
			//ゲームの進行補助の文言を画面表示させる
			System.out.print("いくつかな？：");

			//あらかじめ用意していたxにゲームプレイ者が入力した値を代入
			x = stdIn.nextInt();

			//入力値(x)がnoより小さい時
			if (x > no) {
				//「もっと小さい数だよ」と画面表示させる
				System.out.println("もっと小さい数だよ");
			//入力値(x)がnoより大きい時
			} else if (x < no) {
				//「もっと大きい数だよ」と画面表示させる
				System.out.println("もっと大きい数だよ");
			}

		//doメソッドここまで
		}
		//入力値xがゲームスタート時に生成した乱数(no)と一致しない間、doメソッドを繰り返す
		while (x != no);

		//入力値xがゲームスタート時に生成した乱数(no)と一致したら「正解です。」と画面表示させる
		System.out.println("正解です。");

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}

}
