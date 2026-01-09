package Day22;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	
	private List<Contact> contacts=new ArrayList<>();
	
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	
	public void displayContacts() {
		
		for(Contact contact:contacts) {
			System.out.println("firstName"+contact.getFirstName());
			System.out.println("lastName"+contact.getLastName());
			System.out.println("Address"+contact.getAddress());
			System.out.println("City"+contact.getCity());
			System.out.println("State"+contact.getState());
			System.out.println("ZipCode"+contact.getZipCode());
			System.out.println("Mobile"+contact.getMobile());
			System.out.println("Email"+contact.getEmail());
		}
	}

}
