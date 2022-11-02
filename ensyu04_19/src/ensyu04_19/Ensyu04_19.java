/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習4-19 p125
 * 	季節を求めるList4-1の月の読み込みにおいて、
 * 	1～12以外の値が入力された場合は、再入力させるように
 * 	修正したプログラムを作成せよ（do文の中にdo文が入る二重ループとなる）。
 *
 * パッケージ名:ensyu04_19
 * クラス名:Ensyu04_19
 * 作成日:2022/02/24
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu04_19;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

public class Ensyu04_19 {

	public static void main(String[] args) {

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//整数型変数retryNumを用意
		int retryNum;

		//ここからdoメソッド：一度判定を完了した時、再度判定するかどうかでループさせる
		do {
			
		//整数型変数monthを用意しておく（内部のdoと外部のdoで共通）
		int monthNumber = 0;

			//ここからdoメソッド：入力値が1～12以外の場合再入力させる
			do {
				//季節を求めるプログラム開始のメッセージを画面表示させる
				System.out.print ("季節を求めます。\n何月ですか：");

				//monthに入力値を代入
				monthNumber  = standardInput.nextInt();
			
			//1～12以外が入力されたら聞き直す
			} while (monthNumber < 1 || monthNumber > 12);
			
			//3～5月
			if (monthNumber >= 3 && monthNumber <= 5)
				//春
				System.out.println("それは春です。");
			
			//6～8月
			else if (monthNumber >=6  && monthNumber <= 8)
				//夏
				System.out.println("それは夏です。");
			
			//9～11月
			else if (monthNumber >=9  && monthNumber <= 11)
				//秋
				System.out.println("それは秋です。");
			
			//12、1、2月
			else if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2)
				//冬
				System.out.println("それは冬です。");

			//再度判定を行うかどうかの確認メッセージを画面表示させる
			//1:Yes 0:No
			System.out.println("\nもう一度？");
			System.out.print("1・・・Yes/0・・・No");

			//retryNumに入力値を初期設定
			retryNum = standardInput.nextInt();

		//doメソッドここまで
		} while (retryNum == 1);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		standardInput.close();

	}

}
