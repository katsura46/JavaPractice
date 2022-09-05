public class FreePractice20 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10)+1;
		
		System.out.println(num);
		
		int i = 1;
		
		do {
			System.out.print("■");
			i++;
		}while(i <= num);
	}

}
