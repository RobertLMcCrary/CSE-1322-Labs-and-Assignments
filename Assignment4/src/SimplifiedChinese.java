
public class SimplifiedChinese extends Language {
    @Override
    public String make_guess() {
        return "猜一个数字";
    }

    @Override
    public String too_low() {
        return "太低";
    }

    @Override
    public String too_high() {
        return "太高 ";
    }

    @Override
    public String correct() {
        return "正确";
    }
}
