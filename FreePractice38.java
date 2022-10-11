
public class FreePractice38 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("入力した値" + num);
		
		for(int i = 1; i <= num; i++) {
			if(i >= 10) {
				System.out.print(i - 10);
			}else {
				System.out.print(i);
			}
		}
	}

}
