public class BmiService {
    public float calculate(float weight, float height) {
        return weight / ((height / 100) * (height / 100));
    }
}