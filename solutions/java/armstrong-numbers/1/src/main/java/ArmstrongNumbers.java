class ArmstrongNumbers {

    private int calcArmstrongNumber(int numberToCheck) {
        String parseNumber = Integer.toString(numberToCheck);
        int comparationNumber = 0;        
            for (int i = 0; i < parseNumber.length(); i++) {
                int n = Integer.parseInt(parseNumber, i, i + 1, 10);
                comparationNumber += Math.pow(n, parseNumber.length());
            }
        return comparationNumber;
    }

    
    boolean isArmstrongNumber(int numberToCheck) {
        return calcArmstrongNumber(numberToCheck) == numberToCheck;
    }
}