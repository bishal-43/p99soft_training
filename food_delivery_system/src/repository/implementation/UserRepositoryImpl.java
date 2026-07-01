package repository.implementation;

import model.User;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private final Map<Integer, User> users = new HashMap<>();

    @Override
    public void save(User user){
        users.put(user.getId(), user);
    }

    @Override
    public User findById(int id){
        return users.get(id);
    }

    @Override
    public List<User> findAll(){
        return new ArrayList<>(users.values());
    }
}
