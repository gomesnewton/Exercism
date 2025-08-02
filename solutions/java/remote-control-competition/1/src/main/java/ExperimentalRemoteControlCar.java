public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int distanceTravelled;
    private int numberOfVictories;

    public void drive() {
        distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
    
    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }
    

}
