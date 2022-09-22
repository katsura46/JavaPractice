
public class FreePractice34 {
	public static void main(String[] args) {
		int kyozin = 0;
		int hansin = 0;
		
		for(int i = 1; i <= 18; i++) {
			int num = Integer.parseInt(args[i]);
			if(i % 2 == 1) {
				kyozin += num;
				if(i != 1) {
					System.out.println(i - 1 + "回表" + "巨人の得点は" + num + "です。");
				}else {
					System.out.println(i + "回表" + "巨人の得点は" + num + "です。");
				}
			}else {
				hansin += num;
				System.out.println(i - 1 + "回裏" + "阪神の得点は" + num + "です。");
			}
		}
		if(kyozin > hansin) {
			System.out.println("巨人対阪神の試合結果は" + kyozin + "対" + hansin + "で巨人の勝ちです");
		}else if (hansin > kyozin) {
			System.out.println("巨人対阪神の試合結果は" + kyozin + "対" + hansin + "で阪神の勝ちです");
		}else {
			System.out.println("巨人対阪神の試合結果は" + kyozin + "対" + hansin + "で引き分けです");
		}
	}

}

//考え中