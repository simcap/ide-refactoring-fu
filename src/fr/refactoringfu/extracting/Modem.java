package fr.refactoringfu.extracting;

// REFACTO: 14. Extract super classes (DefaultDataChannel, DefaultConnection)
// REFACTO: 15. Extract interfaces (DataChannel, Connection)

public class Modem {

	public void dial(String phoneNumber) {
	}

	public void hangup() {
	}

	public void send(char c) {
	}
	
	public char receive() {
		return 0;
	}

}
