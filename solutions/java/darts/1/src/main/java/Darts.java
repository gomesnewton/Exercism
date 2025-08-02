class Darts {
    
    int score(double xOfDart, double yOfDart) {
        double x = Math.pow(xOfDart, 2);
        double y = Math.pow(yOfDart, 2);
        double landingPoint = Math.sqrt((x + y));
        
        if (landingPoint > 5.0 && landingPoint <= 10.0) {
            return 1;
        } else if (landingPoint > 1.0 && landingPoint <= 5.0) {
            return 5;
        } else if (landingPoint <= 1.0) {
            return 10;
        }
        return 0;
    }
}