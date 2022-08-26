
public class PracticeTriangle {
	public static void main(String[] args) {
		int height = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		double area;
		
		area = height * width / 2.0; 
		
		System.out.println("この三角形の高さは、" + height + "です。");
		System.out.println("この三角形の底辺は、" + width + "です。");
		System.out.println("この三角形の面積は、" + area + "です。");
	}

}
