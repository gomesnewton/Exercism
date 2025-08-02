class NeedForSpeed {
    final int speed;
    final int batteryDrain;
    private int batteryPercentage = 100;
    private int distanceDriven;
    
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return !(batteryPercentage >= batteryDrain) || !(batteryPercentage > 0);
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distanceDriven += this.speed;
            this.batteryPercentage -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed FastAndFurious = new NeedForSpeed(50, 4);
        return FastAndFurious;
    }
}


class RaceTrack {
    private final int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return (this.distance % car.speed == 0) && (this.distance % car.batteryDrain == 0);
    }

    
}
