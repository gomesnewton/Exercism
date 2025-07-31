public class Lasagna {

    //private int minutesInOven = 40;
    
    // define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    
    // define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInTheOven){
        int minutesInOven = 40 - minutesInTheOven;
        return minutesInOven;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int minutesByLayers = 2;
        if (layers > 1) {
            minutesByLayers *= layers;
        }
        return minutesByLayers;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInTheOven) {
        int minutesByLayer = preparationTimeInMinutes(layers);
        int totalTime = minutesInTheOven + minutesByLayer;
        return totalTime;
    }

    
    public static void main(String [] args) {
        
        Lasagna lasagna = new Lasagna();
        lasagna.totalTimeInMinutes(3, 20);
        
    }
}
