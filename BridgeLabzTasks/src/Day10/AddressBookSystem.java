package Day10;

import java.util.HashMap;
import java.util.Set;

public class AddressBookSystem {
	HashMap<String, AddressBook> addressBookSystem=new HashMap<>();

	public void addAddressBook(String addressBookName) {
		if(addressBookSystem.containsKey(addressBookName)) {
			System.out.println("AddressBook already had this name"+addressBookName);
		}
		else {
			addressBookSystem.put(addressBookName, new AddressBook());
			System.out.println("AddressBook is saved successfully");
		}
		
	}

	public AddressBook getAddressBook(String selectedName) {
		// TODO Auto-generated method stub
		return addressBookSystem.get(selectedName);
	}
	
	public void showAddressBooks() {
        if (addressBookSystem.isEmpty()) {
            System.out.println("No AddressBooks available");
        } else {
            Set<String> names = addressBookSystem.keySet();
            System.out.println("Available AddressBooks:");
            for (String name : names) {
                System.out.println("- " + name);
            }
        }
	
	
	

}
}
