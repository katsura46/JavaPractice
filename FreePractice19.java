public class FreePractice19 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10)+1;
		
		System.out.println(num);
		
		int i = 1;
		
		while(i <= num) {
			System.out.print("■");
			i++;
		}
	}
}
