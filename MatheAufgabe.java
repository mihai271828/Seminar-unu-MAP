public class MatheAufgabe {
    public double add(double x, double y) {
        return x + y;
    }
    public double sub(double x, double y) {
        return x - y;
    }
    public int mul(double x, double y) {
        int result=0;
        for(int i=0; i<=y; i++) {
            result+=x;
        }
        return result;
    }


}
