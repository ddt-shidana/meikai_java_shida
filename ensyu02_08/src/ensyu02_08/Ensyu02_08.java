/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-8 p45
 * 	キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値を
 * 	ランダムに生成して表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu02_08
 * クラス名:Ensyu02_08
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu02_08;

//乱数を生成する準備のためimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu02_08 {

	public static void main(String[] args) {
		
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//randに乱数を初期設定
		Random rand = new Random();

		////使用者がわかりやすいようにナビで
		//「整数値：」と画面表示させる
		System.out.print ("整数値:");
		//入力した値を変数にもっておく
		int xInt = stdIn.nextInt();

		//整数型変数randnam4を用意して、0～10の乱数値を初期設定
		int randNum4 = rand.nextInt(11);

		//求めたいのは 入力値 + (0～10のランダムな値) - 5
		int randInt = xInt + randNum4 - 5;
		
		//入力値±5の値を画面表示させる
		System.out.println("その値の±5の乱数を生成しました。それは" + randInt + "です。");
		
		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}

}
