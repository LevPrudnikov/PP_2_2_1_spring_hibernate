package hiber.dao;

import hiber.model.User;

import javax.persistence.TypedQuery;
import java.util.List;

public interface UserDao {
   void add(User user);

   void update(User user);
   List<User> listUsers();
   List<User> getUserWithCar(String model, int series);
}
