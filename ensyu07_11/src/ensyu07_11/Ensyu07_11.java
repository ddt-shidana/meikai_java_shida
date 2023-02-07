package ensyu07_11;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-11 p247<br>
 * 	整数を左右にシフトした値が、
 * 	2のべき乗での乗算や除算と等しくなることを確認するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/07
 * 修正日:2023/02/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_11 {

	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("整数xを左右どちらかにnビットシフトさせた値と、");
		System.out.println("整数xを除算・乗算した値が等しいか確認するプログラムです。");

		//プログラムを再度実行するかの確認
		do {
			//指定する値を入力してもらう
			//シフトする整数値
			int xIn;
			//シフトする方向
			int shiftIn;

			//※負の値を右にシフトすると符号ビットが値として計算されるため弾く
			do {
				System.out.print("\n整数x：");
				xIn = stdIn.nextInt();

				//シフトする方向を入力してもらう（0と1以外は聞き直す）
				do {
					System.out.print("シフトする方向は(左・・・0/右・・・1)：");
					shiftIn = stdIn.nextInt();
					//聞き直す場合のメッセージ表示（0か1以外）
					if (shiftIn != 0 && shiftIn != 1) {
						System.out.println("0か1を入力してください。");
					}
					//聞き直す場合のメッセージ表示(右シフトなのにマイナス値）
					else if (xIn < 0 && shiftIn == 1) {
						System.out.println("右シフトする場合は正の整数値を入力してください。");
					}
				} while (shiftIn != 0 && shiftIn != 1);

			} while (xIn < 0 && shiftIn == 1);

			//シフトするビット数n(n % 32 != 0 && n > 0)を入力してもらう
			int nIn;

			//（0以下は聞き直す）
			do {
				System.out.print("シフトするビット数n(>0)：");
				nIn = stdIn.nextInt();
				//聞き直す場合のメッセージ表示(n>0)
				if (nIn <= 0) {
					System.out.println("正の値を入力してください。");
				}
				//聞き直す場合のメッセージ表示(n % 32 == 0)
				else if (nIn % 32 == 0) {
					System.out.println("32の倍数ではシフトできないので避けてください。");
				}
			} while (nIn <= 0 || nIn % 32 == 0);

			//nInの値を32で割った剰余に上書き
			int n = nIn % 32;

			//nビットシフト後の値を取得するための変数
			//これを後に2のべき乗の乗算・除算した値と比較する
			int shiftNum = 0;
			//左シフトと右シフトでスイッチ
			switch (shiftIn) {
			//左シフトの場合・・・2のべき乗の乗算といっちするはず
			case 0:
				//左シフトした値を返却値に持つlShiftメソッドの呼び出し
				shiftNum = lShift(xIn, n);
				//シフト後の値を表示
				System.out.println("\t" + xIn + "を左に" + nIn + "ビットシフトした値：" + shiftNum);
				//xに2のn乗をかけた値を求める
				int mulNum = xIn;
				for (int exponentItr = 0; exponentItr < n; exponentItr++) {
					mulNum *= 2;
				}
				//一致したらメッセージ表示
				if (shiftNum == mulNum) {
					System.out.println("\t2の" + n + "乗で乗算した値と一致しました。");
				}
				//一致しなかった場合のメッセージ表示
				else {
					System.out.println("一致しません。");
				}
				break;

			//右シフトの場合
			case 1:
				shiftNum = rShift(xIn, nIn);
				//xを2のn乗で割った値をを求める
				//シフト後の値を表示
				System.out.println("\t" + xIn + "を右に" + nIn + "ビットシフトした値：" + shiftNum);
				int divNum = xIn;
				for (int exponentItr = 0; exponentItr < nIn; exponentItr++) {
					divNum /= 2;
				}
				//一致したらメッセージ表示
				if (shiftNum == divNum) {
					System.out.println("\t2の" + nIn + "乗で除算した値と一致しました。");
				}
				//一致しなかった場合のメッセージ表示
				else {
					System.out.println("一致しません。");
				}
				break;
			}

		} while (confirmRetry());

	}

	/**
	 * xを左にnビットシフトする
	 * @param x 整数
	 * @param n ビット数
	 * @return xを左にnビットシフトした整数値
	 */
	private static int lShift(int x, int n) {
		int lShiftInt = x << n;
		return lShiftInt;
	}

	/**
	 * xを右にnビットシフトする
	 * @param x 整数
	 * @param n ビット数
	 * @return xを右にnビットシフトした整数値
	 */
	private static int rShift(int x, int n) {
		int rShiftInt = x >>> n;
		return rShiftInt;
	}

	/**
	 * 続行の確認を行うメソッド
	 * 入力値が1のとき繰り返す、0のとき終了
	 * @return 入力値が1のときTrue
	 */
	private static boolean confirmRetry() {
		int retryNum;
		do {
			System.out.print("もう一度？ YES・・・1/NO・・・0：");
			retryNum = stdIn.nextInt();
		} while (retryNum < 0 || retryNum > 1);
		return retryNum == 1;
	}
	
}