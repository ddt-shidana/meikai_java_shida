/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-3 p59
 * 	List3-5の最後のelseを、
 * 	else if (n == 0) に変更したらどうなるか検討せよ。
 *
 * 検討
 * 	やってることが同じなため、動きに変わりはない。
 *
 * パッケージ名:ensyu03_03
 * クラス名:Ensyu03_03
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu03_03;

//乱数取得準備
import java.util.Scanner;

public class Ensyu03_03 {
//クラス内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//list3-5の最後のelseをelse if(n==0)に変更
		Scanner stdIn = new Scanner (System.in);

		//整数値を入力値から取得
		System.out.println ("整数値:");
		int n = stdIn.nextInt();

		//整数値を正か不かまたは0かを判定
		if (n > 0)
			System.out.println("その値は正です。");
		else if (n < 0)
			System.out.println("その値は負です。");
		else if (n == 0)
			System.out.println("その値は0です。");

		//scannerのインスタンスをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}