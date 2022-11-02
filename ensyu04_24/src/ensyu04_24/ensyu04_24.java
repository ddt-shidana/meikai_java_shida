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

		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNum;

		//retryNumが1のとき繰り返す
		do {
			//素数判定プログラムの開始メッセージを画面表示させる
			System.out.println("正の整数nが素数であるかどうか判定します。");

			//正の整数nInt(nInt>=3)変数を用意
			int nInt;

			//nIntを決めるかたまり
			do {
				
				//正の整数nIntを聞く
				System.out.print("正の整数n:");
				//nIntに入力値を格納
				nInt = stdIn.nextInt();
				
				//nIntは正の整数なので0未満の場合はエラーメッセージを表示し、
				if (nInt <= 0) {
					System.out.println("正の整数を入力してください。\n");
				}
				
			//聞き直す
			} while (nInt <= 0);

			switch(nInt) {
			case 1:
				System.out.println("素数判定外です。");
				break;
			case 2:
				System.out.println("素数です。");
				break;
			default:
				//nIntを2、3、・・・nIntで割るループ
				for (int divisor = 2; divisor < nInt; divisor++) {

					//t(2<=divisor<n)でnを割り、余りが0になることがあれば素数ではない、
					if (nInt % divisor == 0) {
						System.out.println("素数ではありません");
						break;
					}

					//t(2<=divisor<n)でnを割り、余りが1以上であれば素数である
					else {
						//nInt自身以外で割り切れなかったら素数決定
						if (divisor == nInt - 1) {
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
				retryNum = stdIn.nextInt();
			//retryNumは0か1以外なら聞き直す
			} while (retryNum < 0 || retryNum > 1);
			
			//改行
			System.out.println();
			
		//retryNumが1の間プログラムを繰り返す
		} while (retryNum == 1);

		//プログラムの終了を告げる
		System.out.println("素数判定プログラムを終了しました。");

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	}
}
