package Service;

import java.util.Random;

public class OrderIdGenerator {

	public static int orderID() {

		Random orderid = new Random();
		int orderId = orderid.nextInt(100) + 1;
		return orderId;

	}

}
