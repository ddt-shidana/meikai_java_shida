package ensyu04_05;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-5 p105<br>
 * 	List4-5のx--が--xとなっていたら、そのような出力が得られるかを検討せよ。
 * 	プログラムを作成して実行結果を確認すること。<br>
 * 検討:<br>
 * 	--xだとデクリメントされた後の値が出力されるため、期待した結果にならない。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_05 {
	
	public static void main(String[] args) {
		
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner(System.in);

		//カウントダウン開始のメッセージを画面表示させる
		System.out.println("カウントダウンします。");

		//入力値から1ずつ減らして画面表示させるために、整数型変数xを用意
		int xInt;

		do {
		//ここからdoメソッド
			//正の整数値の入力を促すメッセージを画面表示させる
			System.out.print("正の整数値：");

			//xに入力値を代入
			xInt = stdIn.nextInt();

		//xが0以下である間、doメソッドを繰り返す
		} while (xInt <= 0);


		//xが0以上の間、
		while (xInt >= 0) {
			//xの値を表示してデクリメント
			System.out.println(--xInt);
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}

}
