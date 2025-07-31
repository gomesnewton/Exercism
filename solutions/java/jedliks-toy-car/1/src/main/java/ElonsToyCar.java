public class ElonsToyCar {

    private int drivenDistance;
    private int batteryPercentage = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + drivenDistance + " meters";
    }

    public String batteryDisplay() {

        if (batteryPercentage <= 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPercentage + "%";
        }
    }

    public void drive() {
        if (batteryPercentage == 0) {
            drivenDistance += 0;
        } else {
            drivenDistance += 20;
            batteryPercentage--;    
        }
    }
}