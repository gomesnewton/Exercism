
class IsbnVerifier {
    private static final String REGEX_VALIDISBN = "^([-0-9]{12}[0-9X]$|[0-9]{9}[0-9X]$)";

    boolean isValid(String stringToVerify) {
        return stringToVerify.matches(REGEX_VALIDISBN) && validityFormula(stringToVerify);
    }

    public boolean validityFormula(String stringToVerify) {
        int sum = 0;
        int i = 0;
        for (String s : stringToVerify.split("")) {
            if (s.matches("[0-9X]")) {
                sum += (s.equals("X") ? 10 * (10 - i) : Integer.parseInt(s) * (10 - i));
                i++;
            }
        }
        return (sum % 11 == 0);
    }

}
