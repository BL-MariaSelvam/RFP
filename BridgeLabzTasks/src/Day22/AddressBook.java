package Day22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook {
	
	
	private List<Contact> contacts=new ArrayList<>();
	
	public List<Contact> getContacts() {
		return contacts;
	}
	public void addContact(Contact contact) {
		
		boolean duplicates=contacts.stream().anyMatch(existing->existing.equals(contact));
		if(duplicates) {
			System.out.println("Duplicate Entry not allowed");
		}
			
		else{
			contacts.add(contact);
			System.out.println("Contact Details added");
		}
		
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

	public void editContact(String fName, Contact updatedContact) {
		boolean found=false;
		for(Contact contact:contacts) {
			if(fName.equals(contact.getFirstName())){
				contact.setFirstName(updatedContact.getFirstName());
				contact.setLastName(updatedContact.getLastName());
				contact.setAddress(updatedContact.getAddress());
				contact.setCity(updatedContact.getCity());
				contact.setState(updatedContact.getState());
				contact.setZipCode(updatedContact.getZipCode());
				contact.setMobile(updatedContact.getMobile());
				contact.setEmail(updatedContact.getEmail());
				found=true;
				break;
			}
		}
		if(found==true)
		{
			System.out.println("Contact Details updated");
		}
		else {
			System.out.println("Record not found");
		}
	}

	public void deleteContact(String firName) {
		Iterator<Contact> contact=contacts.iterator();
		boolean flag=false;
		
		while(contact.hasNext()) {
			if(contact.next().getFirstName().equalsIgnoreCase(firName)) {
				contact.remove();
				flag=true;
			}
			else {
				
				flag=false;
			}
		}
		if(flag==true)
		System.out.println("Contact removed");
		else
			System.out.println("Record not found");
		
	}
	
	
	
		
	}
