class SpaceAge {

    private final double seconds;

    public enum PLANETS_ORBITAL_PERIOD {
        MERCURY(0.2408467),
        VENUS(0.61519726),
        EARTH(1.0),
        MARS(1.8808158),
        JUPITER(11.862615),
        SATURN(29.447498),
        URANUS(84.016846),
        NEPTUNE(164.79132);

        private final double orbitalPeriodInEarthYear;

        PLANETS_ORBITAL_PERIOD(double orbitalPeriodInEarthYear) {
            this.orbitalPeriodInEarthYear = orbitalPeriodInEarthYear;
        }
        public double getOrbitalPeriodInEarthYear() {
            return orbitalPeriodInEarthYear;
        }

        public double getOrbitalPeriodInEarthSeconds() {
            return orbitalPeriodInEarthYear * 31_557_600;
        }
    }


    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return getSeconds() / PLANETS_ORBITAL_PERIOD.EARTH.getOrbitalPeriodInEarthSeconds();
    }

    double onMercury() {
        return getSeconds() / PLANETS_ORBITAL_PERIOD.MERCURY.getOrbitalPeriodInEarthSeconds();
    }

    double onVenus() {
        return getSeconds() / PLANETS_ORBITAL_PERIOD.VENUS.getOrbitalPeriodInEarthSeconds();
    }

    double onMars() {
        return getSeconds() / PLANETS_ORBITAL_PERIOD.MARS.getOrbitalPeriodInEarthSeconds();
    }

    double onJupiter() {
        return getSeconds() / PLANETS_ORBITAL_PERIOD.JUPITER.getOrbitalPeriodInEarthSeconds();
    }

    double onSaturn() {
        return getSeconds() / PLANETS_ORBITAL_PERIOD.SATURN.getOrbitalPeriodInEarthSeconds();
    }

    double onUranus() {
        return getSeconds() / PLANETS_ORBITAL_PERIOD.URANUS.getOrbitalPeriodInEarthSeconds();
    }

    double onNeptune() {
        return getSeconds() / PLANETS_ORBITAL_PERIOD.NEPTUNE.getOrbitalPeriodInEarthSeconds();
    }

}
