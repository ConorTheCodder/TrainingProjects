import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.*;

public class CustomerStorage {
    private final Map<String, Customer> storage;
    private static final Logger log = LogManager.getLogger(CustomerStorage.class);

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;
        final int COMPONENTS_STANDARD_LENGTH = 4;

        String[] components = data.split("\\s+");
        if (components.length != COMPONENTS_STANDARD_LENGTH) {
            log.log(Level.ERROR, "Некорректное количество введённых элементов.");
            throw new InvalidSizeOfElementsException("Некорректное количество введённых элементов.");
        }

        if (!isValidPhoneNumber(components[INDEX_PHONE])) {
            log.log(Level.ERROR, "Некорректно введён номер телефона.");
            throw new InvalidPhoneNumberException("Некорректно введён номер телефона.");
        }

        if (!isValidEmail(components[INDEX_EMAIL])) {
            log.log(Level.ERROR, "Некорректно введён электронный адрес.");
            throw new InvalidEmailNameException("Некорректно введён электронный адрес.");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^(?:\\+7|8)\\s?\\(?\\d{3}\\)?\\s?\\d{3}\\d{2}\\d{2}$");
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}