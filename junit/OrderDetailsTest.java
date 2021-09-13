package Junit;

import org.junit.jupiter.api.Test;

import ordersystem.OrderDetails;

class OrderDetailsTest {

	OrderDetails orderDetails = new OrderDetails();
	@SuppressWarnings("unused")
	private Object OrderDetails;

	@SuppressWarnings("unlikely-arg-type")
	@Test
	void testCartSize() {
		orderDetails.orderqueue(orderDetails);
		equals(orderDetails.cartSize == 1);
	}

}
