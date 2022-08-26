public class PracticeArrayBug {
	public static void main(String[] args) {
		String[] name = new String[5];
		
		name[0] = "Aさん";
		name[1] = "Bさん";
		name[2] = "Cさん";
		name[3] = "Dさん";
		name[4] = "Eさん";
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
		System.out.println(name.length);
	}

}
