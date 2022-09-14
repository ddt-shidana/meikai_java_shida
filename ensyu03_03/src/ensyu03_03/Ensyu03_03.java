package ensyu03_03;

//乱数取得準備
import java.util.Scanner;

/**
 * 問題:演習3-3 p59<br>
 * 	List3-5の最後のelseを、
 * 	else if (n == 0) に変更したらどうなるか検討せよ。<br>
 *
 * 検討<br>
 * 	やってることが同じなため、動きに変わりはないが、バグの温床になる。<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_03 {

	public static void main(String[] args) {

		//list3-5の最後のelseをelse if(n==0)に変更
		Scanner stdIn = new Scanner (System.in);

		//整数値を入力値から取得
		System.out.println ("整数値:");
		int n = stdIn.nextInt();

		//整数値を正か不かまたは0かを判定
		if (n > 0) {
			System.out.println("その値は正です。");
		} else if (n < 0) {
			System.out.println("その値は負です。");
		} else if (n == 0) {
			System.out.println("その値は0です。");
		}
		
		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}