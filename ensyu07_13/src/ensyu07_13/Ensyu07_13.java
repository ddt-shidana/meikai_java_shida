package ensyu07_13;

import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-13 p247<br>
 * 	整数xのposビット目を、
 * 	1にした値を返すメソッドset、
 * 	0にした値を返すメソッドreset、
 * 	反転した値を返すメソッドinverseを作成せよ。<br>
 *
 * 作成日:2022/03/07
 * 修正日:2023/02/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_13 {

	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {
		//プログラム開始メッセージ表示
		System.out.println("整数xのposビット目（最下位から0,1,2…と数える）を");
		System.out.println("0/1/反転した値を求めます。");

		//プログラムを再度実行するかの確認
		do {
			//使用する整数を入力してもらう
			int xIn;
			System.out.print("\n整数x：");
			xIn = stdIn.nextInt();

			//変更する要素のインデックス0<=pos<32の値を入力してもらう
			int posIn;
			//（0<=pos<32外は聞き直す）
			do {
				System.out.print("pos(0<=pos<32)：");
				posIn = stdIn.nextInt();
				//聞き直す場合のメッセージ表示(0<=pos<32)
				if (posIn <= 0 || posIn >=32) {
					System.out.println("0<=pos<32の範囲の整数値を入力してください。");
				}
			} while (posIn < 0 || posIn >= 32);

			//結果を表示
			System.out.println("変換結果です。");
			System.out.println("\t＜10進数で表示＞");
			System.out.println("\t " + xIn + "の" + posIn + "ビット目を1にした値：   " + set(xIn, posIn));
			System.out.println("\t " + xIn + "の" + posIn + "ビット目を0にした値：   " + reset(xIn, posIn));
			System.out.println("\t " + xIn + "の" + posIn + "ビット目を反転した値：  " + inverse(xIn, posIn));

			System.out.println("\t＜ 2進数で表示＞");
			System.out.print("\t " + xIn + "（入力値）：               ");
			print02(xIn);
			System.out.print("\n\t " + xIn + "の" + posIn + "ビット目を1にした値：   ");
			print02(set(xIn, posIn));
			System.out.print("\n\t " + xIn + "の" + posIn + "ビット目を0にした値：   ");
			print02(reset(xIn, posIn));
			System.out.print("\n\t " + xIn + "の" + posIn + "ビット目を反転した値：  ");
			print02(inverse(xIn, posIn));
			System.out.println("");

		} while (confirmRetry());

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

	/**
	 * 任意の値の配列を取得する
	 * @param x 任意の値
	 * @return xの要素数32のビット配列
	 */
	private static int[] getBitArray(int x) {
		//要素数32のビット配列を格納する変数
		int[] getBitArray = new int[32];
		//画面に表示する場合左側から要素の値を格納していく
		for (int placeItr = 31; placeItr >= 0; placeItr--) {
			if ((x >>> placeItr & 1) == 1) {
				getBitArray[placeItr] = 1;
			}
			else if ((x >>> placeItr & 1) == 0) {
				getBitArray[placeItr] = 0;
			}
		}
		return getBitArray;
	}

	/**
	 * ビット配列を値に変換する
	 * @param xArray ビット配列
	 * @return 値
	 */
	private static int arrayToValue(int[] xArray) {
		//ビット配列を値に変換
		int arrayToValue = 0;
		int exponent = 1;
		for (int placeItr = 0; placeItr <32; placeItr++) {
			if (xArray[placeItr] == 1) {
				arrayToValue += exponent;
		}
			exponent *= 2;
		}
		return arrayToValue;
	}

	/**
	 * 整数xのposビット目を1にした値を返す
	 * @param x 整数
	 * @param pos 1にするビット位置
	 * @return 整数xのposビット目を1にした値
	 */
	private static int set(int x, int pos) {
		//変換後の配列を求める変数を用意し、整数xの配列を初期設定
		int[] changeArray = getBitArray(x);
		//posビット目を1に変更
		changeArray[pos] = 1;
		//変更後の配列を値になおす
		int setX = arrayToValue(changeArray);
		return setX;
	}

	/**
	 * 整数xのposビット目を0にした値を返す
	 * @param x 整数
	 * @param pos 0にするビット位置
	 * @return 整数xのposビット目を0にした値
	 */
	private static int reset(int x, int pos) {
		//変換後の配列を求める変数を用意し、整数xの配列を初期設定
		int[] changeArray = getBitArray(x);
		//posビット目を0に変更
		changeArray[pos] = 0;
		//変更後の配列を値になおす
		int resetX = arrayToValue(changeArray);
		return resetX;
	}

	/**
	 * 整数xのposビット目を反転した値を返す
	 * @param x 整数
	 * @param pos 反転するビット位置
	 * @return 整数xのposビット目を反転した値
	 */
	private static int inverse(int x, int pos) {
		//変換後の配列を求める変数を用意し、整数xの配列を初期設定
		int returnX = x;
		
		//posビット目を反転
		/*没 補数をとると符号ビットがついてしまう
		//test
		//System.out.println(changeArray[pos]);
				changeArray[pos] = ~ changeArray[pos];
		//test
		//System.out.println(changeArray[pos]);
 		 */

		//posビット目が0の時
		if (getBitArray(x)[pos] == 0) {
			returnX = set(x, pos);
		}
		//posビット目が1の時
		else {
			returnX = reset(x, pos);
		}
		return returnX;
	}

	/**
	 * 2進数の頭を0埋めにして表示する
	 * @param x 任意の二進数
	 */
	private static void print02(int x) {
		for (int placeItr = 31; placeItr >= 0; placeItr--) {
			System.out.print(((x >>> placeItr & 1) == 1) ? '1' : '0');
		}
	}

}
