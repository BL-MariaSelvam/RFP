package Day28;

import com.opencsv.bean.*;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class AddressBookCSVIOService {
    private static final String DIRECTORY = "C:\\Users\\sathi\\OneDrive\\Desktop\\selva\\bridgelabz\\AddressBookCSV";

    public static void writeToCSV(String bookName, AddressBook addressBook) {
        try {
            Files.createDirectories(Paths.get(DIRECTORY));
            Path filePath = Paths.get(DIRECTORY, bookName + ".csv");
            try (Writer writer = Files.newBufferedWriter(filePath)) {
                StatefulBeanToCsv<Contact> beanToCsv =
                        new StatefulBeanToCsvBuilder<Contact>(writer)
                        .withQuotechar('"').withSeparator(',').build();
                beanToCsv.write(addressBook.getContacts());
                System.out.println("Saved to CSV successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AddressBook readFromCSV(String bookName) {
        AddressBook addressBook = new AddressBook();
        Path filePath = Paths.get(DIRECTORY, bookName + ".csv");
        if (!Files.exists(filePath)) {
            System.out.println("CSV file not found");
            return addressBook;
        }
        try (Reader reader = Files.newBufferedReader(filePath)) {
            CsvToBean<Contact> csvToBean =
                    new CsvToBeanBuilder<Contact>(reader)
                    .withType(Contact.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<Contact> contacts = csvToBean.parse();
            contacts.forEach(addressBook::addContact);
            System.out.println("Loaded from CSV successfully");
        } catch (Exception e) { e.printStackTrace(); }
        return addressBook;
    }
}
