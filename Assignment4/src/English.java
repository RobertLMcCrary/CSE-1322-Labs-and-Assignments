
public class English extends Language {
    @Override
    public String make_guess() {
        return "Guess a number";
    }

    @Override
    public String too_low() {
        return "Too Low";
    }

    @Override
    public String too_high() {
        return "Too High";
    }

    @Override
    public String correct() {
        return "Correct";
    }
}
