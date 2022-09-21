package ensyu03_14;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習3-14 p77<br>
 * 	二つの整数値を読み込んで、
 * 	小さい方の値と大きい方の値の両方を表示するプログラムを作成せよ。
 * 	ただし、二つの整数値が等しい場合は、
 * 「二つの値は同じです。」と表示すること。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu3_14 {

	public static void main(String[] args) {
		
		//stdInにキーボードからの入力値を初期設定
		Scanner stdIn = new Scanner (System.in);

		//使用者がわかりやすいようにナビで「整数a:」と画面表示させる
		System.out.print("整数a:");
		//整数型変数zmax(整数a),を用意し、入力値(stdIn)を初期設定
		int zmax = stdIn.nextInt();
		//使用者がわかりやすいようにナビで「整数b:」と画面表示させる
		System.out.print("整数b:");
		//整数型変数,zmin(整数b)を用意し、入力値(stdIn)を初期設定
		int zmin = stdIn.nextInt();

		//zmax>zminになるように、値の大小比較をし、
		//zmax<zminになっていた場合は、値を入れ替える。
		if (zmax < zmin) {
			//値の入れ替えをする時に使う一時変数tempにzmaxを設定
			int temp = zmax;
			//zmaxには最大値であるzminで上書き
			zmax = zmin;
			//zminは一時保管していたtemp（初期のzmax）で上書き
			zmin = temp;
		}

		//二つの整数が同値の場合、
		if (zmax == zmin) {
			//「二つの値は同じです。」と画面表示させる
			System.out.println("二つの値は同じです。");
		}
		
		//二つの整数値が異なる場合、
		else {
			//最大値と最小値を画面表示させる。
			System.out.println("小さい方の値は" + zmin +
					   "で、大きい方の値は" + zmax + "です。");	
		}

		//newされているので、scannerのインスタンス(stdIn)をクローズ
		stdIn.close();

	}

}