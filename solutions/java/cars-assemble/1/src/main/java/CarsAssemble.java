public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double rate = 100.0;
        if (speed >= 5 && speed <= 8){
            rate = 90.0;
        } else if (speed > 8 && speed < 10) {
            rate = 80.0;
        } else if (speed >= 10) {
            rate = 77.0;
        }
        return (speed * 221) * (rate / 100);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;

    }
}
