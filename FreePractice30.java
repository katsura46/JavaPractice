// レジ
public class FreePractice30 {
	public static void main(String[] args) {
		int totalPrice = 0;
		int price;
		double zei = 1.10;
		
		for(int i = 0; i < args.length; i++) {
			price = Integer.parseInt(args[i]);
			totalPrice += (price * zei);
		}
		
		System.out.println("購入いただいた商品の品数は（" + args.length + "）点です");
		System.out.println("合計金額は（税込：" + totalPrice + "円）です。");
	}
}
