package UserRegistrationService;

@FunctionalInterface
public interface UserRegistrationInterface {
    boolean validateEntries(String input) throws UserRegistrationException;
}
