package Day22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		Map<String, AddressBook> addressBookMap=new HashMap<>();
		
		do {
			System.out.println("AddressBooks Menu");
			System.out.println("1.Add AddressBook");
			System.out.println("2.View AddressBook");
			System.out.println("3.Exit");
			System.out.println("Enter the option from Menu");
			int systemOption=sc.nextInt();
			
			switch(systemOption) {
			case 1:
				System.out.println("Enter AddressBook Details");
				System.out.println("Enter addressBookname" );
				String addressBookName=sc.next();
				if(addressBookMap.containsKey(addressBookName)) {
					System.out.println("Key already exists");
				}
				else {
					addressBookMap.put(addressBookName, new AddressBook());
					System.out.println("AddressBook is added");
				}
				break;
			case 2:
				System.out.println("Address Book Details");
				for(String name:addressBookMap.keySet()) {
					System.out.println(name);
				}
				System.out.println("Enter the AddressBook Name");
				String addBookName=sc.next();

				AddressBook selectedBookName=addressBookMap.get(addBookName);
				if(selectedBookName==null) {
					System.out.println("No addressBook found with this name");
				}
				else 
					addressBookMenu(sc,selectedBookName);
				break;
			case 3:
				System.out.println("Exit NOw");
				return;
			default:
				System.out.println("No option selected");
				break;
			}
			
		}while(true);
	}
		
		private static void addressBookMenu(Scanner sc,AddressBook addressBook) {
		
		do {
			System.out.println("Address Book Menu");
			System.out.println("1.Add Contact");
			System.out.println("2.View Contact");
			System.out.println("3.Edit contact");
			System.out.println("4.Delete Contact");
			System.out.println("5.Exit");
			System.out.println("Enter the option from Menu");
			int option=sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Enter Contact Details");
				System.out.println("Enter firstname" );
				String firstName=sc.next();
				
				System.out.println("Enter lastname" );
				String lastName=sc.next();
				System.out.println("Enter address" );
				String address=sc.next();
				System.out.println("Enter state" );
				String state=sc.next();
				System.out.println("Enter city" );
				String city=sc.next();
				System.out.println("Enter zipCode" );
				String zipCode=sc.next();
				System.out.println("Enter mobile" );
				String mobile=sc.next();
				System.out.println("Enter email" );
				String email=sc.next();
				
				Contact contact=new Contact(firstName,lastName,address,city,state,zipCode,mobile,email);
				addressBook.addContact(contact);
				break;
			case 2:
				System.out.println("Contact Details");
				addressBook.displayContacts();
				break;
			case 3:
				System.out.println("Update Details");
				System.out.println("Enter the firstName to update person Details");
				String fName=sc.next();
				System.out.println("Enter updated lastname" );
				String updatedlastName=sc.next();
				System.out.println("Enter updated address" );
				String updatedaddress=sc.next();
				System.out.println("Enter updated state" );
				String updatedstate=sc.next();
				System.out.println("Enter updated city" );
				String updatedcity=sc.next();
				System.out.println("Enter updated zipCode" );
				String updatedzipCode=sc.next();
				System.out.println("Enter updated mobile" );
				String updatedmobile=sc.next();
				System.out.println("Enter updated email" );
				String updatedemail=sc.next();
				Contact updatedContact=new Contact(fName,updatedlastName,updatedaddress,updatedstate,updatedcity,updatedzipCode,updatedmobile,updatedemail);
				addressBook.editContact(fName,updatedContact);
				break;
			case 4:
				System.out.println("Deletion");
				System.out.println("Enter the firstName to delete person Details");
				String firName=sc.next();
				addressBook.deleteContact(firName);
				break;
			case 5:
				System.out.println("Returning to home");
				return;
			default:
				System.out.println("No option");
				break;
			}
			
			
		}while(true);
		}

}