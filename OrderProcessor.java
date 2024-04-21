public class OrderProcessor {
    private OrderCalculator info;
    private OrderDetails details;
    private InvoiceGenerator invoice;
    private EmailNotifier notification;

    public OrderProcessor(OrderCalculator info, OrderDetails details, InvoiceGenerator invoice, EmailNotifier notification) {
        this.info = info;
        this.details = details;
        this.invoice = invoice;
        this.notification = notification;
    }

    public void process(double price, int quantity, String customerName, String address, String fileName, String email) {
        double total = info.calculateTotal(price, quantity);
        System.out.println("Order Total: $" + total);
        
        details.placeOrder(customerName, address);

        // These methods might not be needed for all orders
        invoice.generateInvoice(fileName);
        notification.sendEmailNotification(email);
    }
}
