class LuhnValidator {
    private static final String VALID_LUHN_FORMAT = "^[ 0-9]{2,}$";

    public boolean isValid(String candidate) {
        String digits = candidate.replaceAll(" ", "");
        return digits.matches(VALID_LUHN_FORMAT) && luhn(digits);
    }

    public boolean luhn(String digits) {
        boolean isSecond = false;
        int sum = 0;
        for (int i = digits.length() - 1; i >= 0; i--) {
            int d = digits.charAt(i) - '0';
            if (isSecond) {
                sum += ( d > 4 ? d * 2 - 9 : d * 2);
            } else {
                sum += d;
            }
            isSecond = !isSecond;
        }
        return (sum % 10 == 0);
    }
}
