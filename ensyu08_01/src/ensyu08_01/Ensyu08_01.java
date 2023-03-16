package ensyu08_01;

/**
 * 『明解Java入門編』柴田望洋<br>
 *
 * 問題:演習9-1 p293<br>
 * 	名前・身長・体重などをメンバとしてもつ《人間クラス》を作成せよ。
 * 	（フィールドやメソッドなどは自分で自由に設計すること）<br>
 *
 * 作成日:2022/03/15<br>
 * 修正日:2023/03/16<br>
 * ver:1.1.0
 * @author ShidaKazuna
 */
class Ensyu08_01 {

	public static void main(String[] args) {

		//安倍晋三のプロフィールを登録
		Human abeshinzou = new Human("安倍晋三", 174, 73);

		//安倍晋三の身長・体重とBMIを表示
		abeshinzou.getProf();
	}
}

/**
 * 人間クラス
 */
class Human {
	
	//名前
	private String name;
	//身長
	private int height;
	//体重
	private int weight;

	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param height 身長
	 * @param weight 体重
	 */
	Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	/**
	 * 氏名を調べる
	 * @return
	 */
	String getName() {
		return name;
	}

	/**
	 * 身長を調べる
	 * @return
	 */
	int getHeight() {
		return height;
	}

	/**
	 * 体重を調べる
	 * @return
	 */
	int getWeight() {
		return weight;
	}

	/**
	 * BMIを調べる
	 * @return bmi
	 */
	float getBMI(){
		//BMI＝体重(小数点)÷身長[cm]（小数点）÷身長[cm]（小数点）
		float bmi = (float)weight / ((float)height / 100) / ((float)height / 100);
		return bmi;
	}

	/**
	 * プロフィールを表示
	 */
	void getProf() {
		//名前の表示
		System.out.println(" 名前：" + name);
		//身長の表示（m）
		System.out.println(" 身長：" + height + "m");
		//体重の表示（kg）
		System.out.println(" 体重：" + weight + "kg");
		//BMIの表示 ※小数点第2位まで
		System.out.printf("  BMI：" + "%.2f\n", getBMI());
	}

}
