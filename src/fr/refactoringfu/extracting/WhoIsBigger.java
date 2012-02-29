package fr.refactoringfu.extracting;

public class WhoIsBigger {
	
	public static void main(String[] args) {
		Horse horse = new Horse();
		Elephant elephant = new Elephant();
		whoIsHeavier(horse, elephant);
		whoIsTaller(horse, elephant);
	}
	
	
	public static String whoIsHeavier(Horse animal, Animal secondAnimal) {
		if(animal.getWeight() > secondAnimal.getWeight()) {
			return animal.getName();
		} else return secondAnimal.getName();  
	}
	

	public static String whoIsTaller(Horse animal, Animal secondAnimal) {
		if(animal.getSize() > secondAnimal.getSize()) {
			return animal.getName();
		} else return secondAnimal.getName();  
	}
}
