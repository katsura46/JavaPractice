
public class FreePractice1 {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		if(num1 * num2 * num3 % 12 == 0 && num1 * num2 * num3 % 13 == 0) {
			System.out.println("12の倍数かつ、13の倍数です");
		}else if(num1 * num2 * num3 % 12 == 0) {
			System.out.println("13の倍数です");
		}else if(num1 * num2 * num3 % 13 == 0) {
			System.out.println("13の倍数です");
		}else {
			System.out.println("12の倍数でも、13の倍数でもありません");
		}
	}

}
