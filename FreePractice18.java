public class FreePractice18 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10)+1;
		
		System.out.println("数：" + num);
		
		for(int i = 1; i <= num; i++ ){
			System.out.print("■");
		}
		
	}
}
