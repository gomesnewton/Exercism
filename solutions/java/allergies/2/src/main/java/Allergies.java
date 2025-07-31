import java.util.ArrayList;
import java.util.List;

class Allergies {
    private final List<Allergen> allergenList = new ArrayList<>();

    Allergies(int score) {
        if ((score & 1 << 0) == 1) allergenList.add(Allergen.EGGS);
        if ((score & 1 << 1) == 2) allergenList.add(Allergen.PEANUTS);
        if ((score & 1 << 2) == 4) allergenList.add(Allergen.SHELLFISH);
        if ((score & 1 << 3) == 8) allergenList.add(Allergen.STRAWBERRIES);
        if ((score & 1 << 4) == 16) allergenList.add(Allergen.TOMATOES);
        if ((score & 1 << 5) == 32) allergenList.add(Allergen.CHOCOLATE);
        if ((score & 1 << 6) == 64) allergenList.add(Allergen.POLLEN);
        if ((score & 1 << 7) == 128) allergenList.add(Allergen.CATS);
    }

    boolean isAllergicTo(Allergen allergen) {
        return allergenList.contains(allergen);
    }

    List<Allergen> getList() {
        return allergenList;
    }
}
