class LuhnValidator {
    private static final String VALID_LUHN_FORMAT = "^[ 0-9]{2,}$";

    public boolean isValid(String candidate) {
        return candidate.replaceAll(" ", "").matches(VALID_LUHN_FORMAT) && luhn(candidate.split(""));
    }

    public boolean luhn(String [] candidate) {
        boolean isSecond = false;
        int d = 0, sum = 0;
        for (int i = candidate.length - 1; i >= 0; i--) {
            if (candidate[i].matches("[0-9]")) {
                d = Integer.parseInt(candidate[i]);
                if (isSecond) {
                    sum += ( d * 2 > 9 ? d * 2 - 9 : d * 2);
                } else {
                    sum += d;
                }
                isSecond = !isSecond;
            }
        }
        return (sum % 10 == 0);
    }

}
