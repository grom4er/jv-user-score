package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (String value : records) {
            if (value.substring(0, value.indexOf(':')).equals(email)) {
                return Integer.parseInt(value.substring(value.indexOf(':') + 1));
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
