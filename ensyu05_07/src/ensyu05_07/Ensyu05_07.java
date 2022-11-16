package ensyu05_07;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習5-7 p169<br>
 * 	0.0から1.0まで0.001おきに、その値と、その値の２乗を表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu05_07 {

	public static void main(String[] args) {

		//表を表示
		System.out.println("  底      べき乗  ");
		System.out.println("--------------------");

		//1000倍した整数で繰り返しを記述
		for (int squareIndex = 0; squareIndex <= 1000; squareIndex++) {
			//1/1000単位を基数とする
			float floatNumber = (float)squareIndex / 1000;
			//べき乗の底を小数点以下3桁で表示
			System.out.printf("%1.3f  ", floatNumber);
			//べき数を小数点以下7桁で表示
			System.out.printf(" %2.7f\n", floatNumber * floatNumber);
		}

	}
}
