package fr.refactoringfu.extracting;

public class Dialup {

	public Dialup(Modem modem, String phoneNumber){
		modem.dial(phoneNumber);
	}
	
	public void send() {
		Modem modem = new Modem();
		modem.dial("07445678987");
		modem.send('A');
		modem.receive();
		modem.hangup();
	}
	
}
