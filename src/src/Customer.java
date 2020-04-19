package src;

public class Customer {
private int customerID;
public Customer(int customerID, String firstName, double credit, String lastName) {
	super();
	this.customerID = customerID;
	this.firstName = firstName;
	this.credit = credit;
	this.lastName = lastName;
}
private String firstName;
private double credit;
private String lastName; 
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getCredit() {
	return credit;
}
public void setCredit(double credit) {
	this.credit = credit;
}
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


}
