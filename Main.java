import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Would you like to encrypt or decrypt a message? (E or D) ");
            choice = scanner.nextLine().toUpperCase();
            if (choice.equals("E")) {
                //Creates instance of the encryptor
                Encryptor encryptor = new Encryptor();
                encryptor.encryptMessage();
            } else if (choice.equals("D")) {
                //Creates instance of the decryptor
                Decryptor decryptor = new Decryptor();
                decryptor.decryptMessage();
            } else {
                System.out.println("Hey, that's not right. Please choose 'E' for encrypt or 'D' for decrypt.");
            }
        } while (!choice.equals("E") && !choice.equals("D")); //runs this back when not properly chosen
        scanner.close();
    }
}
