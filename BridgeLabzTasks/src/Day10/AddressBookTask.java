package Day10;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookTask {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc=new Scanner(System.in);
		AddressBook addressBook=new AddressBook();
		AddressBookSystem addressbookSystem=new AddressBookSystem();
		
		
		do {
			System.out.println("AddressBook Details");
			System.out.println("1.Add AddressBook");
			System.out.println("2.Contact details Menu");
			System.out.println("3.View AddressBook");
			System.out.println("4.Exit AddressBook");
			System.out.println("Enter the option you  want");
			int option1=sc.nextInt();
			switch(option1) {
			
			case 1:
				System.out.println("Add AddressBook");
				System.out.println("Enter Address Book name");
				String addressBookName=sc.next();
				addressbookSystem.addAddressBook(addressBookName);
				break;
				
			case 2:
                System.out.print("Enter AddressBook name to select: ");
                String selectedName = sc.next();

                AddressBook selectedBook = addressbookSystem.getAddressBook(selectedName);

                if (selectedBook != null) {
                    addressBookMenu(selectedBook, sc);
                } else {
                    System.out.println("AddressBook not found!");
                }
                break;

            case 3:
            	addressbookSystem.showAddressBooks();
                break;

            case 4:
                System.out.println("Exiting...");
                System.exit(0);

			default:
				System.out.println("Invalid Option");
			}
			}while(true);
		
	}
		
private static void addressBookMenu(AddressBook addressBook, Scanner sc) {

        while (true) {
		System.out.println("Contact Details");
		System.out.println("1.Add Contacts");
		System.out.println("2.View Contacts");
		System.out.println("3.Update Contacts");
		System.out.println("4.Delete Contacts");
		System.out.println("5.Exit Contacts");
		
		System.out.println("Enter the option you  want");
		int option=sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Emp_firstName: ");
			String firstName=sc.next();
			System.out.println("Emp_lastName: ");
			String lastName=sc.next();
			System.out.println("Emp_Mobile: ");
			String mobile=sc.next();
			 System.out.println("Emp_Email");
		    String email=sc.next();
		    System.out.println("Emp_city ");
			String city=sc.next();
			 System.out.println("Emp_state: ");
			String state=sc.next();
			System.out.println("Emp_address: ");
			String address=sc.next();
			 System.out.println("Emp_zipCode: ");
			String zipCode=sc.next();
			
			Contacts contact1=new Contacts(firstName, lastName, mobile, email, city, state, address, zipCode);
			contact1.contactInfo();

			addressBook.addContacts(contact1);
			break;
		case 2:
			addressBook.showContactDetails();
			break;
		case 3:
			System.out.println("Update Details");
			System.out.println("Emp_firstName: ");
			String updatedfirstName=sc.next();
			System.out.println("Emp_lastName: ");
			String updatedlastName=sc.next();
			System.out.println("Emp_Mobile: ");
			String updatedmobile=sc.next();
			 System.out.println("Emp_Email");
		    String updatedemail=sc.next();
		    System.out.println("Emp_city ");
			String updatedcity=sc.next();
			 System.out.println("Emp_state: ");
			String updatedstate=sc.next();
			System.out.println("Emp_address: ");
			String updatedaddress=sc.next();
			 System.out.println("Emp_zipCode: ");
			String updatedzipCode=sc.next();
			Contacts updated=new Contacts(updatedfirstName, updatedlastName, updatedmobile, updatedemail, updatedcity, updatedstate, updatedaddress, updatedzipCode);
			addressBook.updateContacts(updated);
			break;
		case 4:
			System.out.println("Delete Details");
			System.out.println("Enter Emp_firstName to delete ");
			String deletedfirstName=sc.next();
			addressBook.deleteContacts(deletedfirstName);
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		}
}
}