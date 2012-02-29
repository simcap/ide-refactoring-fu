package fr.refactoringfu.inline;

// REFACTO: 10. Inline method (remove method technique)
public class InlineMethod {

	public void methodA(){
		methodB();
		methodC();
		boolean isNull = isNull("anything");
	}

	public void methodB(){
		isNull("anything");
	}
	
	public void methodC(){
		isNull("anything");
		methodB();
		
	}
	
	public void methodD(){
		methodC();
		isNull("anything");
	}
	
	public boolean isNull(String value){
		return value == null; 
	}
}
