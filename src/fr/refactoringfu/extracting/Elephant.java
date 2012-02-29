package fr.refactoringfu.extracting;

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
