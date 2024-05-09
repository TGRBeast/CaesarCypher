public class CaesarCipher {
    private static final int ALPHABET_SIZE = 26;
    public static String encrypt(String message, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shifted = (char) (((ch - base + shift) % ALPHABET_SIZE) + base);
                encrypted.append(shifted);
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }
    public static String decrypt(String encrypted, int shift) {
        return encrypt(encrypted, ALPHABET_SIZE - shift);
    }
}
//Side note: decryption is reverse of encryption with opposite shift
