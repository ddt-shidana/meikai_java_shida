package ensyu06_03;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-3 p185<br>
 * 	要素型がdouble型で要素数が5の配列の要素に対して、
 * 	先頭から順に1.1,2.2,3.3,4.4,5.5を代入して表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_03 {

	//配列の要素数
	final static int ARRAY_INDEX = 5;

	public static void main(String[] args) {

		//要素数5のdouble型配列を用意
		double[] doubleArray = new double [ARRAY_INDEX];

		//配列に 1.1, 2.2, 3.3, 4.4, 5.5 を代入
		for (int inIndex = 1; inIndex <= doubleArray.length; inIndex++) {
			// inIndex + (inIndex / 10)
			doubleArray[inIndex] = inIndex + ((double)inIndex / 10);
			//配列の要素の値を表示
			System.out.println(doubleArray[inIndex - 1]);
		}
	}
}
