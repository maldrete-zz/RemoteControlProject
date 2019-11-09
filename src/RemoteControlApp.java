import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String input = "";
		
		do {
			greetMessage();
			input = kb.next();
			
			} while(! input.contentEquals("ON"));
		
		powerOn();
			
		}
	
	
	public static void greetMessage() {
		System.out.println("To begin, turn on the remote control:");
	}
	public static void powerOn() {
		System.out.println("TURNING ON...");
	}
	
	
	// TODO: Add pressButton() method
	// TODO: Add turnOn() method

}
//If the user inputs anything other than ON, the initial 
// message repeats until ON is entered.

