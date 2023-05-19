public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 66; // Вес в кг
        double height = 1.79; // Рост в м
        int bmi = service.calculate(weight, height); // Должно получиться 20
        System.out.println(bmi);
    }
}