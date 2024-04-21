public class OrderTest {
    public static void main(String[] args) {
        OrderCalculator total = new Calculator();
        OrderDetails place = new Placer();
        InvoiceGenerator invoice = new Invoice();
        EmailNotifier notify = new Notification();

        OrderProcessor order = new OrderProcessor(total, place, invoice, notify);
        order.process(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}