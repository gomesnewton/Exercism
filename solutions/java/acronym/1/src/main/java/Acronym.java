class Acronym {

    private final String originalPhrase;
    private final String regex = "\\b([A-Za-z])";
    
    Acronym(String phrase) {
        this.originalPhrase = phrase;
    }

    
    String get() {
        String acronym = originalPhrase.replaceFirst("['_]", "");
        String [] toRemove = acronym.split(regex);
        
        for (String part : toRemove) {
            acronym = acronym.replaceFirst(part,"");
        }
        
        return acronym.toUpperCase();
    }

    
}
