/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-1 p33
 * 	int型の変数に小数部を持つ実数値を代入するとどうなるか考察せよ。
 * 結果:
 * 「ワークスペースでエラー」とポップアップが表示され、実行されない。
 * 考察:
 * 	倍精度浮動小数点数double型と整数int型だと、
 * 	int型の方が箱が小さいため、
 * 	エラー箇所に
 * 	「型の不一致：double型からint型に変更できません」とのメッセージが出る。
 *
 * パッケージ名:ensyu02_01
 * クラス名:Ensyu02_01
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu02_01;

public class Ensyu02_01 {

	public static void main(String[] args) {
		
		//xInt,yIntに小数部の有る実数値を直書きで初期設定しておく。
		int xInt = 63.5, yInt = 18.2;

		//xの値を画面表示させる。
		System.out.println("xの値は" + xInt + "です。");
		//yの値を画面表示させる。
		System.out.println("yの値は" + yInt + "です。");
		//xとyの合計値を画面表示させる。
		System.out.println("合計は" + (xInt + yInt) + "です。");
		//xとyの平均値を画面表示させる。
		System.out.println("平均は" + (xInt + yInt) / 2 + "です。");

	}

}
