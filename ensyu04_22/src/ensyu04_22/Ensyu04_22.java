package ensyu04_22;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-22 p125<br>
 * 	n段のピラミッドを表示するプログラムを作成せよ。<br>
 * 	第i行目には（i - 1）* 2 + 1個の'*'記号を表示して、
 * 	最終行である第n行目には（n - 1）* 2 + 1個の'*'記号を表示すること。<br>
 *
 * 作成日:2022/02/25<br>
 * 修正日:2022/11/2<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_22 {

	public static void main(String[] args) {
		
		//standardInputにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//ピラミッド作成プログラムの開始メッセージを画面表示させる
		System.out.println("n段のピラミッドを作成します。");

		//段数stepNumber(>0)変数を用意
		int stepNumber;

		//段数を聞くかたまり
		do {
			//段数nを聞く
			System.out.print("正の整数n:");
			//入力値をstepに格納する
			stepNumber = standardInput.nextInt();
			
		//stepが0以下のとき、図形が作成できない為、聞き直す	
		} while (stepNumber <= 0);

		//縦のループ
		for (int verticalIndex = 1; verticalIndex <= stepNumber; verticalIndex++) {
			
			//横スペース左のループ
			for (int besideSpaceLeftIndex = 1; besideSpaceLeftIndex <= (stepNumber-verticalIndex); besideSpaceLeftIndex++) {
				
				//スペースを表示
				System.out.print("  ");
			}

			//横メインループ
			for (int besideIndex = 1; besideIndex <= ((verticalIndex-1)*2+1); besideIndex++) {
				
				//アスタリスク表示
				System.out.print('*');
				
				//ただし2文字以上並ぶとき、
				if (verticalIndex >= 2) {
					
					//並べる間隔をそろえる為にスペースを追加する
					System.out.print(" ");
				}
			}
			
			//横スペース右のループ
			for (int besideSpaceRightIndex = 1; besideSpaceRightIndex <= (stepNumber-verticalIndex); besideSpaceRightIndex++) {
				
				//スペースの表示
				System.out.print("  ");
				
				//ただし2文字以上並ぶとき、
				if (verticalIndex >= (stepNumber - 2)) {
					//並べる間隔をそろえる為にスペースを追加する
					System.out.print(" ");
				}
			}
			//改行
			System.out.println();

		}

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}
}
