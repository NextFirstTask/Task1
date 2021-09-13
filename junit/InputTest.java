package Junit;

import org.junit.jupiter.api.Test;

import Service.OrderProcessor;
import Service.OrderQueue;

class InputTest {

	OrderProcessor Orderprocessor = new OrderProcessor();

	@Test
	void testMain() {

		var OrderQueue = new OrderQueue(Orderprocessor);
		OrderQueue.getTopOrder();

	}

}
