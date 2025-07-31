import java.util.*;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;


    int ability(List<Integer> scores) {
        int min = scores.stream().min(Integer::compareTo).get();
        int score = 0;
        for (Integer integer : scores) {
            score += integer;
        }
        return score - min;
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        Random rollDice = new Random();
        for (int i = 0; i < 4; i++) {
            rolls.add(rollDice.nextInt(1,7));
        }
        return rolls;
    }

    int modifier(int input) {
        return Math.floorDiv((input - 10), 2);
    }

    int getStrength() {
        if (strength == 0) {
            strength = ability(rollDice());
        }
        return strength;
    }

    int getDexterity() {
        if (dexterity == 0) {
            dexterity = ability(rollDice());
        }
        return dexterity;
    }

    int getConstitution() {
        if (constitution == 0) {
            constitution = ability(rollDice());
        }
        return constitution;
    }

    int getIntelligence() {
        if (intelligence == 0) {
            intelligence = ability(rollDice());
        }
        return intelligence;
    }

    int getWisdom() {
        if (wisdom == 0) {
            wisdom = ability(rollDice());
        }
        return wisdom;
    }

    int getCharisma() {
        if (charisma == 0) {
            charisma = ability(rollDice());
        }
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
