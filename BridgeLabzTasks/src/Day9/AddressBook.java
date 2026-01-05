package Day9;

import java.util.ArrayList;

public class AddressBook {

	private ArrayList<Contacts> contacts;

	public AddressBook() {
		contacts=new ArrayList<>();
	}

	public void addContacts(Contacts contact) {
		contacts.add(contact);
		
		System.out.println("Contact is added in a list");
		System.out.println("List size will be: "+contacts.size());
	}
	
	public void showContactDetails() {
		if(contacts.isEmpty()) {
			System.out.println("No records found");
		}
		else {
			for(Contacts con:contacts) {
				System.out.println("FirstName: "+con.getFirstName());
				System.out.println("LastName: "+con.getLastName());
				System.out.println("Mobile: "+con.getMobile());
				System.out.println("Email: "+con.getEmail());
				System.out.println("city: "+con.getCity());
				System.out.println("state: "+con.getState());
				System.out.println("ZipCode: "+con.getZipCode());
				System.out.println("Address: "+con.getAddress());
			}
		}
	}

	public void updateContacts(Contacts updated) {
		 boolean found = false;

	        for (Contacts con : contacts) {
	            if (con.getFirstName().equalsIgnoreCase(updated.getFirstName())) {
	                con.setLastName(updated.getLastName());
	                con.setMobile(updated.getMobile());
	                con.setEmail(updated.getEmail());
	                con.setCity(updated.getCity());
	                con.setState(updated.getState());
	                con.setAddress(updated.getAddress());
	                con.setZipCode(updated.getZipCode());

	                found = true;
	                System.out.println("Record updated successfully");
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Contact not found");
	        }
	}

	public void deleteContacts(String deletedfirstName) {
		boolean found = false;
		if(contacts.isEmpty()) {
			System.out.println("AddressBook is empty");
		}
		else {
			for(int i=0;i<contacts.size();i++) {
				Contacts con=contacts.get(i);
				if(con.getFirstName()==deletedfirstName) {
					contacts.remove(i);	
					 found = true;
					 break;
				}
			}
			if(found==true) {
			System.out.println("Contact is deleted");
			}
			else {
				System.out.println("Contact is not deleted");
			}
		}
	}
	
}
