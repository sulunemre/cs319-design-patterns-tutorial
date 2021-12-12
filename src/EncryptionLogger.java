public class EncryptionLogger extends LoggerDecorator {
    public EncryptionLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {
        message = encrypt(message);
        super.log(message);
    }

    private String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + 2) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
