package Day27;

import java.util.Objects;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String mobile;
	private String email;
	public Contact(String firstName, String lastName, String address, String city, String state, String zipCode,
			String mobile, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.mobile = mobile;
		this.email = email;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
	@Override
	public int hashCode() {
		return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return firstName.equalsIgnoreCase(other.firstName) && lastName.equalsIgnoreCase(other.lastName);
	}
	
	
	@Override
	public String toString() {
	    return "Contact {" +
	            "FirstName='" + firstName + '\'' +
	            ", LastName='" + lastName + '\'' +
	            ", Address='" + address + '\'' +
	            ", City='" + city + '\'' +
	            ", State='" + state + '\'' +
	            ", ZipCode='" + zipCode + '\'' +
	            ", Mobile='" + mobile + '\'' +
	            ", Email='" + email + '\'' +
	            '}';
	}
	
	public static Contact fromString(String line) {
	    String[] data = line.split(",");
	    return new Contact(
	            data[0], data[1], data[2],
	            data[3], data[4], data[5],
	            data[6], data[7]
	    );
	}

}
