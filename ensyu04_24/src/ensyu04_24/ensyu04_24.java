package ensyu04_24;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-24 p127<br>
 * 	正の整数値を読み込み、
 * 	それが素数であるかどうかを判定するプログラムを作成せよ。
 * 	素数とは、2以上n未満のいずれの数でも割り切ることのできない整数nのことである。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/2<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class ensyu04_24 {

	public static void main(String[] args) {

		//standardInputにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//素数判定プログラムの開始メッセージを画面表示させる
			System.out.println("正の整数nが素数であるかどうか判定します。");

			//正の整数positiveInteger(>0)変数を用意
			int positiveInteger;

			//positiveIntegerを決めるかたまり
			do {
				
				//正の整数nIntを聞く
				System.out.print("正の整数n:");
				//positiveIntegerに入力値を格納
				positiveInteger = standardInput.nextInt();
				
				//positiveIntegerは正の整数なので0未満の場合はエラーメッセージを表示し、
				if (positiveInteger <= 0) {
					System.out.println("正の整数を入力してください。\n");
				}
				
			//聞き直す
			} while (positiveInteger <= 0);

			//positiveIntegerの値で分岐
			switch(positiveInteger) {
				
				//positiveInteger == 1 のとき
				case 1:
					//素数の定義に当てはまらない
					System.out.println("素数判定外です。");
					break;
					
				//positiveInteger==2のとき
				case 2:
					//2は素数
					System.out.println("素数です。");
					break;
					
				//positiveInteger>2のとき
				default:
					//nIntを2、3、・・・nIntで割るループ
					for (int divisorInt = 2; divisorInt < positiveInteger; divisorInt++) {
	
						//t(2<=divisor<n)でnを割り、余りが0になることがあれば素数ではない、
						if (positiveInteger % divisorInt == 0) {
							System.out.println("素数ではありません");
							break;
						}
	
						//t(2<=divisor<n)でnを割り、余りが1以上であれば素数である
						else {
							//nInt自身以外で割り切れなかったら素数決定
							if (divisorInt == positiveInteger - 1) {
								System.out.println("素数です");
							//nInt自身以外で割るのをすべて試すまで繰り返す
							}else {
								continue;
							}
						}
					}
			}

			//retryNumは0か1
			do {
				//もう一度プログラムを実行するかどうかを聞く
				System.out.print("もう一度？ YES・・・1/NO・・・0");
				//入力値を変数に格納
				retryNum = standardInput.nextInt();
			//retryNumは0か1以外なら聞き直す
			} while (retryNum < 0 || retryNum > 1);
			
			//改行
			System.out.println();
			
		//retryNumが1の間プログラムを繰り返す
		} while (retryNum == 1);

		//プログラムの終了を告げる
		System.out.println("素数判定プログラムを終了しました。");

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}
}
