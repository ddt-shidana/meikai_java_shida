package ensyu06_01;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-1 p183<br>
 * 	要素型がdouble型で要素数が5の配列を生成して、
 * 	その全要素の値を表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_01 {
	
	//配列の要素数
	final static int ARRAY_INDEX = 5;
	
	public static void main(String[] args) {

		//double型の配列を用意、要素数
		double[] doubleArray = new double[ARRAY_INDEX];

		//配列の大きさ分ループ
		for(double doubleNumber : doubleArray) {
			//全要素の値を表示
			System.out.println(doubleNumber);
		}
	}
}
