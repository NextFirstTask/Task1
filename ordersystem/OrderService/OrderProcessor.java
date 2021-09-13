package OrderService;

public class OrderProcessor implements OrderProcessorService {
	

	@Override
	public Order processOrder(OrderService orderqueue) {
		try {
			return orderqueue.getTopOrder();

		} catch (NullPointerException queueIsEmpty) {
			queueIsEmpty.printStackTrace();
			return null;
		}
	}
}
