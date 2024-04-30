
public class Spanish extends Language {
    @Override
    public String make_guess() {
        return "Adivina un numero";
    }

    @Override
    public String too_low() {
        return "Demasiado bajo";
    }

    @Override
    public String too_high() {
        return "Demasiado alto";
    }

    @Override
    public String correct() {
        return "Correcto";
    }
}
