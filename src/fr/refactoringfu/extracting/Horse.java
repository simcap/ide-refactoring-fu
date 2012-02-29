package fr.refactoringfu.extracting;

// REFACTO: 16 a. Use Supertype where possible (cursor anywhere in class)
public class Horse implements Animal {

	@Override
	public int getWeight() {
		return 800;
	}

	@Override
	public int getSize() {
		return 220;
	}

	@Override
	public String getName() {
		return "horse";
	}

}
