package ensyu04_21;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-21 p125<br>
 * 	List4-16は左下側が直角の直角三角形を表示するプログラムであった。<br>
 * 	直角が左上側、右下側、右上側の三角形を表示するプログラムを
 * 	それぞれ作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/10/19<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_21 {

	public static void main(String[] args) {
		
		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//整数型変数patternNumを用意。(0<=patternNum<=2)
		int patternNum;

		//0～2以外の整数が入力された場合、聞き直す。
		do {
			//3通りの直角三角形を表示させるプログラムの開始メッセージを画面表示させる
			System.out.println("3通りのうちの1通りの直角三角形を表示させます。");

			System.out.println("0・・・直角が左上");
			System.out.println("1・・・直角が右下");
			System.out.println("2・・・直角が右上");

			//patternNumに入力値を初期設定
			patternNum = standardInput.nextInt();

		} while (patternNum < 0 || patternNum > 2);


		//直角三角形の段数nはいくつにしますか？と聞く
		System.out.println("直角三角形の段数nはいくつにしますか？");

		//段数stepNumber(>0)変数を用意
		int stepNumber;

		//nが0以下のとき、図形が作成できない為、聞き直す
		do {
			//段数stepNumberを聞く
			System.out.println("正の整数n:");
			//入力値をstepNumberに設定
			stepNumber = standardInput.nextInt();
		
		//0以下だと意味がないので聞き直す
		} while (stepNumber <= 0);


		//patternNumで条件分岐
		switch (patternNum) {
		
		//直角が左上
		case 0:
			//縦列のループ
			for (int verticalIndex = 1; verticalIndex <=stepNumber; verticalIndex++) {
				
				//横列のループ
				for (int besideIndex = 1; besideIndex <= (stepNumber-verticalIndex+1); besideIndex++) {
					
					//'*'を表示させる。
					System.out.print('*');
					
					//横列の'*'間と縦の行間を揃えるために、スペースを追加
					if (besideIndex < (stepNumber-verticalIndex+1))
						System.out.print(" ");
				}
				
				//改行
				System.out.println();
			}	break;
			
		//直角が右下
		case 1:
			//縦のループ
			for (int verticalIndex = 1; verticalIndex <= stepNumber; verticalIndex++) {
				
				//横スペースのループ
				for (int besideSpaceIndex = 1; besideSpaceIndex <= (stepNumber -verticalIndex); besideSpaceIndex++) {
					
					//スペースを表示
					System.out.print("  ");
				}
				
				//横*文字のループ
				for (int besideS = 1; besideS <= verticalIndex; besideS++) {
					
					//'*'を表示させる。
					System.out.print('*');
					
					//ただし2文字以上並ぶとき、
					if (verticalIndex >= 2)
						//並べる感覚をそろえる為にスペースを追加する
						System.out.print(" ");
				}
				//改行
				System.out.println();
			}	break;
			
		//直角が右上
		case 2:
			//縦のループ
			for (int verticalIndex = 1; verticalIndex <= stepNumber; verticalIndex++) {
				
				//横スペースのループ
				for (int besideSpaceIndex = 1; besideSpaceIndex <= (verticalIndex-1); besideSpaceIndex++) {
					
					//スペースを表示
					System.out.print("  ");
				}
				
				//横*文字のループ
				for (int besideStringIndex = 1; besideStringIndex <= (stepNumber -verticalIndex + 1); besideStringIndex++) {
					
					//'*'を表示させる。
					System.out.print('*');
					
					//ただし2文字以上並ぶとき、
					if (verticalIndex < stepNumber)
						
						//並べる感覚をそろえる為にスペースを追加する
						System.out.print(" ");
				}
				
				//改行
				System.out.println();
			}
			break;

		}

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}
}
