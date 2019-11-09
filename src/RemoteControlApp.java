import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		String input = "";

		do {
			greetMessage();
			input = kb.next();

		} while (!input.contentEquals("ON"));

		powerOn();
		pressButtonGreet();
		String buttonPressed = "";

		do {
			buttonPressed = kb.next();
			switch (buttonPressed) {
				case "0":
					pressButton();
					break;
				case "1":
					pressButton();
					break;
				case "2":
					pressButton();
					break;
				case "3":
					pressButton();
					break;
				case "4":
					pressButton();
					break;
				case "5":
					pressButton();
					break;
				case "6":
					pressButton();
					break;
				case "7":
					pressButton();
					break;
				case "8":
					pressButton();
					break;
				case "9":
					pressButton();
					break;
				case "OFF":
					break;
					default: System.out.println("Command not recognized");
			}
		} while (!buttonPressed.equals("OFF"));
		
		if (buttonPressed.contentEquals("OFF")) {
			System.out.println("TURNING OFF");
		}

	}

	public static void greetMessage() {
		System.out.println("To begin, turn on the remote control:");
	}

	public static void powerOn() {
		System.out.println("TURNING ON...");
	}

	public static void pressButton() {
		System.out.println("BOOP!");
	}

	public static void pressButtonGreet() {
		System.out.println("Enter the button number to press: ");
	}

	// TODO: Add pressButton() method
	// TODO: Add turnOn() method

}
//If the user inputs anything other than ON, the initial 
// message repeats until ON is entered.
