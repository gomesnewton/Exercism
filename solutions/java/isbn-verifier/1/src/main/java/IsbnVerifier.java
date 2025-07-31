import java.util.ArrayList;
import java.util.List;

class IsbnVerifier {
    private static final String REGEX_CHECKDIGIT = "([-0-9X]{13}|[0-9X]{10})";
    public final List<Integer> ISBN = new ArrayList<>();

    boolean isValid(String stringToVerify) {
        if (stringToVerify.matches(REGEX_CHECKDIGIT)) {
            return validityFormula(stringToVerify);
        } else {
            return false;
        }
    }

    public boolean validityFormula(String stringToVerify) {
        cleanUp(stringToVerify);
        int sum = 0;
        for (int i = 0, j = 10; j > 0; i++, j--) {
            sum += ISBN.get(i) * j;
        }
        return (sum > 0 && sum % 11 == 0);
    }


    public void cleanUp(String stringToVerify) {
        for (String e : stringToVerify.split("")) {
            if (e.matches("[0-9]")) ISBN.add(Integer.parseInt(e));
        }
        if (stringToVerify.matches(REGEX_CHECKDIGIT)) ISBN.add(10);
    }


}
