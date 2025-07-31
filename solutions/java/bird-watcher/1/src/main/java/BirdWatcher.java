
class BirdWatcher {
    
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
         return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }
    
    public boolean hasDayWithoutBirds() {
        for (int countOfTheDay : birdsPerDay)
            if (countOfTheDay == 0) return true;
            
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int firstDays = (numberOfDays > birdsPerDay.length ? birdsPerDay.length : numberOfDays);
        int total = 0;
        for (int count = 0; count < firstDays; count++) {
            total += birdsPerDay[count];
        }
        return total;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int countOfTheDay : birdsPerDay) {
            if (countOfTheDay > 4) busyDays++;
        }
        return busyDays;
    }
}
