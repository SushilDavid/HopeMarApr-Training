import java.time.LocalDateTime;

public class Order {
    private int orderNumber;
    private String orderName;
    private Customer customer;
    private OrderStatus status;
    private LocalDateTime createdAt;

    public Order(int orderNumber, String orderName, Customer customer) {
        this.orderNumber = orderNumber;
        this.orderName = orderName;
        this.customer = customer;
        this.status = OrderStatus.PENDING;
        this.createdAt = LocalDateTime.now();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void updateStatus(OrderStatus newStatus) {
        if (newStatus != null) {
            this.status = newStatus;
        }
    }

    public void printSummary() {
        System.out.println("Order #" + orderNumber + " - " + orderName);
        System.out.println("Customer: " + customer.getName() + " (ID: " + customer.getCustomerId() + ")");
        System.out.println("Status: " + status);
        System.out.println("Created at: " + createdAt);
        System.out.println("Items:");
        System.out.println("--------------------------------------------");
    }

    public void addItem(Item item) {
        // This method can be implemented to add items to the order
        // For now, it's a placeholder
        System.out.println("Item added to order: " + item.getItemName());
        
    }
}
