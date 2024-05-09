import java.util.Scanner;
public class Decryptor {
    private static final int ALPHABET_SIZE = 26;
    public void decryptMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a message: ");
        String encrypted = scanner.nextLine();
        //Goes thry all possible shifts (0 to 25)
        for (int shift = 0; shift < ALPHABET_SIZE; shift++) {
            String decrypted = decrypt(encrypted, shift);
            //Shows them all
            System.out.println("Shift " + shift + ": " + decrypted);
        }
        scanner.close();
    }
    private String decrypt(String encrypted, int shift) {
        //See encrypt for explanation
        StringBuilder decrypted = new StringBuilder();
        for (char ch : encrypted.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shifted = (char) (((ch - base - shift + ALPHABET_SIZE) % ALPHABET_SIZE) + base);
                decrypted.append(shifted);
            } else {
                decrypted.append(ch);
            }
        }
        return decrypted.toString();
    }
}
