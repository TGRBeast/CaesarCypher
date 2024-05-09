import java.util.Scanner;
public class Encryptor {
    private static final int ALPHABET_SIZE = 26;
    public void encryptMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a message: ");
        String message = scanner.nextLine();
        System.out.print("Whats the shift from 0 to 25: ");
        int shift = scanner.nextInt();
        scanner.nextLine();
        String encrypted = encrypt(message, shift);
        System.out.println("Encrypted message: " + encrypted);
        scanner.close();
    }
    private String encrypt(String message, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                //checks capitalization
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                //Caesar formula I found online that calculated the shifted letter
                char shifted = (char) (((ch - base + shift) % ALPHABET_SIZE) + base);
                encrypted.append(shifted);
            } else {
                //Keeps the same if it isnt a letter
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }
}
