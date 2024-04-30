class Bulbasaur extends Pokemon {
    Bulbasaur(int level) {
        super(level, 0.2);
    }

    @Override
    public String toString() {
        return ("A level " + this.getLevel() + " Bulbasaur");
    }
}