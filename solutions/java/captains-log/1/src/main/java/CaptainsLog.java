import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int index= random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[index];
    }

    String randomShipRegistryNumber() {
        int registerNumber = random.nextInt(1000, 10000);
        return "NCC-" + registerNumber;
    }

    double randomStardate() {
        double starDate = random.nextDouble(41000, 42000);
        return starDate;
    }
}