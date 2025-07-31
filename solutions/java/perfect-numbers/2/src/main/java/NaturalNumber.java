class NaturalNumber {
    private final int number;

    NaturalNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    }

    Classification getClassification() {
        int aliquotSum = getAliquotSum(number);
        if (aliquotSum > number) return Classification.ABUNDANT;
        if (aliquotSum == number) return Classification.PERFECT;
        return Classification.DEFICIENT;
    }

    int getAliquotSum(int number) {
        int aliquotSum = 0;
        for (int divisor = 1; divisor < number ; divisor++) {
            if (number % divisor == 0)
                aliquotSum += divisor;
        }
        return aliquotSum;
    }

}

