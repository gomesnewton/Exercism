public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = 100.0;
        if (speed >= 5 && speed <= 8){
            successRate = 90.0;
        } else if (speed > 8 && speed < 10) {
            successRate = 80.0;
        } else if (speed >= 10) {
            successRate = 77.0;
        }
        return (speed * 221) * (successRate / 100);
    }

    
    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
