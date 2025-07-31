import java.util.*;

class DnDCharacter {
    private final int strength = ability(rollDice());
    private final int dexterity = ability(rollDice());
    private final int constitution = ability(rollDice());
    private final int intelligence = ability(rollDice());
    private final int wisdom = ability(rollDice());
    private final int charisma = ability(rollDice());
    private final int hitPoints = 10 + modifier(getConstitution());

    int ability(List<Integer> scores) {
        int abilityScore = 0;
        int smallestScore = 7;
        for (Integer score : scores) {
            abilityScore += score;
            smallestScore = Math.min(score, smallestScore);
        }
        return abilityScore - smallestScore;
    }


    List<Integer> rollDice() {
        List<Integer> scores = new ArrayList<>();
        Random rollDice = new Random();
        for (int i = 0; i < 4; i++) {
            scores.add(rollDice.nextInt(1,7));
        }
        return scores;
    }


    int modifier(int input) {
        return Math.floorDiv((input - 10), 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitPoints;
    }
}

