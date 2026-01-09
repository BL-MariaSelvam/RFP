package Day22;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		AddressBook addressBook=new AddressBook();
		
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
		addressBook.displayContacts();
		
		
	} 

}
