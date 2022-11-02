/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-2 p33
 * 	3つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。

 * パッケージ名:ensyu02_01
 * クラス名:Ensyu02_01
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu02_02;

public class Ensyu02_02 {
//ここからクラスの内容

	public static void main(String[] args) {
		
		//x,y,zにそれぞれ任意の整数値を直書きで初期設定しておく。
		int xInt = 1, yInt = 2, zInt = 3;

		//xの値を画面表示させる。
		System.out.println("xの値は" + xInt + "です。");
		//yの値を画面表示させる。
		System.out.println("yの値は" + yInt + "です。");
		//zの値を画面表示させる。
		System.out.println("zの値は" + zInt + "です。");
		//x,y,zの合計値を画面表示させる。
		System.out.println("合計は" + (xInt + yInt + zInt) + "です。");
		//x,y,zの平均値を画面表示させる。
		System.out.println("平均は" + (xInt + yInt + zInt) / 3 + "です。");

	}

}
