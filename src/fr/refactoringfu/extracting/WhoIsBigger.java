package fr.refactoringfu.extracting;

public class WhoIsBigger {
	
	// REFACTO: 24. Generalize declared type (cursor on instances)
	
	private Horse animal;
	private Elephant secondAnimal;
	
	public static void main(String[] args) {
		Horse horse = new Horse();
		Elephant elephant = new Elephant();

		WhoIsBigger whoIsBigger = new WhoIsBigger(horse, elephant);
		
		whoIsBigger.whoIsHeavier();
		whoIsBigger.whoIsTaller();
	}
	
	public WhoIsBigger(Horse horse, Elephant elephant) {
		super();
		this.animal = horse;
		this.secondAnimal = elephant;
	}

	public String whoIsHeavier() {
		if(animal.getWeight() > secondAnimal.getWeight()) {
			return animal.getName();
		} else return secondAnimal.getName();  
	}
	

	public String whoIsTaller() {
		if(animal.getSize() > secondAnimal.getSize()) {
			return animal.getName();
		} else return secondAnimal.getName();  
	}
	
	
}
