/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-9 p45
 * 	以下に示すプログラムを作成せよ。(実数値の乱数の生成にはnextDouble()を使うこと)
 * 		・0.0以上1.0未満の実数値をランダムに生成して表示
 * 		・0.0以上10.0未満の実数値をランダムに生成して表示
 * 		・-1.0以上1.0未満の実数値をランダムに生成して表示
 *
 * パッケージ名:ensyu02_09
 * クラス名:Ensyu02_09
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu02_09;

//乱数取得準備
import java.util.Random;

public class Ensyu02_09 {
//クラス内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//randに乱数を取得
		Random rand = new Random();

		//randNum5に乱数取得：0.0以上1.0未満
		double randNum5 = rand.nextDouble();
		//randNum6に乱数取得：0.0以上10.0未満
		double randNum6 = rand.nextDouble() * 10;
		//randNum7に乱数取得：-1.0以上1.0未満
		double randNum7 = rand.nextDouble() * 2 - 1.0;

		//randNam5,6,7を画面表示
		System.out.println (randNum5);
		System.out.println (randNum6);
		System.out.println (randNum7);

	//mainメソッドここまで
	}

//クラス内容ここまで
}
