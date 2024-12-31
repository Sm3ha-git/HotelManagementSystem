package Project;

public class Customer extends Person {
private String customerID;

public Customer(String firstName, String lastName, int phone, String customerID) {
    super(firstName, lastName, phone);
    this.customerID =customerID;

}


public String getCustomerID() {
    return customerID;
}

public void setCustomerID(String customerID) {
    this.customerID = customerID;
}

public String toString() {
	return "Customer [customerID=" + customerID +  ", FirstName="
			+ getFirstName() + ", LastName=" + getLastName() + ", Phone()=" + getPhone() + "]";
}


}