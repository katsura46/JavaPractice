public class FreePractice11 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 21)-10;
		
		System.out.println(num);
		
		if(num < 0) {
			System.out.println("負の数です");
		}else if(num > 0){
			System.out.println("正の数です");
		}else {
			System.out.println("0です");
		}
	}

}
