public class FreePractice29 {
	public static void main(String[] args) {
		int totalNum = 0;
		
		for(int i = 0; i < 10; i++) {
			int num = Integer.parseInt(args[i]);
			totalNum += num;
		}
		
		System.out.println("平均値" + (totalNum/10));
	}
}
