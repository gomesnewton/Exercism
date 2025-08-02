class ReverseString {

    String reverse(String inputString) {
        StringBuilder reverseInputString = new StringBuilder(inputString).reverse();
        return reverseInputString.toString();
    }
}
