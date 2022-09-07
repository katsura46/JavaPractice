// じゃんけん
public class FreePractice31 {
	public static void main(String[] args) {
		
		// パソコンの手
		String[] comHand = {"グー","チョキ","パー"};
		int num = (int)(Math.random() * comHand.length);
		System.out.println("パソコンが出したのは（" + comHand[num] + "）です。");
		
		// 自分の手
		int hand = Integer.parseInt(args[0]);
		
		if(hand == 0) {
			System.out.println("あなたが出したのは（グー）です。");
		}else if(hand == 1){
			System.out.println("あなたが出したのは（チョキ）です。");
		}else if(hand == 2){
			System.out.println("あなたが出したのは（パー）です。");
		}else {
			System.out.println("無効の数字です。[１（グー）],[２（チョキ）],[３（パー）]のいずれかの数字を入力してください。");
		}
		
		if(hand == num) {
			System.out.println("上記により結果はあいこです");
		}else if(hand == 0 && num == 0 || hand == 1 && num == 2 || hand == 2 && num == 0 ) {
			System.out.println("上記により結果はあなたの勝ちです");
		}else if(hand == 0 && num == 2 || hand == 1 && num == 0 || hand == 2 && num == 1 ) {
			System.out.println("上記により結果はあなたの負けです");
	    }
		
	}
}
