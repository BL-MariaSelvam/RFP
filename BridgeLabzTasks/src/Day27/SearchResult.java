package Day27;

public class SearchResult {
	private String addressBookName;
	private Contact contact;
	
	public SearchResult(String addressBookName, Contact contact) {
		super();
		this.addressBookName = addressBookName;
		this.contact = contact;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public String getAddressBookName() {
		// TODO Auto-generated method stub
		return addressBookName;
	}
	
	

}
