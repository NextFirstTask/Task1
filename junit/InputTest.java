package junit;
import org.junit.jupiter.api.Test;

import ordersystem.OrderProcessor;
import ordersystem.OrderQueue;

class InputTest {
	
	OrderProcessor Orderprocessor = new OrderProcessor();
	
	@Test
	void Check_Main() {
		var OrderQueue= new OrderQueue();
		OrderQueue.getTopOrder();
	}

}
