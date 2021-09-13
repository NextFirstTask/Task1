package OrderService;

public class CustomerDetails {

	private String name;
	private String address;
	private String phone;
	private String email;

	public CustomerDetails(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String processCustomerDetails() {
		String customerDetails = String.format(
				"customer name=%s; customer address =%s; customer phone =%s; customer email =%s;", name, address, phone,
				email);
		return customerDetails;
	}
}
