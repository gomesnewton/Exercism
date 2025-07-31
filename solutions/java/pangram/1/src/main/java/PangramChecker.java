public class PangramChecker {

    private final String [] ALPHABET = "abcdefghijklmnopqrstuvwxyz".split("");

    public boolean isPangram(String input) {
        int count = 0;
        for (String letter : ALPHABET) {
            if (input.toLowerCase().contains(letter)) {
                count++;
            }
        }
        return count == 26;
    }
}