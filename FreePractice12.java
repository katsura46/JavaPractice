public class FreePractice12 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 3)+1;
		
		if(num == 1) {
			System.out.println("グー");
		}else if(num == 2) {
			System.out.println("パー");
		}else {
			System.out.println("チョキ");
		}
	}
}
