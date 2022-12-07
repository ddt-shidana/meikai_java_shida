package ensyu06_17;

//キーボードからの入力値取得準備するためimport
import java.util.Scanner;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習6-17 p211<br>
 * 	6人の2科目（国語・数学）の点数を読み込んで、科目ごとの平均点、
 * 	学生ごとの平均点を求めるプログラムを作成せよ。<br>
 *
 * 作成日:2022/03/02<br>
 * 修正日:2022/12/07<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
public class Ensyu06_17 {
	
	//科目ごとの平均を求めるときの単位配列
	private final static int[][] SUBJECT_UNITS = {{1, 1, 1, 1, 1, 1}};
	//学生ごとの平均を求めるときの単位配列
	private final static int[][] STUDENT_UNITS = {{1}, {1}};
	//単位数
	private final static int NUMBER_OF_UNIT = 1;
	//人数（行数）
	private static int NUMBER_OF_STUDENT = 6;
	//科目数（列数）
	private static int NUMBER_OF_SUBJECT = 2;

	public static void main(String[] args) {

		//プログラム開始メッセージ
		System.out.println("平均点を求めるプログラムです。");

		//stdInにキーボードからの入力値を初期設定
		Scanner standardInput = new Scanner(System.in);

		/*6人2科目(国語・算数)の点数を取得する
		 * 	配列score[][]に格納・・・6行2列
		 * 	以下のように格納していく
		 * 		1人目…国語の点数,算数の点数
		 * 		2人目…国語の点数,算数の点数
		 * 		3人目…国語の点数,算数の点数
		 * 		…
		 */
		//6人2科目の点数を収納する配列
		int scores[][] = new int[NUMBER_OF_STUDENT][NUMBER_OF_SUBJECT];
		//繰り返しプログラムを行うための変数を用意
		int retryNum = 0;

		//retryNumが1のとき繰り返す
		do {
			System.out.println("点数を入力してください。");
			//人数分繰り返す（行のループ）
			for (int studentIterator = 0; studentIterator < NUMBER_OF_STUDENT; studentIterator++) {
				System.out.println(studentIterator + 1 +"人目の学生");
				//科目数分繰り返す（列のループ）
				for (int subjectIterator = 0; subjectIterator < NUMBER_OF_SUBJECT; subjectIterator++) {
					//国語の点数を初めに聞く
					if(subjectIterator == 0) {
						System.out.print("国語：");
					} 
					//次に算数の点数を聞く
					else {
						System.out.print("算数：");
					}
					scores[studentIterator][subjectIterator] = standardInput.nextInt();
				}
			}

			/*科目ごとの平均点を求める
			 * 	科目ごとの平均点の配列:subject
			 * 	科目用単位配列:subjectU
			 * 	6人2科目の点数の配列:score
			 * 		subject[1][j] = （subjectU[1][i] * score[i][j]）/6
			 */
			//平均点を表示するメッセージを出す
			System.out.println("●科目ごとの平均点は・・・");
			//科目ごとの平均点を格納する配列を用意
			double subjectMatrix[][] = new double[NUMBER_OF_UNIT][NUMBER_OF_SUBJECT];
			//科目ごとの平均を求めるときの単位配列の行のループ
			for (int subjectIterator = 0; subjectIterator < NUMBER_OF_SUBJECT; subjectIterator++) {
				if(subjectIterator == 0) {
					System.out.print("\t国語：");
				} 
				//次に算数の点数を聞く
				else {
					System.out.print("\t算数：");
				}
				
				//加算してゆく値を格納する変数を用意
				double subjectSum = 0;
				//科目ごとの平均を求めるときの単位配列の列のループ
				for (int studentIterator = 0; studentIterator < NUMBER_OF_STUDENT; studentIterator++) {
					//かけあわせたものをたしてゆく
					subjectSum += SUBJECT_UNITS[0][studentIterator] * scores[studentIterator][subjectIterator];
				}
				//平均を出す
				subjectMatrix[0][subjectIterator] = subjectSum / NUMBER_OF_STUDENT;
				//平均点を表示
				System.out.print(String.format("%4.2f\n", subjectMatrix[0][subjectIterator]));
			}

			/*学生ごとの平均点を求める
			 * 	学生ごとの平均点の配列:student
			 * 	科目用単位配列:studentU
			 * 	6人2科目の点数の配列:score
			 * 		student[i][1] = （score[i][j] * studentU[j][1]）/6
			 */
			//平均点を表示するメッセージを出す
			System.out.println("●学生ごとの平均点は・・・");
			//学生ごとの平均点を格納する配列を用意
			double studentMatrix[][] = new double[NUMBER_OF_STUDENT][NUMBER_OF_UNIT];
			//scores行のループ
			for (int studentIterator = 0; studentIterator < NUMBER_OF_STUDENT; studentIterator++) {
				//加算してゆく値を格納する変数を用意
				double studentSum = 0;
				//scores列のループ
				for (int subjectIterator = 0; subjectIterator < NUMBER_OF_SUBJECT; subjectIterator++) {
					//かけ合わせたものをたしてゆく
					studentSum += scores[studentIterator][subjectIterator] * STUDENT_UNITS[subjectIterator][0];
				}
				//2で割って平均を出す
				studentMatrix[studentIterator][0] = studentSum / NUMBER_OF_SUBJECT;
				//平均点を表示
				System.out.print(String.format("\t" + (studentIterator + 1) + "人目の学生：%4.1f\n", studentMatrix[studentIterator][0]));
			}

			//retryNumは0か1
			do {
				System.out.print("もう一度？ YES・・・1/NO・・・0：");
				retryNum = standardInput.nextInt();
			} while (retryNum < 0 || retryNum > 1);

		} while (retryNum == 1);

		//newしたscannerのインスタンスstdInをクローズ
		standardInput.close();

	}

}