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
		Scanner stdIn = new Scanner(System.in);

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
			patternNum = stdIn.nextInt();

		} while (patternNum < 0 || patternNum > 2);


		//直角三角形の段数nはいくつにしますか？と聞く
		System.out.println("直角三角形の段数nはいくつにしますか？");

		//段数n(n>0)変数を用意
		int step;

		//nが0以下のとき、図形が作成できない為、聞き直す
		do {
			//段数nを聞く
			System.out.println("正の整数n:");
			step = stdIn.nextInt();
		} while (step <= 0);


		//patternNumで条件分岐
		switch (patternNum) {
		
		//直角が左上
		case 0:
			//縦列：変数verticalを1からはじめて、1つずつ増やしながら、n回ループさせる
			for (int vertical = 1; vertical <=step; vertical++) {
				
				//横列：変数besideをnからはじめて、1つず減らしながら、(n-vertical+1)回ループさせる
				for (int beside = 1; beside <= (step-vertical+1); beside++) {
					
					//'*'を表示させる。
					System.out.print('*');
					
					//横列の'*'間と縦の行間を揃えるために、スペースを追加
					if (beside < (step-vertical+1))
						System.out.print(" ");
				}
				
				//改行
				System.out.println();
			}	break;
			
		//直角が右下
		case 1:
			//縦・・・初期値:1、ループ回数:n、処理内容:verticalを増やす
			for (int vertical = 1; vertical <= step; vertical++) {
				
				//横スペース・・・初期値:n-1、ループ回数:n-vertical、処理内容:besideSを増やす
				for (int besideS = 1; besideS <= (step -vertical); besideS++) {
					
					//スペースを表示
					System.out.print("  ");
				}
				
				//横*文字・・・初期値:1、ループ回数:vertical、処理内容:besideSを増やす
				for (int besideS = 1; besideS <= vertical; besideS++) {
					
					//'*'を表示させる。
					System.out.print('*');
					
					//ただし2文字以上並ぶとき、
					if (vertical >= 2)
						//並べる感覚をそろえる為にスペースを追加する
						System.out.print(" ");
				}
				//改行
				System.out.println();
			}	break;
			
		//直角が右上
		case 2:
			//縦・・・初期値:1、ループ回数:n、処理内容:verticalを増やす
			for (int vertical = 1; vertical <= step; vertical++) {
				
				//横スペース・・・初期値:1、ループ回数:vertical-1、処理内容:besideS増やす
				for (int besideS = 1; besideS <= (vertical-1); besideS++) {
					
					//スペースを表示
					System.out.print("  ");
				}
				
				//横*文字・・・初期値:1、ループ回数:n -vertical + 1、処理内容:besideSを増やす
				for (int besideS = 1; besideS <= (step -vertical + 1); besideS++) {
					
					//'*'を表示させる。
					System.out.print('*');
					
					//ただし2文字以上並ぶとき、
					if (vertical < step)
						
						//並べる感覚をそろえる為にスペースを追加する
						System.out.print(" ");
				}
				
				//改行
				System.out.println();
			};	break;

		}

		//newしたscannerのインスタンスstdInをクローズ
		stdIn.close();

	}
}
