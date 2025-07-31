class ResistorColor {

    private final String []  RESISTOR_COLOR = {"black", "brown", "red", "orange", "yellow",
                                                "green", "blue", "violet", "grey", "white"};

    String [] colors() {
        return RESISTOR_COLOR;
    }

    int colorCode(String color) {
        for (int index = 0; index < colors().length; index++) {
            if (colors()[index].equals(color)) return index;
        }
        return -1;
    }
}
