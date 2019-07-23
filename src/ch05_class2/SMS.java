package ch05_class2;

public interface SMS {
	abstract void sendSMS(String message);
	abstract void recive(String message);
	abstract String printSMS();
}
