
public class FreePractice32 {
	public static void main(String[] args) {
		int totalNum = 0;
		
		for(int i = 0; i < 10; i++) {
			int num = Integer.parseInt(args[i]);
			totalNum += num;
		}
		System.out.println("入力された10個の数値の平均値は（" + totalNum / 10 + "）です");
	}

}
