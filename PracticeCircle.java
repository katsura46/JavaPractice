public class PracticeCircle {
	public static void main(String[] args) {
		int radius = Integer.parseInt(args[0]);
		double pi = 3.141592;
		double area;
		
		area = radius * radius * pi;
		
		// 少数点第３位以降を切り捨て
		area = (int)(area * 100);
		area = area / 100;
		
		
		System.out.println("半径は" + radius);
		System.out.println("面積は" + area);
	}

}
