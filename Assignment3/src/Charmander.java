class Charmander extends Pokemon {
    Charmander(int level) {
        super(level, 0.2);
    }

    @Override
    public String toString() {
        return ("A level " + this.getLevel() + " Charmander");
    }
}
