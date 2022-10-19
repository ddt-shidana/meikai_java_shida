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
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_20 {

	public static void main(String[] args) {
		
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//正方形を表示させるプログラムの開始メッセージを画面表示させる
		System.out.println ("縦横n個の*で正方形を表示させます。");

		//正方形の段数
		int step;

		//段数を聞くブロック
		do {
			//正の整数を入力してもらうため、メッセージを画面表示させる
			System.out.println ("正の整数n:");
			//nに入力値を初期設定
			step = stdIn.nextInt();
			//1以上でないと図形が作成できない為、1未満の場合聞き直す
		} while (step < 1);

		//縦列：変数verticalを1からはじめて、1つずつ増やしながら、n回ループさせる
		for (int vertical = 1; vertical <= step; vertical++) {
			
			//横列：変数besideを1からはじめて、1つずつ増やしながら、n回ループさせる
			for (int beside = 1; beside <= step; beside++) {
				//'*'を表示させる。
				System.out.print('*');
				//横列の'*'間と縦の行間を揃えるために、スペースを追加
				if (beside < step)
					System.out.print(" ");
			}
			//改行
			System.out.println();
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}
