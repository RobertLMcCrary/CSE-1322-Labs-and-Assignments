import java.util.ArrayList;

class Pokedex {
    private ArrayList<Pokemon> myPokedex = new ArrayList<>();

    public void addToDex(Pokemon pokemon) {
        myPokedex.add(pokemon);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("You have the following pokemon:\n");

        for (Pokemon pokemon : myPokedex) {
            result.append(pokemon.toString()).append("\n");
        }

        return result.toString();
    }
}