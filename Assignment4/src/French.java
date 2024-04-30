
public class French extends Language {
    @Override
    public String make_guess() {
        return "Devinez un nombre ";
    }

    @Override
    public String too_low() {
        return "Trop bas";
    }

    @Override
    public String too_high() {
        return "Trop haut ";
    }

    @Override
    public String correct() {
        return "Correct";
    }
}
