package td1.original.api.general;

public class Cheddar implements FoodProduct {
    // 400 kcal / 100g

    private double weight;
    private double BASE_PRICE = 4;
    private double KCAL_PER_HUNDRED = 400;

    public Cheddar(double weight) {
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public String toString() {
        return String.format("cheddar (%.0fg) -- %.2f€", weight(), price());
    }

    @Override
    public double calories() {
        return 0;
    }

    @Override
    public double calorie_per_100g() {
        return 0;
    }
}
