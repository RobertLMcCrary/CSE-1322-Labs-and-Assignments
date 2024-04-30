class Caterpie extends Pokemon {
    Caterpie(int level) {
        super(level, 0.5);
    }

    @Override
    public String toString() {
        return ("A level " + this.getLevel() + " Caterpie");
    }
}