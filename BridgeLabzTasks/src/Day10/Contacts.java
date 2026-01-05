package Day10;

public class Contacts
{
 private String firstName;
 private String lastName;
 private String mobile;
 private String email;
 private String city;
 private String state;
 private String address;
 private String zipCode;
 public Contacts(String firstName, String lastName, String mobile, String email, String city, String state,
		String address, String zipCode) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobile = mobile;
	this.email = email;
	this.city = city;
	this.state = state;
	this.address = address;
	this.zipCode = zipCode;
 }
 
 public Contacts() {
	super();
}

 public String getFirstName() {
	return firstName;
 }
 public void setFirstName(String firstName) {
	this.firstName = firstName;
 }
 public String getLastName() {
	return lastName;
 }
 public void setLastName(String lastName) {
	this.lastName = lastName;
 }
 public String getMobile() {
	return mobile;
 }
 public void setMobile(String mobile) {
	this.mobile = mobile;
 }
 public String getEmail() {
	return email;
 }
 public void setEmail(String email) {
	this.email = email;
 }
 public String getCity() {
	return city;
 }
 public void setCity(String city) {
	this.city = city;
 }
 public String getState() {
	return state;
 }
 public void setState(String state) {
	this.state = state;
 }
 public String getAddress() {
	return address;
 }
 public void setAddress(String address) {
	this.address = address;
 }
 public String getZipCode() {
	return zipCode;
 }
 public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
 }
 
 
 public void contactInfo() {
	 System.out.println("Emp_firstName: "+firstName);
	 System.out.println("Emp_LastName: "+lastName);
	 System.out.println("Emp_Mobile: "+mobile);
	 System.out.println("Emp_Email"+email);
	 System.out.println("Emp_city "+city);
	 System.out.println("Emp_state: "+state);
	 System.out.println("Emp_address: "+address);
	 System.out.println("Emp_zipCode: "+zipCode);
	
 }

}

