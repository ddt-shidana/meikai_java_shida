package ensyu04_20;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-20 p125<br>
 * 	n段の正方形を表示するプログラムを作成せよ。
 * 	右に示すのは、nが3のときの実行結果である。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/11/02<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_20 {

	public static void main(String[] args) {
		
		//standardInputにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//正方形を表示させるプログラムの開始メッセージを画面表示させる
		System.out.println ("縦横n個の*で正方形を表示させます。");

		//正方形の段数
		int stepNumber;

		//段数を聞くブロック
		do {
			//正の整数を入力してもらうため、メッセージを画面表示させる
			System.out.println ("正の整数n:");
			//nに入力値を初期設定
			stepNumber = standardInput.nextInt();
			
		//1以上でないと図形が作成できない為、1未満の場合聞き直す
		} while (stepNumber < 1);

		//縦列のループ
		for (int verticalIndex = 1; verticalIndex <= stepNumber; verticalIndex++) {
			
			//横列のループ
			for (int besideIndex = 1; besideIndex <= stepNumber; besideIndex++) {
				
				//'*'を表示させる。
				System.out.print('*');
				
				//最後のループ処理じゃなければ
				if (besideIndex < stepNumber) {
					//横列の'*'間と縦の行間を揃えるために、スペースを追加
					System.out.print(" ");
				}
			}
			
			//改行
			System.out.println();
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		standardInput.close();

	}
}
