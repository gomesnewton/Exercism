public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<RemoteControlCar> {

    private int numberOfVictories;
    private int distanceTravelled;

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories += numberOfVictories;
    }

    @Override
    public int compareTo(RemoteControlCar car) {
        if (this.numberOfVictories > car.getNumberOfVictories()) {
            return -1;
        } else if (this.numberOfVictories < car.getNumberOfVictories()) {
            return 1;
        } else {
            return 0;
        }
    }

}