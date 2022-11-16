package ensyu06_02;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-2 p185<br>
 * 	要素型がint型で要素数が5の配列の要素に対して、
 * 	先頭から順に5,4,3,2,1を代入して表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/01<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_02 {
	
	//配列の要素数
	final static int ARRAY_INDEX = 5;
	
	public static void main(String[] args) {

		//int型の配列を用意、要素数
		int[] intArray = new int[ARRAY_INDEX];

		// ARRAY_INDEX 回ループ
		for (int decrementIndex = 0; decrementIndex < intArray.length; decrementIndex++) {
			//配列に ARRAY_INDEX ～1まで1ずつ減らした値を順番に格納
			intArray[decrementIndex] = 5 - decrementIndex;
			//配列の要素の値を表示
			System.out.println(intArray[decrementIndex]);
		}
	}
}
