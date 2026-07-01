package repository;

import model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserRepository {


     public void save(User user);

     public User findById(int id);

     public List<User> findAll();
}
