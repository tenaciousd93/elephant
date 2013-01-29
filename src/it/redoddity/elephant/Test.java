package it.redoddity.elephant;

public class Test {
	public static void main(String[] args) {
		Elephant e = new Elephant("Dumbo");
		
		assertThat(e.isEmpty());
		e.feed();
		assertThat(!e.isEmpty());
		
	}
	
	private static void assertThat(boolean condition) {
		if(!condition)
			throw new RuntimeException("Mi aspettavo che qualcosa fosse vero, invece e' falso");
	}
}
