package ensyu04_10;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習4-10 p121<br>
 * 	読み込んだ値が1未満であれば改行文字を出力しないように
 * 	List4-11を書きかえたプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/28<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu04_10 {

	public static void main(String[] args) {
		
		//キーボードから入力できるようにscannerクラスをnew
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何個*を表示しますか：");
		
		//表示する個数
		int nMax = stdIn.nextInt();
		
		//nMax回繰り返す
		for (int i = 1; i <= nMax; i++) {
			//アスタリスク表示
			System.out.print('*');
			
			//最後まで表示したら改行
			if (i == nMax) {
				System.out.println();
			}
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}
}