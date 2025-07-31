import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        
        BigInteger bigSquare = BigInteger.ONE;
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        } else { 
            for (int i = 1; i < square; i++) {
                bigSquare = bigSquare.add(bigSquare);
            }
        }
        return bigSquare;
    }

     BigInteger grainsOnBoard() {
        BigInteger grainsOnSquare64 = grainsOnSquare(64);
        BigInteger totalGrainsOnBoard = grainsOnSquare64.multiply(BigInteger.valueOf(2));
        return  totalGrainsOnBoard.subtract(BigInteger.valueOf(1));
    }
}
