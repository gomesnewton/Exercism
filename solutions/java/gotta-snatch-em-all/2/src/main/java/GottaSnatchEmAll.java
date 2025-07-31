import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String > blorkemonCardsDeck = new HashSet<>(cards);
        return blorkemonCardsDeck;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonBlorkemonCards = allCards(collections);
        for (int index = 0; index < collections.size(); index++){
            commonBlorkemonCards.retainAll(collections.get(index));
        }
        return commonBlorkemonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allBlorkemonCards = new HashSet<>();
        for (int index = 0; index < collections.size(); index++){
            allBlorkemonCards.addAll(collections.get(index));
        }
        return allBlorkemonCards;
    }
}
