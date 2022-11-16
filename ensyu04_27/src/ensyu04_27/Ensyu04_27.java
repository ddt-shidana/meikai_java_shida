package ensyu04_27;

//乱数取得準備のためimport
import java.util.Random;
//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-27 p132<br>
 * 	List4-3の数当てゲームのプレイヤーが入力できる回数に制限を設けたプログラムを作成せよ。
 * 	制限回数内に当てられなかった場合は、正解を表示してゲームを終了すること。<br>
 *
 * 作成日:2022/02/28<br>
 * 修正日:2022/11/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_27 {

	public static void main(String[] args) {

		//ゲーム開始の合図
		System.out.println("数当てゲーム開始！！");

		//randに乱数を初期設定
		Random randomInstance = new Random();

		//standardInputにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		//繰り返しプログラムを行うための変数を用意
		int retryNumber;

		//retryNumが1のとき繰り返す
		do {
			//0～99の中から乱数を生成しておく
			int answerInt = randomInstance.nextInt(100);

			//ルール説明
			System.out.println("0～99のどれかの数を5回以内に当ててください");

			//入力値を格納する変数を用意
			int inputInt;

			//数当てゲームのラベル
			Outer:
				//挑戦制限回数：challengeIndex 内でゲーム
				for (int challengeIndex = 1; challengeIndex <= 5; challengeIndex++) {
					
					//数当て挑戦回数を表示させる
					System.out.print("いくつかな？(" + challengeIndex + "回目）:");
					
					//inputIntに入力値を代入する
					inputInt = standardInput.nextInt();

					//入力値が answerInt より小さかった場合
					if (inputInt > answerInt) {
						
						//5回以内に正解できなければ
						if (challengeIndex == 5) {
							//正解を表示させ、
							System.out.println("残念！ 正解は・・・" + answerInt + "でした。");
							//ゲーム終了
							break Outer;
						}
						
						//挑戦回数がまだ残っている間はヒントを表示
						System.out.println("もっと小さな数だよ。");
						continue Outer;
					}
					
					//入力値が answerInt より大きかった場合
					else if (inputInt < answerInt) {
						
						//5回以内に正解できなければ、ゲーム終了
						if (challengeIndex == 5) {
							//正解を表示させ
							System.out.println("残念！ 正解は・・・" + answerInt + "でした。");
							//ゲーム終了
							break Outer;
						}
						
						//挑戦回数がまだ残っている間はヒントを表示
						System.out.println("もっと大きな数だよ。");
						continue Outer;
					}

					//生成した乱数と入力値が同じだった場合
					System.out.println("正解です。");
					break Outer;
				}

			//retryNumは0か1
			do {
				System.out.println("もう一度？ YES・・・1/NO・・・0");
				retryNumber = standardInput.nextInt();
			//0と1以外が入力されたら聞き直す
			} while (retryNumber < 0 || retryNumber > 1);
		
		//retryNuberが1の時はゲームをもう一度行う
		} while (retryNumber == 1);

		//プログラムの終了を告げる
		System.out.println("数当てゲームを終了しました");

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}