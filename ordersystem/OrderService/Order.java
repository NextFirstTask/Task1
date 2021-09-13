package OrderService;

public class Order {

	private int orderId;
	private String itemName;
	private int priority;
	private double amount;

	public Order(int orderId, String itemName, int priority, double amount) {
		this.orderId = orderId;
		this.itemName = itemName;
		this.priority = priority;
		this.amount = amount;

	}

	public int getOrderId() {
		return orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPriority() {
		return priority;
	}

	public Double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		String orderDetails = String.format("orderID=%d; itemName =%s; priority =%d;  amount =%f;", orderId, itemName,
				priority, amount);
		return orderDetails;
	}
}