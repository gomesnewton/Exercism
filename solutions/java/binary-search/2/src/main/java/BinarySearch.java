import java.util.List;

class BinarySearch {
    private List<Integer> items;
    
    public BinarySearch(List<Integer> items) {
        this.items = items;
    }

    public int indexOf(int item) throws ValueNotFoundException {
        int before = 0;
        int after = items.size() - 1;
        while (before <= after) {
            int middle = Math.floorDiv(before + after, 2);
            int guess = items.get(middle);

            if (guess == item) return middle;
            if (guess > item) after = middle - 1;
            if (guess < item) before = middle + 1;
        }
        throw new ValueNotFoundException("Value not in array");
    }
}
