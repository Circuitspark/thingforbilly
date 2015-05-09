package shifter;

import java.util.Scanner;

public class Menu {
	
	public static void main(String args[]) {
		
		Scanner option = new Scanner(System.in);
		Scanner encrypt = new Scanner(System.in);
		Scanner decrypt = new Scanner(System.in);
		
		boolean choosing = true;
		int key;
		char chosen;
		String msg;
		String output;
		boolean encrypting = false;
		boolean decrypting = false;
		boolean quiting = false;
		boolean checking = true;
		boolean wrong_input = true;
		
		while (choosing == true) {
			System.out.println("What would you like to do?");
			System.out.println("(E)ncrypt");
			System.out.println("(D)ecrypt");
			System.out.println("(Q)uit");
			chosen = option.next().charAt(0);
			choosing = false;
			
			while (checking == true) {
				if (chosen == 'E' || chosen == 'e') {
					encrypting = true;
					wrong_input = false;
				}
				if (chosen == 'D' || chosen == 'd') {
					decrypting = true;
					wrong_input = false;
				}
				if (chosen == 'Q' || chosen == 'q') {
					quiting = true;
					wrong_input = false;
				}
				if (wrong_input == true) {
					System.out.println("Wrong input.");
				}
				checking = false;
			}
		}
		
		while (encrypting == true) {
			System.out.print("Please enter the text you wish to encode:");
			msg = encrypt.nextLine();
			System.out.print("Please enter the encoding key you wish to use:");
			key = encrypt.nextInt();
			output= Changer.cipher(msg, key);
			System.out.print(output);
			encrypting = false;
		}
		
		while (decrypting == true){
			System.out.print("Please enter the text you wish to decode:");
			msg = decrypt.nextLine();
			System.out.print("Please enter the key you wish to try to decode the text with:");
			key = -1 * decrypt.nextInt();
			output= Changer.cipher(msg, key);
			System.out.print(output);
			decrypting = false;
		}	
		
		while(quiting == true){
			System.out.print("Goodbye");
			quiting = false;
		}
		
		option.close();
		encrypt.close();
		decrypt.close();
	}
}