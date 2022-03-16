/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習3-8 p69
 * 	キーボードから読み込んだ点数に応じて、成績を判定して表示するプログラムを作成せよ。判定は以下のように行うこと。
 * 	0~59 不可 / 60~69 可 / 70~79 良 / 80-100 優"
 *
 * パッケージ名:ensyu03_08
 * クラス名:Ensyu03_08
 * 作成日:2022/03/03
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */


package ensyu03_08;

//乱数取得準備
import java.util.Scanner;

public class Ensyu03_08 {
//クラス内容ここから

	public static void main(String[] args) {
	//ここからmainメソッド

		//stdInに入力値の取得
		Scanner stdIn = new Scanner (System.in);

		//点数を入力値から取得
		System.out.println ("点数:");
		int score = stdIn.nextInt();

		//0～100点で優/良/可/不可を判定する
		/*入力した点数が0～100に収まっていない場合
		 * コメント出力「点数は0～100点で入力してください。」
		 */
		if (score < 0 || score > 100)
			System.out.println("点数は0～100点で入力してください。");

		//入力した点数が0～100の場合、4段階で判定
		else
			/*scoreが0～59のとき
			 * コメント出力「不可」
			 */
			if (score >=0 && score < 60)
				System.out.println ("不可");
			/*scoreが60～69のとき
			 * コメント出力「可」
			 */
			else if (score >=60 && score < 70)
				System.out.println ("可");
			/*scoreが70～79のとき
			 * コメント出力「良」
			 */
			else if (score >=70 && score < 80)
				System.out.println ("良");
			/*scoreが80～100のとき
			 * コメント出力「優」
			 */
			else
				System.out.println ("優");

		//scannerのインスタンスをクローズ
		stdIn.close();

	//mainメソッドここまで
	}

//クラス内容ここまで
}
