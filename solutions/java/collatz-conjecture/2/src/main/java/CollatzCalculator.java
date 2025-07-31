class CollatzCalculator {
    private int stepCount;
    int computeStepCount(int start) {
        if (start < 1) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        } else if (start > 1) {
            stepCount++;
            computeStepCount((start % 2 == 0 ? start / 2 : 3 * start + 1));
        }
        return stepCount;
    }
}
