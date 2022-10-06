public class FreePractice35 {
	public static void main(String[] args) {
		int bigNum = 0;
		for(int i = 0; i < 10; i++ ) {
			int num = Integer.parseInt(args[i]);
			if( num > bigNum) {
				bigNum = num;
			}
		}
		
		System.out.println(args.length + "回入力されたの数字の内最大の値は" + bigNum + "です。");
	}

}
