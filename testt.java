
public class testt {
	public static void main(String[] args) {
		int totalnum = 0;
		int i = 0;
		while(i <= 100) {
			if(i % 3 == 0) {
				totalnum += i;
			}
			i++;
		}
		System.out.println(totalnum);
	}

}
