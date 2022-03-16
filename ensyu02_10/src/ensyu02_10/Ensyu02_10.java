/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-10 p47
 * 	名前の姓と名を個別にキーボードから読み込んで、
 * 	挨拶を行うプログラムを作成せよ。
 *
 * パッケージ名:ensyu02_10
 * クラス名:Ensyu02_10
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu02_10;

//乱数取得準備
import java.util.Scanner;

public class Ensyu02_10 {
//クラス内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdStに入力値を取得
		Scanner stdSt = new Scanner (System.in);

		//姓を入力してもらう
		System.out.println ("姓:");
		String s = stdSt.next();

		//名前を入力してもらう
		System.out.println ("名:");
		String m = stdSt.next();

		//コメント出力：こんにちは～～さん。
		System.out.println ("こんにちは" + s + m + "さん。");

		//scannerのインスタンスをクローズ
		stdSt.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}