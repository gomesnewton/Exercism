import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class HighScores {

    private List<Integer> scoresList;

    public HighScores(List<Integer> highScores) {
        this.scoresList = highScores;
    }

    List<Integer> scores() {
        return scoresList;
    }

    Integer latest() {
        return scoresList.getLast();
    }

    Integer personalBest() {
        return scoresList.stream().max(Integer::compareTo).get();
    }

    List<Integer> personalTopThree() {
        int lastIndex = 3;
        List<Integer> topThree = new ArrayList<>(scoresList);
        topThree.sort(Integer::compareTo);
        if (scoresList.size() < 2) {
            lastIndex = 1;
        } else if (scoresList.size() < 3) {
            lastIndex = 2;
        }
        return topThree.reversed().subList(0, lastIndex);
    }

}
