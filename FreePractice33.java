
public class FreePractice33 {
	public static void main(String[] args) {
		int win = 0;
		int lose = 0;
		for(int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * 2);
			if(num == 0) {
				lose += 1;
			}else {
				win += 1;
			}
		}
		System.out.println("戦績は" + win + "勝" + lose + "敗です。");
	}
}
