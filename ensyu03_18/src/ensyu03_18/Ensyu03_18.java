package ensyu03_18;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習3-18 p83<br>
 * 	月を1～12の整数値として読み込んで、
 * 	それに対応する季節を表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 * @see https://eco.mtk.nao.ac.jp/koyomi/wiki/B5A8C0E1.html
 */
public class Ensyu03_18 {

	public static void main(String[] args) {
		
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//使用者がわかりやすいようにナビで
		//「何月の季節が知りたいですが？整数値で入力してください。」と画面表示させる
		System.out.println ("何月の季節が知りたいですが？");
		System.out.print ("整数値で入力してください。:");

		//整数型変数monthを用意して、入力値を初期設定
		int month = stdIn.nextInt();

		//入力した月の整数値(month)の該当季節を画面表示させる
		switch (month) {
			//3～5：気象学的季節「春」、天文学的季節「春分～夏至」
			case 3 :
			case 4 :
			case 5 : 
				System.out.println("気象学的季節「春」");
				System.out.println("天文学的季節「春分～夏至」");
				break;
			//6～8：気象学的季節「夏」、天文学的季節「夏至～秋分」、
			case 6 :
			case 7 :
			case 8 : 
				System.out.println("気象学的季節「夏」");
				System.out.println("天文学的季節「夏至～秋分」");
				break;
			//9～11：気象学的季節「秋」、天文学的季節「秋分～冬至」
			case 9 :
			case 10 :
			case 11 :
				System.out.println("気象学的季節「秋」");
				System.out.println("天文学的季節「秋分～冬至」");
				break;
			//12,1,2:気象学的季節「冬」、天文学的季節「冬至～春分」
			case 12 :
			case 1 :
			case 2 :
				System.out.println("気象学的季節「冬」");
				System.out.println("天文学的季節「冬至～春分」");
				break;
		}

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	}

}