public class bCalculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subs(int x, int y) {
        return x - y;
    }

    public int div(int x, int y) {
        if(y != 0) {
            return x / y;
        }

        throw new IllegalArgumentException("Y can not be 0.");
    }
}
