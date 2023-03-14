package ensyu07_31;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-31 p263<br>
 * 	int型整数xの絶対値、long型整数xの絶対値、float型実数xの絶対値、double型実数xの絶対値を求める、
 * 	多重定義されたメソッド群を作成せよ。<br>
 *
 * 作成日:2022/03/11<br>
 * 修正日:2023/03/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_31 {

	//Scannerメソッド(stdInにキーボードからの入力値を初期設定)
	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {

		//もう一度プログラムを実行する場合のかたまり
		do {
			//プログラム開始のメッセージ
			System.out.println("実数値を4種類の型で入力し、絶対値を返します。");

			//-----4種類の実行プログラムからどれを実行するかを選んでもらう--------//
			//4種類のプログラムの案内
			System.out.println("\t(1)int型");
			System.out.println("\t(2)long型");
			System.out.println("\t(3)float型");
			System.out.println("\t(4)double型");
			//選択用№を格納する変数を用意
			int selectPNum = 0;
			//1～4以外が入力されたら聞き直す
			do {
				//1～4を入力してもらう
				System.out.print("どれを実行しますか？(1～4）：");
				//入力された№を変数に格納する
				selectPNum = stdIn.nextInt();
				//0～4以外が入力された場合のエラーメッセージ
				if (selectPNum < 0 || selectPNum > 4) {
					System.out.println("1～4を入力してください。");
				}
			//0～4以外が入力されたらdoメソッドの頭に戻る
			} while (selectPNum < 0 || selectPNum > 4);

			//-----各プログラムの実行----------------------------------------------//
			switch (selectPNum) {
				//(1)int型
				case 1: {
					System.out.print("int型整数値：");
					int intX = stdIn.nextInt();
					System.out.println("\t絶対値は " + absolute(intX) + " です。");
					break;
				}

				//(2)long型
				case 2: {
					System.out.print("int型整数値：");
					long longX = stdIn.nextLong();
					System.out.println("\t絶対値は " + absolute(longX) + " です。");
					break;
				}

				//(3)float型
				case 3: {
					System.out.print("float型整数値：");
					float floatX = stdIn.nextFloat();
					System.out.println("\t絶対値は " + absolute(floatX) + " です。");
					break;
				}

				//(4)double型
				case 4: {
					System.out.print("double型整数値：");
					double doubleX = stdIn.nextDouble();
					System.out.println("\t絶対値は " + absolute(doubleX) + " です。");
					break;
				}
			}
			//-----各プログラムの実行ここまで----------------------------------------//

		//再度実行するかどうかを聞いて、もう一度なら繰り返す：confirmRetryメソッドの呼び出し
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
	 * int型xを入力してもらい、xの絶対値を返却する
	 * @param x int型
	 * @return xの絶対値
	 */
	private static int absolute (int x) {
		//絶対値を格納する変数を用意
		int absoluteInt;
		//xが正の値（0も含む）なら絶対値はx
		if (x >= 0) {
			absoluteInt = x;
		}
		//負の値なら絶対値は-x
		else {
			absoluteInt = -1 * x;
		}
		//返却値
		return absoluteInt;
	}

	/**
	 * long型xを入力してもらい、xの絶対値を返却する
	 * @param x long型
	 * @return xの絶対値
	 */
	private static long absolute (long x) {
		//絶対値を格納する変数を用意
		long absolutelong;
		//xが正の値（0も含む）なら絶対値はx
		if (x >= 0) {
			absolutelong = x;
		}
		//負の値なら絶対値は-x
		else {
			absolutelong = -1 * x;
		}
		//返却値
		return absolutelong;
	}

	/**
	 * float型xを入力してもらい、xの絶対値を返却する
	 * @param x float型
	 * @return xの絶対値
	 */
	private static float absolute (float x) {
		//絶対値を格納する変数を用意
		float absolutefloat;
		//xが正の値（0も含む）なら絶対値はx
		if (x >= 0) {
			absolutefloat = x;
		}
		//負の値なら絶対値は-x
		else {
			absolutefloat = -1 * x;
		}
		//返却値
		return absolutefloat;
	}

	/**
	 * double型xを入力してもらい、xの絶対値を返却する
	 * @param x double型
	 * @return xの絶対値
	 */
	private static double absolute (double x) {
		//絶対値を格納する変数を用意
		double absolutedouble;
		//xが正の値（0も含む）なら絶対値はx
		if (x >= 0) {
			absolutedouble = x;
		}
		//負の値なら絶対値は-x
		else {
			absolutedouble = -1 * x;
		}
		//返却値
		return absolutedouble;
	}

}