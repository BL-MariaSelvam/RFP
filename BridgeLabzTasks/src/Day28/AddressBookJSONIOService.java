package Day28;


import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.*;
import java.util.List;

public class AddressBookJSONIOService {
    private static final String DIRECTORY = "C:\\Users\\sathi\\OneDrive\\Desktop\\selva\\bridgelabz\\AddressBookJSON";

    public static void writeToJSON(String bookName, AddressBook addressBook) {
        try {
            Files.createDirectories(Paths.get(DIRECTORY));
            Path filePath = Paths.get(DIRECTORY, bookName + ".json");
            try (Writer writer = Files.newBufferedWriter(filePath)) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                gson.toJson(addressBook.getContacts(), writer);
                System.out.println("Saved to JSON successfully");
            }
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static AddressBook readFromJSON(String bookName) {
        AddressBook addressBook = new AddressBook();
        Path filePath = Paths.get(DIRECTORY, bookName + ".json");
        if (!Files.exists(filePath)) {
            System.out.println("JSON file not found");
            return addressBook;
        }
        try (Reader reader = Files.newBufferedReader(filePath)) {
            Gson gson = new Gson();
            Type contactListType = new TypeToken<List<Contact>>() {}.getType();
            List<Contact> contacts = gson.fromJson(reader, contactListType);
            contacts.forEach(addressBook::addContact);
            System.out.println("Loaded from JSON successfully");
        } catch (Exception e) { e.printStackTrace(); }
        return addressBook;
    }
}

