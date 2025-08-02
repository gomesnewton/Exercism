import java.util.ArrayList;

public class ResistorColorTrio {

    private final String [] resistorColor = {"black", "brown", "red", "orange", "yellow", 
                                             "green", "blue", "violet", "grey", "white"};
    private ArrayList<Integer> codes = new ArrayList<>();

    
    private void searchValues(String [] colors) {

        for(String color : colors) {
            for (int code = 0; code < resistorColor.length; code++) {

                if (color.equals(resistorColor[code])) { codes.add(code); }
            }
        }
    }


    public double calcOhms(String [] colors) {
        searchValues(colors);
        double ohms = (codes.get(0) * 10) + codes.get(1);
        double multiplier = Math.pow(10, codes.get(2));
        return (ohms * multiplier);
    }


    String label(String[] colors) {
        String label = "ohms";
        double exp = 0;
        double ohm = calcOhms(colors);

        if (codes.get(2) > 8) {
            exp = 9;
            label = "gigaohms";
        } else if (codes.get(2) > 5 && codes.get(2) < 9) {
            exp = 6;
            label = "megaohms";
        } else if (codes.get(2) > 1 && codes.get(2) < 5){
            exp = 3;
            label = "kiloohms";
        }
        
        return String.format("%.0f %s", (ohm / Math.pow(10, exp)), label);

    }
}

