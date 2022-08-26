
public class Branch1 {
	public static void main(String[] args) {
		int price = Integer.parseInt(args[0]);
		double rate = 0.10;  //消費税率10％
		int discount, amount;
		
		if( price >= 3000) {  // 値引き額設定
			discount = 300;
		} else if( price >= 2000){
			discount = 200;
		} else {
			discount = 0;
		}
		
		amount = (int)((price - discount) * (1 + rate));
		System.out.println("値引価格は" + discount + "です。");
		System.out.println("税込価格は" + amount + "です。");
	}

}
