import java.util.HashSet;
import java.util.Set;


class IsogramChecker {

    Set<String> lettlers = new HashSet<>();
    
    public boolean isIsogram(String phrase) {
        if (phrase.strip().equals("")) return true;
        
        String upperPhrase = phrase.toUpperCase().replaceAll("-", "").replaceAll(" ", "");
        
        for (String l : upperPhrase.split("")) {
            lettlers.add(l);
        }
        return lettlers.size() == upperPhrase.length();
    }

}
