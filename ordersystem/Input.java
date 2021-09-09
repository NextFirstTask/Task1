package ordersystem;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {


	static OrderProcessor orderProcessor = new OrderProcessor();

	public static void main(String args[]) throws IOException {

		Pattern pattern = Pattern.compile("^(\\d|\\w)+$");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the customer name:");
		String name = sc.nextLine();
		Matcher matcherName = pattern.matcher(name);

		boolean validNameCheck = matcherName.find();
		if (validNameCheck) {
			throw new IOException("Invalid customer name.");
		}

		System.out.println("Enter the customer address:");
		String address = sc.nextLine();
		Matcher matcherAddress = pattern.matcher(address);
		boolean validAddressCheck = matcherAddress.find();
		if (address == null) {
			throw new IOException("Invalid Address.");
		} else if (address.isEmpty()) {
			throw new IOException("Invalid Address.");
		} else if (validAddressCheck) {
			throw new IOException("Invalid customer Address.");
		}

		System.out.println("Enter the customer phone:");
		int phone = sc.nextInt();
		sc.nextLine();
		try {

			int checkPhone = phone;
		} catch (NumberFormatException e) {
			System.out.println("Input is not a valid integer" + e);
		}

		System.out.println("Enter the customer email:");
		String email = sc.nextLine();
		final Pattern validEmailAddress = Pattern.compile("^(.+)@(.+)$");
		Matcher matcherEmail = validEmailAddress.matcher(email);
		boolean Valid_Email = matcherEmail.find();
		if (!Valid_Email) {
			throw new IOException("Invalid customer email.");
		}

		CustomerDetails customerDetails = new CustomerDetails(name, address, phone, email);

		System.out.println("Cart Implementation using priority queue\n");

		char ch;
		OrderQueue orderqueue = new OrderQueue();

		do {
			System.out.println("1. insert item into the cart");
			System.out.println("2. Display Customer Details");
			System.out.println("3. Process the higest priority Item");
			String input = sc.next();

			if (input.equals("1")) {
				System.out.println("Enter item name ");
				String itemName = sc.next();

				Matcher matcher = pattern.matcher(itemName);
				boolean validItemName = matcher.find();
				if (itemName == null) {
					throw new IOException("Invalid itemName.");
				} else if (itemName.isEmpty()) {
					throw new IOException("Invalid itemName.");
				} else if (validItemName) {
					throw new IOException("Invalid itemName.");
				}

				System.out.println("Enter Priority: oneplus-1,prime-2,other-3");
				int priority = sc.nextInt();

				try {

					int validatePriority = priority;
				} catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer" + e);
				}

				System.out.println("Enter Amount ");
				double amount = sc.nextDouble();
				try {

					double validateAmount = amount;
				} catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer" + e);
				}

				int orderid = OrderIdGenerator.orderID();

				Order order = new Order(orderid, itemName, priority, amount);

				orderqueue.addOrder(order);
				if (orderqueue == null) {
					throw new NullPointerException("No items Added");
				}

			} else if (input.equals("2")) {
				System.out.println(customerDetails.processCustomerDetails());
			}

			else if (input.equals("3")) {
				System.out.println("The Processed Item:" + orderProcessor.processOrder(orderqueue));
			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		sc.close();
	}

}
