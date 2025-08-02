import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    private final List<String> proteins = new ArrayList<>();
    private final List<String> codons = new ArrayList<>();

    List<String> translate(String rnaSequence) throws IllegalArgumentException {
        if (rnaSequence.length() > 3 && rnaSequence.length() < 6) 
                throw new IllegalArgumentException("Invalid codon");
            
        rnaToCodons(rnaSequence);
        for (String codon : codons) {
            switch (codon) {
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


    private void rnaToCodons(String rnaSequence) {
        int validStrandSize = rnaSequence.length() - (rnaSequence.length() % 3);
        for (int index = 0; index < validStrandSize; index += 3) {
            codons.add(rnaSequence.substring(index, index + 3));
        }
    }


}
