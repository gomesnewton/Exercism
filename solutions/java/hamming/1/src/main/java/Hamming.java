public class Hamming {
    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("strands must be of equal length");

        String [] left = leftStrand.split("");
        String [] right = rightStrand.split("");
        for (int i = 0; i < leftStrand.length(); i++) {
            if (!left[i].equals(right[i])) hammingDistance++;
        }
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
