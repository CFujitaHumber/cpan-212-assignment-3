package main.java.com;

/**
 * This class provides basic product data like ID, name, and price
 * @author Carson Fujita
 * @since 1.0
 */
public class Product implements Comparable<Product>{
	
	/**
	 * The Product's ID as a boxed integer
	 * @since 1.0
	 * @see #getProductID()
	 */
	private final Integer productID;

	/**
	 * The Product's name.
	 * @since 1.0
	 * @see #getProductName()
	 * @see #setProductName(String)
	 */
	private String productName;

	/**
	 * The price in CAD$ value in floating point precision.
	 * Consult your nearest war bunker if the price somehow 
	 * exceeds the maximum finite positive value a float can hold.
	 * @since 1.0
	 * @see #setPrice(Float)
	 * @see #getPrice()
	 */
	private Float price;

	/**
	 * The total purchases of this {@code Product}.
	 * @since 1.0
	 * @see #setTotalPurchases(int)
	 * @see #getTotalPurchases()
	 */
	private int totalPurchases;
	
	/**
	 * Constructor for a new Product with a permanent {@link #productID ID} value.
	 * @param productID the specified permanent ID value
	 * @see #productID
	 */
	public Product(Integer productID) {
		this.productID = productID;
	}

	@Override
	public int compareTo(Product other) {
		if(this.productID < other.productID) {
			return -1;
		} else if (this.productID > other.productID) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * @return an un-boxed {@link #productID}
	 * @see #productID
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * @return the {@link #productName}
	 * @see #setProductName(String)
	 * @see #productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the {@link #productName} to set
	 * @since 1.0
	 * @see #productName
	 * @see #getProductName()
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the {@link #price}
	 * @since 1.0
	 * @see #setPrice(Float)
	 * @see #price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the {@link #price} to set
	 * @since 1.0
	 * @see #getPrice()
	 * @see #price
	 */
	public void setPrice(Float price) {
		this.price = price;
	}	
	
	/**
	 * @return the totalPurchases
	 */
	public int getTotalPurchases() {
		return totalPurchases;
	}

	/**
	 * @param totalPurchases the totalPurchases to set
	 */
	public void setTotalPurchases(int totalPurchases) {
		this.totalPurchases = totalPurchases;
	}

	
	/** 
	 * Adds to the total number of purchases for this product. 
	 */
    public void addToTotalPurchases(int amount) {
        this.totalPurchases += amount;
    }
    
	@Override
	public String toString() {
		//I wanted to try a string builder 
		StringBuilder output = new StringBuilder();
		output.append(getClass().getSimpleName()).append("[");
		output.append("id=").append(productID).append(", ");
		output.append("name=").append(productName).append(", ");
		output.append("price=").append(price).append("]");
		return output.toString();
	}
}
