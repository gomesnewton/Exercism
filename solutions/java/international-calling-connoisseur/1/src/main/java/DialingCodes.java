import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private final Map<Integer, String> dictionary = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dictionary;
    }

    public void setDialingCode(Integer code, String country) {
        if (dictionary.containsKey(code)) dictionary.replace(code, country);
        addNewDialingCode(code, country);
    }

    public String getCountry(Integer code) {
        return dictionary.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dictionary.containsKey(code) && !dictionary.containsValue(country)) dictionary.put(code, country);
    }

    public Integer findDialingCode(String country){
        for (Map.Entry entry : dictionary.entrySet()) {
            if (entry.getValue().equals(country)) return (Integer) entry.getKey();
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        dictionary.remove(findDialingCode(country));
        addNewDialingCode(code, country);
    }
}
