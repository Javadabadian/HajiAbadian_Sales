package src;

public class Customer {
private int customerID;
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
private String firstName;
public Customer(int customerID, String firstName) {
	super();
	this.customerID = customerID;
	this.firstName = firstName;
}

}
