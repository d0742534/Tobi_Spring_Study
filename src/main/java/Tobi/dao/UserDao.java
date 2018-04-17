package Tobi.dao;
import java.util.List;
import Tobi.domain.*;

public interface UserDao {

    void add(User user);

    User get(String id);

    List<User> getAll();

    void deleteAll();

    int getCount();

}