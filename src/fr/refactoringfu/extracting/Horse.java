package fr.refactoringfu.extracting;

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
