import java.util.ArrayList;

class ResistorColorDuo {
    private final String [] resistorColor = {"black", "brown", "red", "orange","yellow",
                                             "green", "blue", "violet", "grey", "white"};

    private ArrayList<Integer> codes = new ArrayList<>();

    private void searchValues(String [] colors) {

        for(String color : colors) {
            for (int code = 0; code < resistorColor.length; code++) {
                if (color.equals(resistorColor[code])) { codes.add(code); }
            }
        }
    }


    int value(String[] colors) {
        searchValues(colors);
        int value = (codes.get(0) * 10) + codes.get(1);
        return value;

    }
}


