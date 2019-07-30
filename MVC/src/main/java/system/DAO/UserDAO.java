package system.DAO;

import org.springframework.stereotype.Repository;
import system.model.User;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDAO {

    private List<User> user = Arrays.asList(new User("Admin", "pas1"), new User("User", "pas2"));

    public List<User> getAllUser() {
        return user;
    }
}
