package Inheritance.multilevel;

public class Test {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		a.battery = "5000mh";
		a.playSongs();
		a.charge();
		a.info();

		
		Samsung s = new Samsung();
		s.battery = "4000mh";
		s.brandName = "Samsung";
		s.playSongs();
		s.charge();
		s.info();

	}

}
