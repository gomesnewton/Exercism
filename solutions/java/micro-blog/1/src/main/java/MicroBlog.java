class MicroBlog {

    public String truncate(String input) {
        if (input.length() > 5) {
            int trunc = input.offsetByCodePoints(0, 5);
            return input.substring(0, trunc);
        } else {
            return input;
        }
    }
}
