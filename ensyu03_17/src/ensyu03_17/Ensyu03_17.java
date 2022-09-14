package ensyu03_17;

//乱数を生成する準備のためimport
import java.util.Random;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習3-17 p83<br>
 * 	0, 1, 2 のいずれかの値の乱数を生成し、
 * 	0であれば"グー"を、1であれば"チョキを"、2であれば"パー"を
 * 	表示するプログラムを作成せよ。<br>
 *
 * 作成日:2022/02/22<br>
 * 修正日:2022/09/14<br>
 * ver:1.1.0
 * @author ShidaKazuna
 *
 */
public class Ensyu03_17 {

	public static void main(String[] args) {
		
		//randに乱数を初期設定
		Random rand = new Random();

		//整数型変数randHandNumを用意し0,1,2の3つの整数値のいずれかの乱数を初期設定
		int randHandNum = rand.nextInt(3);

		//0～2の乱数値によって、画面表示の文字列を分岐させる
		switch (randHandNum) {
			//0:グー
			case 0 : System.out.println("グー");	break;
			//1:チョキ
			case 1 : System.out.println("チョキ");	break;
			//2:パー
			case 2 : System.out.println("パー");	break;
		}

	}
}
