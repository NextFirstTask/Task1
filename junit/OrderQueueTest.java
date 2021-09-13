package Junit;

import org.junit.jupiter.api.Test;

import Service.Order;
import Service.OrderQueue;

class OrderQueueTest {

	@Test
	void testOrderQueue() {
		var OrderQueue = new OrderQueue(null);
		OrderQueue.getTopOrder();
	}

	Order order = new Order("ball", 1, 1);

	@Test
	void testAddOrder() {

		OrderQueue orderqueue = new OrderQueue(null);
		orderqueue.addOrder(order);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	void testSize() {
		OrderQueue orderqueue = new OrderQueue(null);
		equals(orderqueue.size() == 1);
	}

	@Test
	void testGetTopOrder() {
		var OrderQueue = new OrderQueue(null);
		OrderQueue.getTopOrder();
	}

}
