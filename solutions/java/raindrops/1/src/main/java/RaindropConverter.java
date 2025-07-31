class RaindropConverter {

    private final String [] rainDropSounds = {"Pling", "Plang", "Plong"};

    String convert(int number) {
        StringBuilder rainDrops = new StringBuilder();
        for (int i = 0 , d = 3; i < 3 ; i++ , d += 2) {
            if (number % d == 0) {
                rainDrops.append(rainDropSounds[i]);
            }
        }
        return (rainDrops.isEmpty() ? Integer.toString(number) : rainDrops.toString());
    }
    
}
