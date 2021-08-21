package edu.escuelaing.lab1.service;

import edu.escuelaing.lab1.data.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceHashMap implements UserService {

    private HashMap<String,User> userRepository=new HashMap<>();

    @Override
    public User create(User user) {

        userRepository.put(user.getId(),user);
        return user;
    }

    @Override
    public User findById(String id) {

        return userRepository.get(id);
    }

    @Override
    public HashMap<String,User> all() {
        return userRepository;
    }

    @Override
    public Boolean deleteById(String id) {
        userRepository.remove(id);
        return true;
    }

    @Override
    public User update(User user, String userId) {
        user.setId(userId);
        userRepository.put(user.getId(),user);
        return user;
    }
}
