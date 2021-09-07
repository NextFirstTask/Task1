package junit;

import org.junit.jupiter.api.Test;

import ordersystem.CustomerDetails;

class CustomerDetailsTest {

	private String name;
	private String address;
	private int phone;
	private String email;

	@Test
	void should_Create_Customer_Details() {
		CustomerDetails customerdetails = new CustomerDetails(name="John", address="Banglore", phone=67543, email="john@gmail.com");
		
	}

	

}
