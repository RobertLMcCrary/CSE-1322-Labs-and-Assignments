class Pokemon {
    private int level;
    private double baseCatchRate;

    Pokemon(int level, double baseCatchRate) {
        this.level = level;
        this.baseCatchRate = baseCatchRate;
    }

    public int getLevel() {
        return this.level;
    }

    public double getBaseCatchRate() {
        return this.baseCatchRate;
    }
}
