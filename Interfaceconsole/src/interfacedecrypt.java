import java.util.Scanner;

public class interfacedecrypt {
	
	public static void main(String args[]) {
		
		Scanner option = new Scanner(System.in);
		Scanner encrypt = new Scanner(System.in);
		Scanner decrypt = new Scanner(System.in);
		
		boolean choosing = true;
		int key;
		char chosen;
		String msg;
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
			/*Put code here for calculating encryption
			 *delete the next print, just there to confirm stuff worked.
			 */
			System.out.print("Your text to be encrypted is " + msg + " and the key you wish to use is " + key + " but there is no code to calculate this, please write the code.");
			encrypting = false;
		}
		
		while (decrypting == true){
			System.out.print("Please enter the text you wish to decode:");
			msg = decrypt.nextLine();
			System.out.print("Please enter the key you wish to try to decode the text with:");
			key = decrypt.nextInt();
			/*Put code here for calculating dencryption
			 *delete the next print, just there to confirm stuff worked.
			 */
			System.out.print("Your text to be dencrypted is " + msg + " and the key you wish to use is " + key + " but there is no code to calculate this, please write the code.");
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