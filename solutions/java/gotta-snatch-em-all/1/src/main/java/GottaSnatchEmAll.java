import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String > deck = new HashSet<>(cards);
        return deck;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {

        Set<String> commonDeck = allCards(collections);

        for (int index = 0; index < collections.size(); index++){
            commonDeck.retainAll(collections.get(index));

        }

        return commonDeck;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allDecks = new HashSet<>();
        for (int index = 0; index < collections.size(); index++){
            allDecks.addAll(collections.get(index));
        }
        return allDecks;
    }
}
