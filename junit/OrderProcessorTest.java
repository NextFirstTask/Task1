package Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Service.Order;
import Service.OrderProcessor;
import Service.OrderQueue;

class OrderProcessorTest {

	@Test
	void testProcessOrder() {

		String ball = null;
		Order order = new Order(ball, 1, 23445);
		// assemble
		OrderQueue orderqueue = new OrderQueue(order);
		OrderProcessor OrderProcessorTest = new OrderProcessor();
		orderqueue.addOrder(order);
		Order orderqueueTrue = OrderProcessorTest.processOrder(orderqueue);
		assertTrue(orderqueueTrue == order);

	}

}
