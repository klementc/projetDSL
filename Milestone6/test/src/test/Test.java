package test;

public class Test {
	public static class Animal{
		public void eat(Food f) {
			System.out.println("animal");
		}
	}

	public static class Food{
		
	}
	public static class Grass extends Food{
		
	}
	public static class Cow extends Animal{
		public void eat(Grass f) {
			System.out.println("grass cow");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Animal a = new Cow();
	    a.eat(new Grass());
		
	}

}
