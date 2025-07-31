import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {
    private final List<String> proteins = new ArrayList<>();

    
    List<String> getSubSequences(String rnaSequence) {
        if (rnaSequence.length() > 3 && rnaSequence.length() < 6)
            throw new IllegalArgumentException("Invalid codon");
        int cut = rnaSequence.length() % 3;
        List<String> subSequences = new ArrayList<>();
        for (int start = 0, end = 3; start < rnaSequence.length() - cut; start += 3, end += 3) {
            subSequences.add(rnaSequence.substring(start, end));
        }
        return  subSequences;
    }


    List<String> translate(String rnaSequence) throws IllegalArgumentException {
        List<String> subSequences = getSubSequences(rnaSequence);
        for (String sequence : subSequences) {
            switch (sequence) {
                case "AUG" -> proteins.add("Methionine");
                case "UUU", "UUC" -> proteins.add("Phenylalanine");
                case "UUA", "UUG" -> proteins.add("Leucine");
                case "UCU", "UCC", "UCA", "UCG" -> proteins.add("Serine");
                case "UAU", "UAC" -> proteins.add("Tyrosine");
                case "UGU", "UGC" -> proteins.add("Cysteine");
                case "UGG" -> proteins.add("Tryptophan");
                case "UAA", "UAG", "UGA" -> { return proteins; }
                default -> throw new IllegalArgumentException("Invalid codon");
            }
        }
        return proteins;
    }

}