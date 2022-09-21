package ensyu04_01;

import java.util.InputMismatchException;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-1 p95<br>
 * 	読み込んだ整数値の符号を判定するList3-5のプログラムを好きなだけ何度でも
 * 	繰り返して入力・表示できるようにしたプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/21<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_01 {

	public static void main(String[] args) {
		
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//doメソッドの処理を繰り返すかどうかの判定用に、整数型変数retryNumを用意
		int retryNum;

		do {
			//使用者がわかりやすいようにナビで「整数値:」と画面表示させる
			System.out.print ("\n整数値:");

			//整数型変数intを用意
			int nInt = 0;
			
			try {
				//nIntにキーボードからの入力値を設定
				nInt = stdIn.nextInt();
			//int型に当てはまらない入力がされたら
			} catch (InputMismatchException e) {
				//エラーの原因をメッセージに出す
				System.out.println("整数値を入力してください。");
				//newされているので、scannerのインスタンス(stdIn)をクローズ
				stdIn.close();
				//エラー内容の出力
				throw e;
			}

			//入力値nIntが正
			if ( nInt > 0 ) {
				System.out.println("その値は正です。");
			}
			//入力値nIntが負
			else if ( nInt < 0 ) {
				System.out.println("その値は負です。");
			}
			//nIntが0
			else {
				System.out.println("その値は0です。");
			}
			

			//retryNumは0か1
			do {
				//再度判定を行うかどうかの確認メッセージを画面表示させる
				//1:Yes 0:No
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				
				try {
					//用意しておいたretryNumに入力値を初期設定
					retryNum = stdIn.nextInt();
					
				//int型に当てはまらない入力がされたら
				} catch (InputMismatchException e) {
					//エラーの原因をメッセージに出す
					System.out.print("0か1を入力してください。");
					//newされているので、scannerのインスタンス(stdIn)をクローズ
					stdIn.close();
					//エラー内容の出力
					throw e;
				}
				
				//retryNumが0か1ではなかったら
				if (retryNum < 0 || retryNum > 1) {
					//再入力を促す
					System.out.println("0か1を入力してください。");
				}
			
			//もう一度聞きなおす
			} while (retryNum < 0 || retryNum > 1);
			

		//入力値が1の時、doメソッドを繰り返す
		}while (retryNum == 1);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}

}
