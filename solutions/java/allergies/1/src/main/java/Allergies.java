import java.util.ArrayList;
import java.util.List;

class Allergies {
    private final List<Allergen> allergenList = new ArrayList<>();
    
    Allergies(int score) {
        for (int i = 0; i < 8; i++) {
            switch (score & 1 << i) {
                case 1 -> allergenList.add(Allergen.EGGS);
                case 2 -> allergenList.add(Allergen.PEANUTS);
                case 4 -> allergenList.add(Allergen.SHELLFISH);
                case 8 -> allergenList.add(Allergen.STRAWBERRIES);
                case 16 -> allergenList.add(Allergen.TOMATOES);
                case 32 -> allergenList.add(Allergen.CHOCOLATE);
                case 64 -> allergenList.add(Allergen.POLLEN);
                case 128 -> allergenList.add(Allergen.CATS);
            }
        }
    }

    
    boolean isAllergicTo(Allergen allergen) {
        return allergenList.contains(allergen);
    }

    
    List<Allergen> getList() {
        return allergenList;
    }
}
