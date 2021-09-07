package junit;

import org.junit.jupiter.api.Test;

import ordersystem.Order;
import ordersystem.OrderQueue;

class OrderQueueTest {

	private Order order;

	@Test
	void Add_Order_To_Queue() {
		OrderQueue orderqueue= new OrderQueue();
		orderqueue.addOrder(order);
	}

	@Test
	void check_Cart_Size() {
		OrderQueue orderqueue= new OrderQueue();
		equals(orderqueue.size()==1);
		System.out.println("cart is not empty");
		equals(orderqueue.size()==0);
		System.out.println("cart is empty");
	}

	@Test
	void Get_Top_Order_of_Queue() {
		var OrderQueue= new OrderQueue();
		OrderQueue.getTopOrder();
	}

}
