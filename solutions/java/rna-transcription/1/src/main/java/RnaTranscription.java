class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder transcribedRNA = new StringBuilder();
        for (String nucleoide : dnaStrand.split("")) {
            switch (nucleoide) {
                case "A" -> transcribedRNA.append("U");
                case "T" -> transcribedRNA.append("A");
                case "C" -> transcribedRNA.append("G");
                case "G" -> transcribedRNA.append("C");
                case "U" -> transcribedRNA.append("A");
            }
        }
        return transcribedRNA.toString();
    }

}
