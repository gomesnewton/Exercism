public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }
    
    public int remainingMinutesInOven(int minutesInTheOven){
        return expectedMinutesInOven() - minutesInTheOven;
    }

    public int preparationTimeInMinutes(int layers){
        return (layers > 2 ? layers *= 2 : 2);
    }

    public int totalTimeInMinutes(int layers, int minutesInTheOven) {
        return preparationTimeInMinutes(layers) + minutesInTheOven;
    }


}
