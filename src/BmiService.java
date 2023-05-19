public class BmiService {
    public int calculate (int kilos, double meters) {
        double result;
        result = kilos/(meters*meters);
        return (int) result;
    }
}
