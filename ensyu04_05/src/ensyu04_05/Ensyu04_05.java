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
 * 	減分（増分）演算子は前置か後置で、評価直後に得られる値は異なるが、
 * 	評価後、たとえば今回の場合でいうとxに代入してしまえば、
 * 	最終的な評価の値は同じになるため、
 * 	実行結果は変わらない。<br>
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
			//xを画面表示さた後、
			System.out.println(xInt);
			//xの値を一つ減らす
			--xInt;
		}

		//whileメソッドを抜けた後のxの値を画面表示させる
		//-1であればＯＫ
		System.out.println("xの値：" + xInt);

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}

}
