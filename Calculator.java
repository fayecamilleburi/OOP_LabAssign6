public class Calculator implements OrderCalculator {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}
