package main.java.com;

import java.util.HashMap;
import java.util.Map;
import java.io.File;

/**
 * This class is both a client class and a class that maps 
 * {@link Customer} and {@link Products} in a map implementation. 
 * It will print out a list of all purchases, a list of product inventory, 
 * and a list of a customer's final bill to {@link System.out}. 
 * It search adds {@link Customer} instances and {@link Product}
 * instances by their respective id.
 * @author Carson Fujita
 * @author Evin Park
 * @since 1.0
 */
public class Purchases {

	/**
	 * A {@link java.util.Map Map} of {@link Customer customers} by an Integer (ID) value.
	 * The ID is the same as it's respective {@link Customer#getCustomerID() customerID} 
	 * for every instance within this map.
	 * @author Carson Fujita
	 * @since 1.0
	 */
	private Map<Integer, Customer> customers;

	/**
	 * A {@link java.util.Map Map} of {@link Product products} by a Integer (ID) value.
	 * The ID is the same as it's respective {@link Product#getProductID() productID}
	 * for every instance within this map.
	 * @author Carson Fujita
	 * @since 1.0
	 */
	private Map<Integer, Product> products;
	
	/**
	 * An empty instance of {@link Purchases}
	 * @author Evin Park
	 */
	public Purchases() {
		customers = new HashMap<>();
		products = new HashMap<>();
	}

	/**
	 * Prints the {@link #products product}'s {@link Product#getTotalPurchases() total purchases} of this instance
	 * to {@link System.out} by each {@link Product} instance within.
	 * @author Evin Park
	 * @since 1.0
	 * @see Product#getTotalPurchases()
	 * @see #products
	 */
	public void printProductInventory() {
		if(products.isEmpty()) {
			System.out.println("No Products");
			return;
		}
		
		for(Map.Entry<Integer, Product> entry : products.entrySet()) {
			Product p = entry.getValue();
			System.out.printf("ProductID %d -> %s (Total Purchased: %d)%n",
                    p.getProductID(), p.getProductName(), p.getTotalPurchases());
		}
	}
	
	/**
	 * Prints every instance of {@link Customer} within {@link #customers}
	 * and invokes their {@link Customer#getTotalBill()} function to neatly
	 * print to {@link System.out}
	 * @author Evin Park
	 * @since 1.0
	 * @see Customer#getTotalBill()
	 * @see #customers
	 */
	public void printFinalBill() {
		if(customers.isEmpty()) {
			System.out.println("No Customers");
			return;
		}
		
		for(Map.Entry<Integer, Customer> entry : customers.entrySet()) {
			Customer c = entry.getValue();
			System.out.printf("CustomerID %d -> %s %s owes $%.2f%n",
					c.getCustomerID(), c.getFirstName(), c.getLastName(), c.getTotalBill());
		}
	}

	/**
	 * Returns the {@link Customer} instance with the matching ID
	 * @param customerID the specified ID
	 * @return the {@link Customer} instance that matches specified ID
	 * @throws IllegalArgumentException when no such customer exists within {@link #customers}
	 * @author Evin Park
	 * @since 1.0
	 * @see #customers
	 * @see Customer
	 */
	public Customer getCustomer(Integer customerID) throws IllegalArgumentException{
		Customer c = customers.get(customerID);
        if (c == null)
            throw new IllegalArgumentException("No customer found with ID: " + customerID);
        return c;	
    }

	/**
	 * Returns the {@link Product} instance that matches the specified ID
	 * @param productID the specified ID
	 * @return the matching {@link Product} instance
	 * @throws IllegalArgumentException when no such product exists within {@link #products}
	 * @author Evin Park
	 * @since 1.0
	 * @see #products
	 * @see Product
	 */
	public Product getProduct(Integer productID) throws IllegalArgumentException {
        Product p = products.get(productID);
        if (p == null)
            throw new IllegalArgumentException("No product found with ID: " + productID);
        return p;
    }

	/**
	 * Adds the specified {@link Product} instance to {@link #products}. 
	 * This does not support {@code Product}'s with duplicate IDs.
	 * @param product the specified {@link Product}
	 * @throws IllegalArgumentException if the {@link Product#getProductID() product ID} prevents it from being stored in this map
	 * @throws NullPointerException when the {@link Product#getProductID() product ID} or {@link Product} is null
	 * @throws ClassCastException when the class of the product prevents it from being stored in {@link #products}
	 * @author Evin Park
	 * @since 1.0
	 * @see #products
	 * @see Product#getProductID()
	 */
	public void addProduct(Product product)throws IllegalArgumentException, NullPointerException, ClassCastException {
		//TODO
		// See https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#put-K-V-
		// add handling for UnsupportedOperationException... 
		if (product == null)
            throw new NullPointerException("Product or product ID cannot be null.");

        if (products.containsKey(product.getProductID()))
            throw new IllegalArgumentException("Duplicate product ID: " + product.getProductID());

        try {
            products.put(product.getProductID(), product);
        } catch (UnsupportedOperationException e) {
            System.err.println("Map does not support put operation: " + e.getMessage());
        }
	}
	
	/**
	 * Adds the specified {@link Customer} instance to {@link #customers}. 
	 * This does not support {@code Customer}'s with duplicate IDs.
	 * @param product the specified {@link Customer}
	 * @throws IllegalArgumentException if the {@link Customer#getCustomerID() customer ID } prevents it from being stored in this map
	 * @throws NullPointerException when the {@link Customer#getCustomerID() customer ID} or {@link Customer} is null
	 * @throws ClassCastException when the class of the product prevents it from being stored in {@link #customer}
	 * @author Evin Park
	 * @since 1.0
	 * @see #customers
	 * @see Customer#getCustomerID()
	 */
	public void addCustomer(Customer customer)throws IllegalArgumentException, NullPointerException, ClassCastException {
		//TODO
		// See https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#put-K-V-
		// add handling for UnsupportedOperationException... 
		if (customer == null)
            throw new NullPointerException("Customer or customer ID cannot be null.");

        if (customers.containsKey(customer.getCustomerID()))
            throw new IllegalArgumentException("Duplicate customer ID: " + customer.getCustomerID());

        try {
            customers.put(customer.getCustomerID(), customer);
        } catch (UnsupportedOperationException e) {
            System.err.println("Map does not support put operation: " + e.getMessage());
        }
	}
	
	public Map<Integer, Customer> getCustomers() {
		return customers;
	}
	
	public Map<Integer, Product> getProducts() {
		return products;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File inputFile = new File("Sales.txt");
	    Reader reader = new Reader(inputFile);
	    Purchases storePurchases = reader.read();

	    System.out.println("Final Customer Bills");
	    storePurchases.printFinalBill();

	    System.out.println("\nProduct Inventory");
	    storePurchases.printProductInventory();
	}

}
