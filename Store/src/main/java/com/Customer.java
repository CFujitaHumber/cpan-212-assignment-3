package main.java.com;

/**
 * This class provides a object containing a basic customer with an
 * integer id. The integer is boxed for map implementation. 
 * @author Carson Fujita
 * @since 1.0 
 */
public class Customer implements Comparable<Customer> {
	
	/**
	 * The customer ID as a boxed integer
	 * @since 1.0
	 * @see #getCustomerID()
	 */
	private final Integer customerID;
	
	/**
	 * The first name value. 
	 * Some people don't have names so the default value is "NFN".
	 * Stands for "Not Applicable".
	 * Although, generally people at least have a first name...
	 * @since 1.0
	 * @see #getFirstName()
	 * @see #setFirstName(String)
	 */
	private String firstName = "NA";
	
	/**
	 * The last name value. 
	 * Some people don't have last names so the default value is "NA".
	 * Stands for "Not applicable"
	 * @since 1.0
	 * @see #getLastName()
	 * @see #setLastName(String)
	 */
	private String lastName = "NA";

	/**
	 * Constructor for a new customer with a permanent ID value.
	 * @param customerID specified permanent ID
	 * @since 1.0
	 */
	public Customer(Integer customerID) {
		this.customerID = customerID;
	}

	@Override
	public int compareTo(Customer other) {
		if(this.customerID < other.customerID) {
			return -1;
		} else if (this.customerID > other.customerID) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * Returns an un-boxed primitive value of the {@link #customerID}
	 * value.
	 * @return int customer ID
	 * @since 1.0
	 * @see #customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @return this Customer's {@link #firstName}
	 * @since 1.0
	 * @see #firstName
	 * @see #setFirstName(String)
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets this Customer's {@link #firstName} to the specified value.
	 * @param firstName the specified value
	 * @since 1.0
	 * @see #firstName
	 * @see #getFirstName()
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return this Customer's {@link #lastName}
	 * @since 1.0
	 * @see #lastName
	 * @see #setLastName(String)
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets this Customer's {@link #lastName} to the specified value.
	 * @param lastName the specified value
	 * @since 1.0
	 * @see #lastName
	 * @see #getLastName()
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		//I wanted to try a string builder 
		StringBuilder output = new StringBuilder();
		output.append(getClass().getSimpleName()).append("[");
		output.append("id=").append(customerID).append(", ");
		output.append("first name=").append(firstName).append(", ");
		output.append("last name=").append(lastName).append("]");
		return output.toString();
	}
}
