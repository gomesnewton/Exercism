class SqueakyClean {
    static final String [] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

    static String convertLeetspeakToNormalText(String identifier) {
        String identifierCopy = identifier.replace("4", "a")
                                .replace("3", "e")
                                .replace("1", "l")
                                .replace("0", "o")
                                .replace("7", "t").
                                 replace("¡", "");

        return identifierCopy;
    }


    static String convertKebabCaseToCamelCase(String identifier) {
        String identifierCopy = identifier;
        for (String l : alphabet) {
            identifierCopy = identifierCopy.replaceAll("\\-[%s%S]".formatted(l, l),
                                                       "%S".formatted(l));
        }
        return identifierCopy;
    }


    static String clean(String identifier) {
        String identifierCopy = identifier;
        identifierCopy = convertKebabCaseToCamelCase(identifierCopy);
        identifierCopy = convertLeetspeakToNormalText(identifierCopy);
        identifierCopy = identifierCopy.replaceAll("\\p{Punct}", "");

        return identifierCopy.replace(" ", "_");
    }
}