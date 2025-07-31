class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        double sum = 0;
        for (int n = 1; n < input + 1; n++) {
            sum += n;
        }
        return (int) Math.pow(sum, 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int n = 0; n < input + 1; n++) {
            sum += Math.pow(n, 2);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input); 
    }

}
