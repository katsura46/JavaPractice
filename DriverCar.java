public class DriverCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setNo(2525);
		
		c1.run(30);
		
		c1.display();
		
		//System.out.println("番号は" + c1.no + "で、速度は" + c1.speed + "kmです。");
		
		c1.stop();
		
		c1.display();
	}

}
