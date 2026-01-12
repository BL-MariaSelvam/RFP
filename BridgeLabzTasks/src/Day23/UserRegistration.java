package Day23;

import java.util.function.Predicate;
import java.util.function.Consumer;

public class UserRegistration {

    public static void main(String[] args) {

        // Sample user inputs
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@gmail.com";
        String mobile = "91 9876543210";
        String password = "Password@1";

        // 1️⃣ First Name Validation
        Predicate<String> firstNameValidator =
                name -> name.matches("[A-Z][a-z]{2,}");

        // 2️⃣ Last Name Validation
        Predicate<String> lastNameValidator =
                name -> name.matches("[A-Z][a-z]{2,}");

        // 3️⃣ Email Validation
        Predicate<String> emailValidator =
                mail -> mail.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");

        // 4️⃣ Mobile Validation
        Predicate<String> mobileValidator =
                mob -> mob.matches("^[0-9]{2}\\s[0-9]{10}$");

        // 5️⃣ Password Validation
        Predicate<String> passwordValidator =
                pass -> pass.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");

        // Consumer to print result
        Consumer<String> print = System.out::println;

        // Validate and print results
        print.accept("First Name Valid: " + firstNameValidator.test(firstName));
        print.accept("Last Name Valid: " + lastNameValidator.test(lastName));
        print.accept("Email Valid: " + emailValidator.test(email));
        print.accept("Mobile Valid: " + mobileValidator.test(mobile));
        print.accept("Password Valid: " + passwordValidator.test(password));
    }
}

