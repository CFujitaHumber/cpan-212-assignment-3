package main.java.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class provides a way to read {@link Purchases} from a specified file
 * @author Carson Fujita
 * @author Evin Park
 * @since 1.0
 */
public class Reader {

	/**
	 * The specific file that this {@code Reader} will
	 * read from to parse a {@link Purchases} instance from.
	 * @author Carson Fujita
	 * @since 1.0
	 * @see #getFile()
	 * @see #setFile(File)
	 */
	private File file;

	/**
	 * Creates a reader instance from a specified file that
	 * this instance will read from in {@link #read()}
	 * @author Carson Fujita
	 * @since 1.0
	 * @param file the specified file
	 * @see #file
	 * @see #read()
	 */
	public Reader(File file) {
		this.file = file;
	}
	

	/**
	 * Reads from this instance's {@link #file} to return a 
	 * new {@link Purchases} instance.
	 * @return new Purchases instance.
	 * @author Evin Park
	 * @since 1.0
	 * @see #file
	 */
	public Purchases read() {
		Purchases purchases = new Purchases();
		
		if(file == null || !file.exists()) {
		System.err.println("Error: File not found - " + (file != null ? file.getPath() : "null"));
		return purchases;
		}
		try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                if (parts.length < 7) {
                    System.err.println("Skipping invalid line: " + line);
                    continue;
                }

                try {
                    int customerID = Integer.parseInt(parts[0]);
                    String firstName = parts[1];
                    String lastName = parts[2];
                    int productID = Integer.parseInt(parts[3]);
                    String productName = parts[4];
                    float price = Float.parseFloat(parts[5]);
                    int quantity = Integer.parseInt(parts[6]);

                    
                    Product product = null;
                try {
                    	product = purchases.getProduct(productID);
                    } catch (IllegalArgumentException e) {
                    	product = new Product(productID);
                        product.setProductName(productName);
                        product.setPrice(price);
                        purchases.addProduct(product);
                    }
                    product.addToTotalPurchases(quantity);


                    Customer customer = null;
                    try{
                    	customer = purchases.getCustomer(customerID);
                    } catch (IllegalArgumentException e) {
                    	customer = new Customer(customerID);
                        customer.setFirstName(firstName);
                        customer.setLastName(lastName);
                        purchases.addCustomer(customer);
                    }
                    customer.addToBill(price * quantity);

                } catch (NumberFormatException e) {
                    System.err.println("Skipping malformed numeric data: " + line);
                } catch (Exception e) {
                    System.err.println("Error processing line: " + line);
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Could not read file: " + e.getMessage());
        }

        return purchases;
	}


	/**
	 * Getter method for this {@code Reader}'s file
	 * @return the {@link #file}
	 * @author Carson Fujita
	 * @since 1.0
	 * @see #file
	 * @see #setFile(File)
	 */
	public File getFile() {
		return file;
	}

	/**
	 * Setter method for this {@code Reader}'s file.
	 * @param file the {@link #file} to set
	 * @author Carson Fujita
	 * @since 1.0
	 * @see #file
	 * @see #getFile()
	 */
	public void setFile(File file) {
		this.file = file;
	}

}
