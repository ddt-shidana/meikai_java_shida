package ensyu03_08;

//乱数取得準備
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 * 
 * 問題:演習3-8 p69<br>
 * 	キーボードから読み込んだ点数に応じて、成績を判定して表示するプログラムを作成せよ。判定は以下のように行うこと。
 * 	0~59 不可 / 60~69 可 / 70~79 良 / 80-100 優"<br>
 *
 * 作成日:2022/03/03<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_08 {

	public static void main(String[] args) {

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//点数を入力値から取得
		System.out.println ("点数:");
		int score = stdIn.nextInt();

		//0～100点で優/良/可/不可を判定する
		//入力した点数が0～100に収まっていない場合
		if (score < 0 || score > 100)
			//コメント出力「点数は0～100点で入力してください。」
			System.out.println("点数は0～100点で入力してください。");

		//入力した点数が0～100の場合、4段階で判定
		else
			//scoreが0～59のとき
			if (score >=0 && score < 60) {
				//コメント出力「不可」
				System.out.println ("不可");
			}
			//scoreが60～69のとき
			else if (score >=60 && score < 70)	{
				//コメント出力「可」
				System.out.println ("可");
			}
			//scoreが70～79のとき
			else if (score >=70 && score < 80) {
				//コメント出力「良」
				System.out.println ("良");
			}
			//scoreが80～100のとき
			else {
				//コメント出力「優」
				System.out.println ("優");
			}
		
		//scannerのインスタンスをクローズ
		stdIn.close();

	}

}
