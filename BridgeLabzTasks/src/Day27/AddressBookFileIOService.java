package Day27;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBookFileIOService {

    private static final String DIRECTORY = "C:\\Users\\sathi\\OneDrive\\Desktop\\selva\\bridgelabz\\AddressBookData";

    // Write AddressBook to File
    public static void writeAddressBook(String bookName, AddressBook addressBook) {

        try {
            Files.createDirectories(Paths.get(DIRECTORY));

            Path filePath = Paths.get(DIRECTORY, bookName + ".txt");

            List<String> contactLines = addressBook.getContacts()
                    .stream()
                    .map(Contact::toString)
                    .collect(Collectors.toList());

            Files.write(
                    filePath,
                    contactLines,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            );

            System.out.println("AddressBook saved to file successfully");

        } catch (IOException e) {
            System.out.println("Error writing AddressBook to file");
            e.printStackTrace();
        }
    }


    // Read AddressBook from File
    public static AddressBook readAddressBook(String bookName) {

        AddressBook addressBook = new AddressBook();
        Path filePath = Paths.get(DIRECTORY, bookName + ".txt");

        if (!Files.exists(filePath)) {
            System.out.println("No file found for AddressBook: " + bookName);
            return addressBook;
        }

        try (Stream<String> lines = Files.lines(filePath)) { // auto closes
            lines.map(Contact::fromString)
                 .forEach(addressBook::addContact);

            System.out.println("AddressBook loaded from file");

        } catch (IOException e) {
            System.out.println("Error reading AddressBook file");
            e.printStackTrace();
        }

        return addressBook;
    }

}
