package fr.refactoringfu.extracting;

//REFACTO: 16 b. Use Supertype where possible (cursor anywhere in class)
public class Elephant implements Animal {

	@Override
	public int getWeight() {
		return 6000;
	}

	@Override
	public int getSize() {
		return 350;
	}

	@Override
	public String getName() {
		return "elephant";
	}

}
