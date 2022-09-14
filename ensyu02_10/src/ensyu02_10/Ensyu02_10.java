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

	public static void main(String[] args) {

		//stdStはキーボードからの入力値
		Scanner stdSt = new Scanner (System.in);

		//姓を入力してもらう案内
		System.out.println ("姓:");
		//seiはキーボードから入力された名字
		String sei = stdSt.next();

		//名前を入力してもらう案内
		System.out.println ("名:");
		//myouはキーボードから入力された名前
		String myou = stdSt.next();

		//コメント出力：こんにちは「氏名」さん。
		System.out.println ("こんにちは" + sei + myou + "さん。");

		//scannerのインスタンスをクローズ
		stdSt.close();

	}

}