package ensyu07_32;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習7-32 p263<br>
 * 	List7-12のメソッドprintBitsはint型整数値の内部ビットを表示するものであった。
 * 	他の整数型に対しても同様の働きを行う、多重定義されたメソッド群を作成せよ。<br>
 *
 * 作成日:2022/03/09<br>
 * 修正日:2023/03/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu07_32 {

	//Scannerメソッド(stdInにキーボードからの入力値を初期設定)
	private static Scanner stdIn = new Scanner (System.in);

	public static void main(String[] args) {

		//もう一度プログラムを実行する場合のかたまり
		do {
			//プログラム開始のメッセージ
			System.out.println("実数値を4種類の型で入力し、ビット演算結果を表示します。");

			//-----4種類の実行プログラムからどれを実行するかを選んでもらう--------//
			//4種類のプログラムの案内
			System.out.println("\t(1)byte型");
			System.out.println("\t(2)short型");
			System.out.println("\t(3)int型");
			System.out.println("\t(4)long型");
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
				//(1)byte型
				case 1: {
					//byte型で整数値を2つ入力してもらう
					System.out.print("byte型整数値a：");	byte byteA = stdIn.nextByte();
					System.out.print("byte型整数値b：");	byte byteB = stdIn.nextByte();
					printBits(byteA, "a", byteB, "b");
					break;
				}

				//(2)short型
				case 2: {
					//short型で整数値を2つ入力してもらう
					System.out.print("short型整数値a：");	short shortA = stdIn.nextShort();
					System.out.print("short型整数値b：");	short shortB = stdIn.nextShort();
					printBits(shortA, "a", shortB, "b");
					break;
				}

				//(3)int型
				case 3: {
					//int型で整数値を2つ入力してもらう
					System.out.print("int型整数値a：");	int intA = stdIn.nextInt();
					System.out.print("int型整数値b：");	int intB = stdIn.nextInt();
					printBits(intA, "a", intB, "b");
					break;
				}

				//(4)long型
				case 4: {
					//long型で整数値を2つ入力してもらう
					System.out.print("long型整数値a：");	long longA = stdIn.nextLong();
					System.out.print("long型整数値b：");	long longB = stdIn.nextLong();
					printBits(longA, "a", longB, "b");
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
	 * byte型のビット構成を表示する
	 * @param x 8ビットの整数
	 */
	private static void printBits(byte x) {
		for (int i = 7; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/**
	 * short型のビット構成を表示する
	 * @param x 16ビットの整数
	 */
	private static void printBits(short x) {
		for (int i = 15; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	/**
	 * int型のビット構成を表示する
	 *	※List7-12のうつし（p241）
	 *	int・・・32ビットの整数
	 */
	private static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/**
	 * long型のビット構成を表示する
	 * @param x 64ビットの整数
	 */
	private static void printBits(long x) {
		for (int i = 63; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/**
	 * 整数x,y自身と補数、二数の論理積・論理和・排他的論理和をビット表示する
	 * @param x byte型整数
	 * @param xSt
	 * @param y byte型整数
	 * @param ySt
	 */
	private static void printBits(byte x,String xSt, byte y, String ySt) {
		//xをビット表示
		System.out.print(       xSt +          "     = ");	printBits(x);
		//yをビット表示
		System.out.print("\n" + ySt +          "     = ");	printBits(y);
		//xとyの論理積をビット表示
		System.out.print("\n" + xSt + " & " + ySt + " = ");	printBits((byte)(x & y));
		//xとyの論理和をビット表示
		System.out.print("\n" + xSt + " | " + ySt + " = ");	printBits((byte)(x | y));
		//xの補数をビット表示
		System.out.print("\n~" + xSt +          "    = ");	printBits((byte)(~x));
		//yの補数をビット表示
		System.out.print("\n~" + ySt +          "    = ");	printBits((byte)(~y));

		//表示が終わったので改行
		System.out.println("");
	}

	/**
	 * 整数x,y自身と補数、二数の論理積・論理和・排他的論理和をビット表示する
	 * 論理演算の返却値はint型の為、short型に縮小変換し表示させる
	 * @param x short型整数
	 * @param xSt
	 * @param y short型整数
	 * @param ySt
	 */
	private static void printBits(short x,String xSt, short y, String ySt) {
		//xをビット表示
		System.out.print(       xSt +          "     = ");	printBits(x);
		//yをビット表示
		System.out.print("\n" + ySt +          "     = ");	printBits(y);
		//xとyの論理積をビット表示
		System.out.print("\n" + xSt + " & " + ySt + " = ");	printBits((short)(x & y));
		//xとyの論理和をビット表示
		System.out.print("\n" + xSt + " | " + ySt + " = ");	printBits((short)(x | y));
		//xの補数をビット表示
		System.out.print("\n~" + xSt +          "    = ");	printBits((short)(~x));
		//yの補数をビット表示
		System.out.print("\n~" + ySt +          "    = ");	printBits((short)(~y));
		//表示が終わったので改行
		System.out.println("");
	}

	/**
	 * 整数x,y自身と補数、二数の論理積・論理和・排他的論理和をビット表示する
	 * List7-12のうつし（p241）
	 * @param x int型整数
	 * @param xSt
	 * @param y int型整数
	 * @param ySt
	 */
	private static void printBits(int x,String xSt, int y, String ySt) {
		//xをビット表示
		System.out.print(       xSt +          "     = ");	printBits(x);
		//yをビット表示
		System.out.print("\n" + ySt +          "     = ");	printBits(y);
		//xとyの論理積をビット表示
		System.out.print("\n" + xSt + " & " + ySt + " = ");	printBits(x & y);
		//xとyの論理和をビット表示
		System.out.print("\n" + xSt + " | " + ySt + " = ");	printBits(x | y);
		//xの補数をビット表示
		System.out.print("\n~" + xSt +          "    = ");	printBits(~x);
		//yの補数をビット表示
		System.out.print("\n~" + ySt +          "    = ");	printBits(~y);

		//表示が終わったので改行
		System.out.println("");
	}

	/**
	 * 整数x,y自身と補数、二数の論理積・論理和・排他的論理和をビット表示する
	 * @param x
	 * @param xSt
	 * @param y
	 * @param ySt
	 */
	private static void printBits(long x,String xSt, long y, String ySt) {
		//xをビット表示
		System.out.print(       xSt +          "     = ");	printBits(x);
		//yをビット表示
		System.out.print("\n" + ySt +          "     = ");	printBits(y);
		//xとyの論理積をビット表示
		System.out.print("\n" + xSt + " & " + ySt + " = ");	printBits(x & y);
		//xとyの論理和をビット表示
		System.out.print("\n" + xSt + " | " + ySt + " = ");	printBits(x | y);
		//xの補数をビット表示
		System.out.print("\n~" + xSt +          "    = ");	printBits(~x);
		//yの補数をビット表示
		System.out.print("\n~" + ySt +          "    = ");	printBits(~y);

		//表示が終わったので改行
		System.out.println("");
	}
	
}