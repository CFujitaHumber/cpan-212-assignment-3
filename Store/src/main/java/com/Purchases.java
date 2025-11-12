package main.java.com;

import java.util.Map;

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
		//TODO initialize fields
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
		//TODO make this do something
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
		//TODO Do not go gentle into that good night, 
		// Old age should burn and rave at close of day;
		// Rage, rage against the dying of the light
		// ~ Dylan Thomas 
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
		return null; //TODO the fitness gram pacer test is a multistage aerobic capacity test that... and i forgot the rest of the copypasta...
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
	public Product getProduct(Integer productID) throws IllegalArgumentException{
		return null; // TODO I don't know any more copypastas that are work appropriate. 
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
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
