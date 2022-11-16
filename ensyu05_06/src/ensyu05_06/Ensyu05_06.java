package ensyu05_06;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習5-6 p169<br>
 * 	List5-9のように、float型の変数を0.0から01.0まで0.001ずつ増やしていく様子と、
 * 	List5-10のように、int型の変数を0から1000までインクリメントした値を
 * 	1000で割った値を求める様子を、横に並べて表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu05_06 {

	public static void main(String[] args) {
	//ここからmainメソッド

		//List5-9パターンで使用する合計用の変数
		float sumFloat = 0.0F;
		//List5-10パターンで使用する合計用の変数
		float sumInt = 0.0F;

		//表を表示
		System.out.println("  float      int  ");
		System.out.println("--------------------");

		//List5-10パターンで使用する変数の初期値を設定
		int floatIndex = 0;
		
		//0～1000（+1ずつ）のループ
		for (float floatNumber = 0.0F; floatNumber <= 1.0F; floatNumber +=0.001F) {
			
			//float型の変数を0.0から01.0まで0.001ずつ増やしていく値
			System.out.printf("%1.7f", floatNumber);
			//float型の合計
			sumFloat += floatNumber;

			//int型の変数を1000で割った値
			float intNumber = (float)floatIndex / 1000;
				//int型の変数を1000で割った値を表示
				System.out.printf("  %1.7f\n", intNumber);
				//int型の合計値
				sumInt += intNumber;
				//int型の変数を0から1000までインクリメント
				floatIndex++;

		}
		
		//合計値の表示
		System.out.println("-------合計値-------");
		System.out.println(sumFloat + "  " + sumInt);
	}

}
