class ResistorColor {

    private final String [] reistorsColors = {"black", "brown", "red", "orange", "yellow", 
                                "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        for (int index = 0; index < reistorsColors.length; index++) {
            if (reistorsColors[index].equals(color)) { return index;}
        }
        return -1;
    }

    String [] colors() {
        return reistorsColors;
    }
}
