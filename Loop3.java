
public class Loop3 {
	public static void main(String[] args) {
		int[] score = new int[3];
		
		score[0] = 80;
		score[1] = 90;
		score[2] = 100;
		
		String[] name = {"鈴木", "佐藤", "井上"};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(name[i] + "さんの点数は" + score[i] + "点です。");
		}
		System.out.println("このテストの受験者は" + name.length + "人です。");
	}

}
