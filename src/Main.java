public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float BMI = service.calculate(50.55F, 160.55F);
        System.out.printf("%.2f",BMI);
    }
}