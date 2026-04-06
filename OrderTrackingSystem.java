import java.util.*;


public class OrderTrackingSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "Anita Sharma", "anita@example.com", "+91-9876543210");
        Customer customer2 = new Customer(102, "Rohan Verma", "rohan@example.com", "+91-9123456780");

        Order order1 = new Order(1001, "Office Supplies", customer1);
        order1.addItem(new Item("Notebook", 5, 45.0));
        order1.addItem(new Item("Pen set", 2, 120.0));
        order1.updateStatus(OrderStatus.PROCESSING);

        Order order2 = new Order(1002, "Mobile Accessories", customer2);
        order2.addItem(new Item("Phone case", 1, 399.0));
        order2.addItem(new Item("Screen protector", 2, 199.0));
        order2.updateStatus(OrderStatus.SHIPPED);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        System.out.println("=== Order Tracking System ===");
        for (Order order : orders) {
            order.printSummary();
        }

        System.out.println("Updating order status...");
        order1.updateStatus(OrderStatus.DELIVERED);
        order1.printSummary();
    }
}
