/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習1-1 p13
 * 	プログラム中の文の終端を示すセミコロン;が欠如しているとどうなるか。
 * 	プログラムをコンパイルして検証せよ。
 * 回答:
 * 	「ワークスペースでエラー」とポップアップが表示され、実行されない。
 * 理由:
 * 	文は原則セミコロンで終わるにもかかわらず、セミコロンが欠けていた為。
 *
 * パッケージ名:ensyu1_1
 * クラス名:Ensyu1_1
 * 作成日:2022/02/22
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu1_1;

public class Ensyu1_1 {
//ここからクラスの内容

	public static void main(String[] args) {
	//ここからメインメソッド
		//文末のセミコロンをわざと省略した命令文を用意する。
		System.out.println("セミコロンが欠如しているとどうなるか")

	//ここまでメインメソッド
	}

//クラスの内容ここまで
}
