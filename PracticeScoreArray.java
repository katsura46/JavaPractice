public class PracticeScoreArray {
	public static void main(String[] args) {
		// 配列を生成
		int data[] = new int[4];
		
		// 配列に値を代入
		data[0] = 90;
		data[1] = 80;
		data[2] = 100;
		data[3] = 90;
		
		// 配列を表示
		System.out.println("1人目は" + data[0] + "点");
		System.out.println("2人目は" + data[1] + "点");
		System.out.println("3人目は" + data[2] + "点");
		System.out.println("4人目は" + data[3] + "点");
		
		System.out.println("このテストを受けた人数は" + data.length + "人です。");
		
	}

}
