class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


class Warrior extends Fighter {

    
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return (fighter.isVulnerable() ? 10 : 6);
    }

}


class Wizard extends Fighter {
    
    private boolean vulnerableStatus = true;

    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    public boolean isVulnerable() {
        return vulnerableStatus;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return (!isVulnerable() ? 12 : 3);
    }
    
    public void prepareSpell() {
        vulnerableStatus = false;
    }

}
